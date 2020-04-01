package com.myly.java;

import java.util.Scanner;

public class test2 {
    Scanner input1 =new Scanner(System.in);
    public void symbolEstimate(double num) {
        System.out.println("请输入符号(+,-*,/)");
        String symbol=input1.nextLine();
        System.out.println(symbol);
        switch(symbol) {
            case "+":
                num=this.additon(num);
                System.out.println("计算结果为"+num);
                break;
            case "-":
                num=this.subtraction(num);
                System.out.println("计算结果为"+num);
                break;
            case "*":
                num=this.multiplication(num);
                System.out.println("计算结果为"+num);
                break;
            case "/":
                num=this.divisionMethod(num);
                System.out.println("计算结果为"+num);
                break;
            default:
                System.out.println("输入的符号有误,前一个数为"+num);
        }

        this.symbolEstimate(num);

    }
    public double additon(double num) {
        System.out.println("请输入下一个数");
        double nextNum=input1.nextDouble();
        return num+nextNum;
    }
    public double subtraction(double num) {
        System.out.println("请输入下一个数");
        double nextNum=input1.nextDouble();
        return num-nextNum;
    }
    public double multiplication(double num) {
        System.out.println("请输入下一个数");
        double nextNum=input1.nextDouble();
        return num*nextNum;
    }
    public double divisionMethod(double num) {
        System.out.println("请输入下一个数");
        double nextNum=input1.nextDouble();
        return num/nextNum;
    }

    public static  void main(String[] args) {
        System.out.println("输入第一个数开始计算");
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        test2 work = new test2();
        work.symbolEstimate(num);
        input.close();
    }
}

