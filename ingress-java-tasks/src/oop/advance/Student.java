package oop.advance;

public class Student extends Person {

    private String university;
    private double gpa;

    public Student(String pin, String name, String surname, int age, String university, double gpa) {
        super(pin, name, surname, age);
        this.university = university;
        setGpa(gpa);
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 100.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 100.0");
        }
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "pin='" + getPin() + '\'' +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", university='" + university + '\'' +
                ", gpa=" + gpa +
                '}';
    }

}
