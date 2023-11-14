package org.static_keyword;

public class MainClass {
    public static void main(String[] args) {
        // Creating the first instance of CounterClass
        CounterClass obj1 = new CounterClass();
        System.out.println("After creating obj1, instance count: " + CounterClass.getInstanceCount());

        // Creating the second instance of CounterClass
        CounterClass obj2 = new CounterClass();
        System.out.println("After creating obj2, instance count: " + CounterClass.getInstanceCount());

        // Demonstrating the shared state of instanceCount
        System.out.println("Instance count accessed from obj1: " + obj1.getInstanceCount());
        System.out.println("Instance count accessed from obj2: " + obj2.getInstanceCount());
    }
}
