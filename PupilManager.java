package service;

import model.Pupil;

import java.util.ArrayList;
import java.util.Comparator;

public class PupilManager implements Peopleservice <Pupil> {
    private ArrayList<Pupil> pupils;
    public PupilManager() {
        pupils = new ArrayList<>();
    }

    public ArrayList<Pupil> getPupils() {
        return pupils;
    }

    public void setPupils(ArrayList<Pupil> pupils) {
        this.pupils = pupils;
    }
    @Override
    public int findIndexByid(int id) {
        System.out.println(" Thông Tin theo id ");
            for (int i = 0; i < pupils.size(); i++) {
                if(pupils.get(i).getId() == id){
                    return i;
                }
            }
            return -1;
    }
    @Override
    public void add(Pupil pupil) {
        System.out.println("Đã Thêm : ");
        pupils.add(pupil);
    }

    @Override
    public void update(Pupil pupil, int id) {
        System.out.println("Thông tin sau khi sửa : ");
        int index= findIndexByid(id);
        pupils.set(index,pupil);
    }

    @Override
    public void deleteByCode(int id) {
        System.out.println("Đã xóa thành công id : " + id);
        int index = findIndexByid(id);
        pupils.remove(index);
    }

    @Override
    public void print() {
        System.out.println("Thông tin là : ");
        for (Pupil pupil: pupils) {
            System.out.println(pupil);
        }
        System.out.println("____________");

    }

    @Override
    public void sort() {
        pupils.sort((Comparator.comparingDouble(Pupil::getGpa)));
    }

    @Override
    public void findPupilGpaMax() {
        double max = 0 ;
        int index = 0;
        for(int i = 0; i < pupils.size(); i++){
            if(pupils.get(i).getGpa()>max){
                max = pupils.get(i).getGpa() ;
                index = i ;

            }

        }

        System.out.println( "sv có điểm cao nhất là " + pupils.get(index));
    }

}

