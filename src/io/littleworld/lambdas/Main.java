package io.littleworld.lambdas;


public class Main {

    interface Calc {
        int apply(int a, int b);
    }

    static int calculate (Calc calc, int g1, int g2) {
        return calc.apply(g1, g2);
    }

    public static void main(String[] args) {
        Calc add = new Calc() {
            @Override
            public int apply(int a, int b) {
                return a + b;
            }
        };

       int result = calculate((a, b) -> (int) Math.pow(a, b), 3, 4);
        System.out.println(result);
    }
}
