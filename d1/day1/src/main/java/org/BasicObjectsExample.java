package org;

public class BasicObjectsExample {
    static final int MAX = 100;
    float num = 5.5F;
    public static void main(String[] args) {
        Integer i = new Integer(12);
        Float f = new Float(1.23f);
        Double d = new Double(1.7e63);
        System.out.println("i = " + i + ", f = " + f +
                ", d = " + d);
        Integer i2 = Integer.parseInt("111");
        Float f2 = Float.parseFloat("2.17");
        Double d2 = Double.parseDouble("8.88e131");
        System.out.println("i2 = " + i2 + ", f2 = " + f2 +
                ", d2 = " + d2);
    }
}

