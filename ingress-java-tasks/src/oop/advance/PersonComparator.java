package oop.advance;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    //not clean code with if else
    @Override
    public int compare(Person p1, Person p2) {
        if (p1 instanceof Employee && p2 instanceof Employee) {
            return Double.compare(((Employee) p2).getSalary(), ((Employee) p1).getSalary());
        } else if (p1 instanceof Student && p2 instanceof Student) {
            return Double.compare(((Student) p2).getGpa(), ((Student) p1).getGpa());
        } else {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    }

}
