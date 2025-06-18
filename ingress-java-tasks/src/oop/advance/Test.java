package oop.advance;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        Employee employee1 = new Employee("123", "Asiman", "Mammadli", -21, "Developer", 1000);
        Employee employee2 = new Employee("789", "Rovshan", "Mammadli", 18, "Designer", 2000);
        Student student1 = new Student("789", "Ulvi", "Mammadli", 19, "Khazar", 3.8d);
        Student student2 = new Student("789", "Emin", "Mammadli", 21, "Unec", 3.5d);

//        sortPersons(employee1, employee2, student1, student2);
//        checkFinUnique(employee1, employee2, student1, student2);

        System.out.println(
                employee1.isOlderThan(student2)
        );

    }

    private static void checkFinUnique(Person... persons) {
        Set<Person> personSet = new HashSet<>(Arrays.asList(persons));
        personSet.forEach(System.out::println);
    }

    private static void sortPersons(Person... persons) {
        List<Person> employees = Arrays.asList(persons);
        List<Person> students = Arrays.asList(persons);
        List<Person> personList = Arrays.asList(persons);

        employees.sort(new PersonComparator());

        employees.forEach(System.out::println);
    }
}
