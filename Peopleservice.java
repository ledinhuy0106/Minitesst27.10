package service;

import model.Pupil;

public interface Peopleservice<T> {
    int findIndexByid(int id);

    void add(T t);

    void update(T t, int id);

    void deleteByCode(int id);

    void print();

    void sort ();

    void findPupilGpaMax();
}
