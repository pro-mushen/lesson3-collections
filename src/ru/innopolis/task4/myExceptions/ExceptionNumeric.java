package ru.innopolis.task4.myExceptions;

import java.util.Set;

public class ExceptionNumeric extends Exception {
    private Set set;

    public ExceptionNumeric(String message, Set set) {

        super(message);
        this.set = set;

    }

    public Set getSet() {
        return set;
    }
}
