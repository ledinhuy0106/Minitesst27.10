package model;

public class Pupil extends People {
    private double math;
    private double chemistry;
    private double physics;
    private double gpa;


    public Pupil() {}

    public Pupil(double math, double chemistry, double physics ) {
        this.math = math;
        this.chemistry = chemistry;
        this.physics = physics;
        this.gpa = gpa ;
    }

    public Pupil(String name, int age, int id, double math, double chemistry, double physics) {
        super(name, age, id);
        this.math = math;
        this.chemistry = chemistry;
        this.physics = physics;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getGpa() {
        return gpa = (math + chemistry + physics ) / 3  ;
    }


    @Override
    public String toString() {
        return "Pupil{" +
                super.toString() +
                "math=" + math +
                ", chemistry=" + chemistry +
                ", physics=" + physics +
                ", Grade Point Average = " + getGpa() +
                '}';
    }
}
