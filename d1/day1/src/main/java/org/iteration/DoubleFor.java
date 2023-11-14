package org.iteration;

public class DoubleFor {
    public static void main(String[] args) {
        int x = 0;
        float f = 5.0f;
        while (f > 1e-6) {
            // do something
            f = f - 0.1f;
        }
        f = 5.0f;
        for (; ; ) {
            if (f <= 1e-6) { //0.000001
                break;
            }
            f = f - 0.1f;
        }
        // εντολή "break label"
        out1:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i+j = " + (i + j));
                if (i + j > 9) {
                    break out1;
                }
            }
        }
    }
}
