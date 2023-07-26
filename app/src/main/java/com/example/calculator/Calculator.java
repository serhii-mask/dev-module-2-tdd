package com.example.calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        double scale = Math.pow(10, 3);
        return Math.ceil(((double) a / b) * scale) / scale;
    }
}