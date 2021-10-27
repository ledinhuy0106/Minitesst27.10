package service;

import model.Pupil;

import java.util.ArrayList;
import java.util.Comparator;

public class PubpilManager implements Peopleservice <Pupil> {
    private ArrayList<Pupil> people;
    public PubpilManager() {
        people = new ArrayList<>();
    }

    public ArrayList<Pupil> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Pupil> people) {
        this.people = people;
    }
    @Override
    public int findIndexByid(int id) {
        System.out.println(" Thông Tin theo id ");
            for (int i = 0; i < people.size(); i++) {
                if(people.get(i).getId() == id){
                    return i;
                }
            }
            return -1;
    }
    @Override
    public void add(Pupil pupil) {
        System.out.println("Đã Thêm : ");
        people.add(pupil);
    }

    @Override
    public void update(Pupil pupil, int id) {
        System.out.println("Thông tin sau khi sửa : ");
        int index= findIndexByid(id);
        people.set(index,pupil);
    }

    @Override
    public void deleteByCode(int id) {
        System.out.println("Đã xóa thành công id : " + id);
        int index = findIndexByid(id);
        people.remove(index);
    }

    @Override
    public void print() {
        System.out.println("Thông tin là : ");
        for (Pupil pupil: people) {
            System.out.println(pupil);
        }
        System.out.println("____________");

    }

    @Override
    public void sort() {
        people.sort((Comparator.comparingDouble(Pupil::getGpa)));
    }

    @Override
    public void findPupilGpaMax() {

    }

}

