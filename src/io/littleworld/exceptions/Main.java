package io.littleworld.exceptions;

public class Main {
    public static void main(String[] args) {
        final int result = divide(3, 0);
        System.out.println(result);

    }

    static public int divide(int a, int b) {
        int div = a / b;
        return div;
    }
}
