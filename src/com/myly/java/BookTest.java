package com.myly.java;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book();
        Class<? extends Book> aClass = b.getClass();
        Class<Book> bClass = Book.class;
//        Field[] fields = aClass.getDeclaredFields();
//        for (Field f:fields
//             ) {
//            System.out.println(f+" : "+f.getName());
//
//        }
//        Method[] declaredMethods = aClass.getDeclaredMethods();
//        for (Method m:declaredMethods
//             ) {
//            System.out.println(m+" : "+m.getName());
//        }
        Constructor<?>[] declaredAnnotations = aClass.getDeclaredConstructors();
        for (Constructor a:declaredAnnotations
             ) {
            System.out.println(a+" : "+a.getName());
        }

    }

}
