package ru.innopolis.task4.ExtendsBox;

import ru.innopolis.task4.ObjectBox;

public class MathBoxExtends extends ObjectBox<Integer> {
    public MathBoxExtends(Integer[] arrayGood) {
        super(null, arrayGood);
    }

    public long summator() {
        return summatorGood();
    }

    public String toString() {
        return "collection: " + super.getCollectionGoodString();
    }

}
