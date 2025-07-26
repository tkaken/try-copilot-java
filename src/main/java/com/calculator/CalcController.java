package com.calculator;

import api.calculator.Display_I;
import api.calculator.Calculator_I;

public class CalcController {
    private final Display_I display;
    private final Calculator_I calculator;
    
    public CalcController(Display_I display, Calculator_I calculator) {
        this.display = display;
        this.calculator = calculator;
    }
    
    public void add(int augend, int addend) {
        int result = calculator.add(augend, addend);
        display.display(String.valueOf(result));
    }

    public void subtract(int minuend, int subtrahend) {
        int result = calculator.subtract(minuend, subtrahend);
        display.display(String.valueOf(result));
    }

    public void divide(int dividend, int divisor) {
        try {
            double result = calculator.divide(dividend, divisor);
            display.display(String.format("%.2f", result));
        } catch (ArithmeticException e) {
            display.display("Error: Division by zero");
        }
    }

    public void multiply(int multiplicand, int multiplier) {
        int result = calculator.multiply(multiplicand, multiplier);
        display.display(String.valueOf(result));
    }
}
