package ru.innopolis;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class WorkWithArray {


    public static Integer[] creatArray(int countElements) {
        Integer[] arrayInteger = new Integer[0];
        Set<Integer> set = new HashSet<>();
        int counter = 0;
        Random rnd = new Random();

        while (counter < countElements) {
            if (set.add(rnd.nextInt(Integer.MAX_VALUE))) {
                counter++;
            }
        }

        arrayInteger = set.toArray(new Integer[counter]);

        return arrayInteger;
    }

}
