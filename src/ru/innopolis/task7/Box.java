package ru.innopolis.task7;

import java.util.Set;

public interface Box {

    public long summator();

    @Logged
    public Set<Integer> splitter(int divider);

    public boolean deleteObject(Integer e);

    public Integer[] getCollectionInMass();

    public Set<Integer> getCollection();

    public void setCollection(Set<Integer> collection);

    @DataClear
    public void allClear();

}
