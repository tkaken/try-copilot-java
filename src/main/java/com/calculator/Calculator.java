package com.calculator;

import api.calculator.Calculator_I;

public class Calculator implements Calculator_I {
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

    public int multiply(int multiplicand, int multiplier) {
        return multiplicand * multiplier;
    }
}
