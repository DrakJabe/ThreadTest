package com.myly.java;

public class Book {
    public int money;
    private int number;
    private String name;

    public Book(int money, int number, String name) {
        this.money = money;
        this.number = number;
        this.name = name;
    }

    private Book(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Book() {

    }
    public void a(){}

    private void b(){}
}
