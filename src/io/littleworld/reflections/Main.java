package io.littleworld.reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        MyClass myClass = new MyClass();

        Class clazz = myClass.getClass();
        clazz.getName();

        Field[] fields = clazz.getDeclaredFields();
        for (Field fld : fields)
            fld.getName();

        Field x = clazz.getDeclaredField("x");
        x.setInt(myClass, 6);

        System.out.println(myClass.x);


        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            m.getName();

            Annotation[] annotations = m.getDeclaredAnnotations();

            for (Annotation anno : annotations) {
                if (anno.annotationType() == Yahoo.class) {
                    m.invoke(myClass, null);
                }
            }
        }
    }
}
