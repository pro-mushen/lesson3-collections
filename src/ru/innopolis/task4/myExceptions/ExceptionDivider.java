package ru.innopolis.task4.myExceptions;

import java.util.Set;

public class ExceptionDivider extends Exception {

    private Set set;

    public ExceptionDivider(String message, Set set) {

        super(message);
        this.set = set;

    }

    public Set getSet() {
        return set;
    }
}
