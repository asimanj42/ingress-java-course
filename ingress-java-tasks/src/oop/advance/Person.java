package oop.advance;

public abstract class Person {

    private String pin;
    private String name;
    private String surname;
    private int age;

    public Person(String pin, String name, String surname, int age) {
        this.pin = pin;
        this.name = name;
        this.surname = surname;
        setAge(age);
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pin='" + pin + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person person = (Person) obj;
        return this.pin.equals(person.pin);
    }

    @Override
    public int hashCode() {
        return pin.hashCode();
    }

    public boolean isOlderThan(Person other) {
        return this.getAge() > other.getAge();
    }

}