package com.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

public class CalculatorTest 
{
    private Calculator calculator;

    @BeforeEach
    void setUp() 
    {
        calculator = new Calculator();
    }

    @Test
    void GivenTwoPosInts_WhenAdd_ThenProvideSum() 
    {
        assertThat(this.calculator.add(2,3), is(5));
    }

    @Test
    void GivenTwoNegativeInts_WhenAdd_ThenProvideSum() 
    {
        assertThat(this.calculator.add(-2,-3), is(-5));
    }

}
