package io.littleworld.generics;

public class MyClass {
    String name;

    public MyClass(String name) { this.name = name; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public static void main(String[] args) {
       MyClass myClass = new MyClass("my-class");
    }
}
