import model.Pupil;
import service.PupilManager;

public class Main {
    public static void main(String[] args) {
       PupilManager pubpilManager= new PupilManager();
       Pupil pupil = new Pupil("Uy", 18 , 1, 7.0 , 6.4 , 8 );
       Pupil pupil1 = new Pupil("Uy", 18 , 2 , 8, 6.4 , 8 );
       Pupil pupil2 = new Pupil("Uy", 18 , 3, 2, 6 , 8 );
       pubpilManager.add(pupil);
       pubpilManager.add(pupil1);
       pubpilManager.add(pupil2);
       pubpilManager.print();
       pubpilManager.deleteByCode(2);
       pubpilManager.print();
       pubpilManager.findIndexByid(1);
       pubpilManager.print();
       pubpilManager.sort();
       pubpilManager.print();
       pubpilManager.findPupilGpaMax();
    }
}
