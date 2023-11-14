package org;

public class SwitchExample2 {
    public static void main(String[] args) {
        // no break so all cases are executed
        String s = "foo";
        switch(s) {
            case "foo":
                System.out.println("Str was foo");
            case "bar":
                System.out.println("Str was bar");
            default:
                System.out.println("Neither foo nor bar");
                break;
        }
    }
}

