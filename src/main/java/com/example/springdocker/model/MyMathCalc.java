package com.example.springdocker.model;

public class MyMathCalc {

    public int add(int a, int b){
        return a + b;
    }

    public int multiply (int a, int b){
        return a * b;
    }


    public double divide (int a, int b){
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Cannot divide with zero");
        }
        return a/b;
    }
}
