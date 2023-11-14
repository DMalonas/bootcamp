package org.arrays_with_lambda;

import java.util.Arrays;

//Filtering an Array Using Lambda
public class LambdaArray2 {
    public static void main(String[] args) {
        Integer[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Filter the array to only include even numbers
        Integer[] evenNumbers = Arrays.stream(numberArray)
                .filter(n -> n % 2 == 0)
                .toArray(Integer[]::new);

        // Print the filtered array
        Arrays.stream(evenNumbers).forEach(System.out::println);
    }
}

