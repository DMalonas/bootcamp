package org.arrays_with_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Creating a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person(1990));
        people.add(new Person(2000));
        people.add(new Person(1985));
        people.add(new Person(2005));

        // Using stream and filter to find people with age > 1996
        List<Person> filteredPeople = people.stream()
                .filter(person -> person.getAge() > 1996)
                .collect(Collectors.toList());

        List<Person> youngerPeople = new ArrayList<>();
        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            if (person.getAge() > 1996) {
                youngerPeople.add(person);
            }
        }

        // Printing the filtered list
        filteredPeople.forEach(System.out::println);
    }
}
