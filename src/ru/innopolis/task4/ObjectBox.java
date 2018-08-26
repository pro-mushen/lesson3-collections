package ru.innopolis.task4;


import ru.innopolis.task4.myExceptions.ExceptionDivider;
import ru.innopolis.task4.myExceptions.ExceptionNumeric;

import java.util.*;

public class ObjectBox<G extends Number> {
    private Set<Object> collectionBad = new TreeSet<Object>();
    private Set<G> collectionGood = new TreeSet<G>();

    public ObjectBox(Object[] arrayBad, G[] arrayGood) {
        if (arrayBad != null) {
            collectionBad = new TreeSet<>(Arrays.asList(arrayBad));
        }
        if (arrayGood != null) {
            collectionGood = new TreeSet<>(Arrays.asList(arrayGood));
        }
    }

    public Integer summatorBad() throws ExceptionNumeric {
        Integer result = 0;

        if (collectionBad.size() != 0) {

            Iterator i = collectionBad.iterator();
            try {
                result = (Integer) i.next();
            } catch (ClassCastException e) {
                throw new ExceptionNumeric("Коллекция не является числовой", collectionBad);
            }

            for (; i.hasNext(); ) {
                result += (Integer) i.next();
            }
        }

        return result;
    }

    public Integer summatorGood() {
        Integer result = 0;

        for (G e : this.collectionGood) {
            result += (Integer) e;
        }

        return result;
    }

    public Set<Integer> splitter(int divider) throws ExceptionDivider {
        Set<Integer> result = new TreeSet<>();

        if (divider != 0) {
            for (G e : this.collectionGood) {
                result.add((Integer) e / divider);
            }
        } else {
            throw new ExceptionDivider("Нет возможности делить на 0", collectionGood);
        }

        return result;

    }

    public boolean deleteObject(G e) {
        return this.collectionGood.remove(e);
    }

    public boolean addObject(G e) {
        return this.collectionGood.add(e);
    }

    public Integer[] getCollectionInMass() {
        return collectionGood.toArray(new Integer[collectionGood.size()]);
    }

    public String getCollectionGoodString() {
        return collectionGood.toString();
    }

    public String dump() {
        return toString();
    }


    @Override
    public String toString() {
        return "collectionGood: " + collectionGood.toString() + '\n' + "collectionBad: " + collectionBad.toString();

    }

    @Override
    public boolean equals(Object o) {
        Set<G> thatCollecion;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObjectBox<G> thatMathBox = (ObjectBox<G>) o;
        thatCollecion = thatMathBox.collectionGood;

        if (this.collectionGood == thatCollecion) return true;
        if (this.collectionGood.size() != thatCollecion.size()) return false;

        for (G e : this.collectionGood) {
            if (!(thatCollecion.contains(e))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectionGood);
    }
}
