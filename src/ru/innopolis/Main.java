package ru.innopolis;

import ru.innopolis.task3.MathBox;
import ru.innopolis.task3.WorkWithArray;
import ru.innopolis.task4.ExtendsBox.MathBoxExtends;
import ru.innopolis.task4.ObjectBox;
import ru.innopolis.task4.myExceptions.ExceptionDivider;
import ru.innopolis.task4.myExceptions.ExceptionNumeric;

public class Main {

    public static void main(String[] args) {

        Integer[] mass;

        System.out.println("------- Task 3 -------");
        MathBox mathBox = new MathBox(WorkWithArray.creatArray(4));
        MathBox mathBox2 = new MathBox(WorkWithArray.creatArray(4));

        System.out.println("mathBox.toString() = " + mathBox.toString());
        System.out.println("mathBox2.toString() = " + mathBox2.toString());

        System.out.println("Сумма элементов mathBox = " + mathBox.summator());
        System.out.println("Splitter(10) = " + mathBox.splitter(10));

        mass = mathBox.getCollectionInMass();
        MathBox mathBoxSame = new MathBox(mass);

        System.out.println("mathBox.equals(mathBox2) = " + mathBox.equals(mathBox2));
        System.out.println("mathBox.equals(mathBoxSame) = " + mathBox.equals(mathBoxSame));
        System.out.println();


        System.out.println("------- Task 4.1 -------");
        ObjectBox objectBox = new ObjectBox(WorkWithArray.creatArray(4), WorkWithArray.creatArray(4));
        ObjectBox objectBox2 = new ObjectBox(WorkWithArray.creatArray(4), WorkWithArray.creatArray(4));
        ObjectBox objectBox3 = new ObjectBox(new String[]{"a", "b", "c", "d"}, WorkWithArray.creatArray(4));

        System.out.println("objectBox.toString() = " + objectBox.toString());
        System.out.println("objectBox2.toString() = " + objectBox2.toString());

        try {
            System.out.println("Сумма элементов objectBox.summatorBad() = " + objectBox.summatorBad());
            System.out.println("Сумма элементов objectBox3.summatorBad() = " + objectBox3.summatorBad());
        } catch (ExceptionNumeric exceptionNumeric) {
            System.out.println(exceptionNumeric.getMessage());
            System.out.println(exceptionNumeric.getSet());
        }

        System.out.println("Сумма элементов objectBox.summatorGood() = " + objectBox.summatorGood());
        try {
            System.out.println("Splitter(10) = " + objectBox.splitter(10));
            System.out.println("Splitter(10) = " + objectBox.splitter(0));
        } catch (ExceptionDivider exceptionDivider) {
            System.out.println(exceptionDivider.getMessage());
        }
        System.out.println();


        System.out.println("------- Task 4.2 -------");

        MathBoxExtends mathBoxExtends = new MathBoxExtends(WorkWithArray.creatArray(4));
        MathBoxExtends mathBoxExtends2 = new MathBoxExtends(WorkWithArray.creatArray(4));

        System.out.println("mathBoxExtends.toString() = " + mathBoxExtends.toString());
        System.out.println("mathBoxExtends2.toString() = " + mathBoxExtends2.toString());

        System.out.println("Сумма элементов mathBoxExtends = " + mathBoxExtends.summator());
        try {
            System.out.println("Splitter(10) = " + mathBoxExtends.splitter(10));
        } catch (ExceptionDivider exceptionDivider) {
            exceptionDivider.printStackTrace();
        }

        mass = mathBoxExtends.getCollectionInMass();
        MathBoxExtends mathBoxExtendsSame = new MathBoxExtends(mass);

        System.out.println("mathBoxExtends.equals(mathBoxExtends2) = " + mathBoxExtends.equals(mathBoxExtends2));
        System.out.println("mathBoxExtends.equals(mathBoxExtendsSame) = " + mathBoxExtends.equals(mathBoxExtendsSame));


    }

}
