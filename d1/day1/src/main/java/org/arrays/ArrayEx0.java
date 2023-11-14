package org.arrays;

public class ArrayEx0 {
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] => " + arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] a; // array (not initialized)
        int[] b = new int[10]; // array and assignment
        int[] c = {1,3,5,7,9}; // array and initialization
        System.out.println("-----------");
        printArr(c);
        System.out.println("-----------");
// anonymous array
// new int[3] {1,2,3}
        c = new int[]{1, 2, 3}; //new int[] {1,2,3}; // re-initialize the array
        printArr(c);
        System.out.println("-----------");
    }
}

