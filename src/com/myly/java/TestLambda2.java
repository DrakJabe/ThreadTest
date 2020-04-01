package com.myly.java;

public class TestLambda2 {

    public static void main(String[] args) {
        TestLambda ll = () -> {
            System.out.println("1+1="+(1+1));
            System.out.println("2+2="+(2+2));
        };

        ll.oneAddOne();
    }
}
