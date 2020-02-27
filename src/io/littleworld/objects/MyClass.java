package io.littleworld.objects;

public class MyClass {
    String name;

    // generate constructor
    public MyClass(String name) {
        this.name = name;
    }

    // override/generate equals

    // override/generate toString

    // override/generate hashCode




    public static void main(String[] args) {
        MyClass myClass = new MyClass("my-class");

        System.out.println(myClass.hashCode());

        if (myClass == new MyClass("my-class"))
            System.out.println("is equal");

    }
}
