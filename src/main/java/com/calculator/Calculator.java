package com.calculator;

public class Calculator {

    public int add(int firstNumber, int secondNumber) 
    {
        if (firstNumber < 0 || secondNumber < 0) {
            throw new IllegalArgumentException("Numbers must be non-negative");
        }
        return firstNumber + secondNumber;
    }
    
}
