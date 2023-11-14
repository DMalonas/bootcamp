package org.arrays_with_lambda;

public class Person {
    private int age;

    // Constructor
    public Person(int age) {
        this.age = age;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + '}';
    }
}
