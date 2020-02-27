package io.littleworld.statics;

public class MyClass {

    static MyClass instance;

    static MyClass factory() {
        return instance = new MyClass();
    }

    void print() {
        System.out.println("in print");
    }


    public static void main(String[] args) {
        MyClass.factory().print();
    }
}
