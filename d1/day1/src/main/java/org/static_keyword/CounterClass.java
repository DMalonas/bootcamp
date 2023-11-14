package org.static_keyword;

public class CounterClass {
    // Static variable
    private static int instanceCount = 0;

    // Constructor that increments the static variable
    public CounterClass() {
        instanceCount++;
    }

    // Static method to get the instance count
    public static int getInstanceCount() {
        return instanceCount;
    }
}
