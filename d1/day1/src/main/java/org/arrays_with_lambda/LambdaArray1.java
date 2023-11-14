package org.arrays_with_lambda;

import java.util.Arrays;

//Sorting an Array Using a Lambda as Comparator
public class LambdaArray1 {
    public static void main(String[] args) {
        String[] stringArray = {"Java", "Python", "C++", "Ruby"};

        // Use Arrays.sort with a lambda expression for custom sorting
        Arrays.sort(stringArray, (a, b) -> a.length() - b.length());

        // Print the sorted array
        Arrays.stream(stringArray).forEach(System.out::println);
    }
}

