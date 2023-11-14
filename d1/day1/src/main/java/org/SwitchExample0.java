package org;

public class SwitchExample0 {
    public static void main(String[] args) {
        int ch = 1;
        switch(ch) {
            case 1:
                System.out.println("1 was selected");
                break;
            case 2:
                System.out.println("2 was selected");
                break;
            default:
                System.out.println("Neither 1 nor 2");
                break;
        }
    }
}

