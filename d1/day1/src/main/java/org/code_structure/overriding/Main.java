package org.code_structure.overriding;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.speak();

        Dog myDog = new Dog();
        myDog.speak();
        myDog.speak("Woof");
    }
}