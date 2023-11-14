package org;

import java.util.*;
public class IfExample0 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Integer 1");
        int a1 = s.nextInt();
        System.out.println("Integer 2");
        int a2 = s.nextInt();
        if(a1 > a2) {
            System.out.println("First > Second");
        } else {
            System.out.println("Second >= First");
        }
        if(a1 > a2) {
            System.out.println("First > Second");
        } else if (a1 < a2) {
            System.out.println("Second > First");
        } else {
            System.out.println("Second == First");
        }
    }
}

