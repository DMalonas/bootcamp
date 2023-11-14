package org.iteration;

public class DoWhile {
    public static void main(String[] args) {
        int x = 0;
        while(x < 10) {
            System.out.println(x);
            x++;
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(x);
        }
        do {
            System.out.println(x);
            x++;
        } while(x<10);
        x = 0;
        System.out.println(x);
        x++;
        for(; x < 10; x++) {
            System.out.println(x);
        }
    }
}
