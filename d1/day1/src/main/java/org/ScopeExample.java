package org;

public class ScopeExample {
    public static void main(String[] args) {
        int n = 111;
        System.out.println("n = " + n);
        {
            int k = 222;
            System.out.println("k = " + k);
        }
        {
            int k = 333;
            System.out.println("k = " + k);
        }
    }
}

