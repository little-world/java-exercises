package io.littleworld.designpatterns;

public class Strategy {
    public static void main(String[] args) {
        System.out.println(calculator(new Add(), 3, 4));
    }

    static double calculator(Calc calc, double x, double y) {
        return calc.calculate(x, y);
    }
}

interface Calc {
    double calculate(double a, double b);
}

class Add implements Calc {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}

