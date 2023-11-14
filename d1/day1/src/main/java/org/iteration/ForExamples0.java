package org.iteration;

public class ForExamples0 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        String prefix = "";
        for(int i = 0; i < arr.length; i++) {
            System.out.print(String.format("%sa[%d] => %d\n", prefix, i, arr[i]));
        }
        System.out.println();
        prefix = "";
        for(int val: arr) {
            System.out.print(String.format("%s=> %d", prefix, val));
            prefix = ", ";
        }
    }
}

