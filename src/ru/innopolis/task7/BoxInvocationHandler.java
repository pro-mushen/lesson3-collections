package ru.innopolis.task7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.TreeSet;

public class BoxInvocationHandler implements InvocationHandler {

    private Box box;

    public BoxInvocationHandler(Box box) {
        this.box = box;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getAnnotation(Logged.class) != null) {
            try {
                return method.invoke(box, args);
            } catch (Exception e) {
                System.out.println("Logged: деление на 0!");
                Class clazz = box.getClass();
                return clazz.getMethod("getCollection").invoke(box);
            }
        } else if (method.getAnnotation(DataClear.class) != null) {
            Class clazz = box.getClass();
            clazz.getMethod("setCollection", Set.class).invoke(box, new TreeSet<Integer>());
            return null;
        } else {
            return method.invoke(box, args);
        }

    }
}
