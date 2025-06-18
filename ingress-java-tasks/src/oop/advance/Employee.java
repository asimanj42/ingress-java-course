package oop.advance;

public class Employee extends Person {

    private String position;
    private double salary;

    public Employee(String pin, String name, String surname, int age, String position, double salary) {
        super(pin, name, surname, age);
        this.position = position;
        setSalary(salary);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "pin='" + getPin() + '\'' +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

}
