package com.example.calculator;

public class Calculator extends Exception {
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
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException();
        }

        double scale = Math.pow(10, 2);
        return Math.ceil(((double) a / b) * scale) / scale;
    }
}