package org.arrays_with_lambda;

import java.util.Arrays;

//Print Array Elements Using Lambda
public class LambdaArray0 {
    public static void main(String[] args) {
        String[] stringArray = {"Java", "Python", "C++", "Ruby"};
        
        // Use Arrays.stream() to create a stream and forEach to iterate
        Arrays.stream(stringArray).forEach(str -> System.out.println(str));
    }
}

