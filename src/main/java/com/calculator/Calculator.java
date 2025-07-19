package com.calculator;

public class Calculator {
    public int add(int augend, int addend) {
        return augend + addend;
    }

    public int subtract(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    public double divide(int dividend, int divisor) {
        if (0 == divisor) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) dividend / divisor;
    }
}
