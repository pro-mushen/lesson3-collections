package ru.innopolis.task3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


public class MathBox {
    private Set<Integer> collection;

    public MathBox(Integer[] array) {
        collection = new TreeSet<>(Arrays.asList(array));
    }

    public long summator() {
        long result = 0;

        for (Integer e : this.collection) {
            result += e;
        }

        return result;
    }

    // деление округляю, так как я так понял возвращаемая коллекция должна быть индентична исходной, т.е. Integer
    public Set<Integer> splitter(int divider) throws ArithmeticException {
        Set<Integer> result = new TreeSet<>();

        if (divider != 0) {
            for (Integer e : this.collection) {
                result.add(e / divider);
            }
        } else {
            throw new ArithmeticException("Нет возможности делить на 0");
        }


        return result;

    }

    public boolean remove(Integer e) {
        return this.collection.remove(e);
    }

    public Integer[] getCollectionInMass() {
        return collection.toArray(new Integer[collection.size()]);
    }

    @Override
    public String toString() {
        return "collection = " + collection.toString();
    }

    @Override
    public boolean equals(Object o) {
        Set<Integer> thatCollecion;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MathBox thatMathBox = (MathBox) o;
        thatCollecion = thatMathBox.collection;

        if (this.collection == thatCollecion) return true;
        if (thatCollecion == null) return false;
        if (this.collection.size() != thatCollecion.size()) return false;

        for (Integer e : this.collection) {
            if (!(thatCollecion.contains(e))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(collection);
    }
}
