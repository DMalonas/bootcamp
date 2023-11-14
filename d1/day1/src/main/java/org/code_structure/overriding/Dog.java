package org.code_structure.overriding;

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("The dog barks.");
    }

    void speak(String sound) {
        System.out.println("The dog makes a sound: " + sound);
    }
}