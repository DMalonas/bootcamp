package org.arrays_with_lambda;

import java.util.Arrays;

//Transforming Array Elements Using Lambda
public class LambdaArray3 {
    public static void main(String[] args) {
        Integer[] numberArray = {1, 2, 3, 4, 5};

        // Map each number to its square
        Integer[] squaredArray = Arrays.stream(numberArray)
                .map(n -> n * n)
                .toArray(Integer[]::new);

        // Print the transformed array
        Arrays.stream(squaredArray).forEach(System.out::println);
    }
}

