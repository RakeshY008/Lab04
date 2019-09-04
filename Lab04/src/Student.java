import Lab04.Person;

public class Student extends Person {
    private long uniRollNumber;
    private double currentCPI;

    public Student(String name, int age, char gender, long uniRollNumber, double currentCPI) {
        super(name, age, gender);
        this.uniRollNumber = uniRollNumber;
        this.currentCPI = currentCPI;
    }

    public double getCurrentCPI() {
        return currentCPI;
    }

    public void setCurrentCPI(double currentCPI) {
        this.currentCPI = currentCPI;
    }

    public long getUniRollNumber() {
        return uniRollNumber;
    }

    public void setUniRollNumber(long uniRollNumber) {
        this.uniRollNumber = uniRollNumber;
    }

    public void study() {
        System.out.println("Uni_roll_No : " + uniRollNumber + " Current_CPI " + currentCPI);
    }
}



