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
    void GivenTwoInts_WhenSubtract_ThenProvidePositiveDiff() {
        assertThat(this.calculator.subtract(3, 2), is(1));
    }

    @Test
    void GivenTwoInts_WhenSubtract_ThenProvideNegativeDiff() {
        assertThat(this.calculator.subtract(2, 3), is(-1));
    }

    @Test
    void GivenTwoEqualInts_WhenSubtract_ThenProvideZero() {
        assertThat(this.calculator.subtract(2, 2), is(0));
    }

    @Test
    void GivenTwoNegativeInts_WhenSubtract_ThenProvideNegativeResult() {
        assertThat(this.calculator.subtract(-3, -2), is(-1));
    }

    @Test
    void GivenTwoNegativeInts_WhenSubtract_ThenProvidePositiveResult() {
        assertThat(this.calculator.subtract(-2, -3), is(1));
    }

    @Test
    void GivenNegativeAndPositiveInt_WhenSubtract_ThenProvideNegativeResult() {
        assertThat(this.calculator.subtract(-2, 3), is(-5));
    }

    @Test
    void GivenPositiveAndNegativeInt_WhenSubtract_ThenProvidePositiveResult() {
        assertThat(this.calculator.subtract(3, -2), is(5));
    }




}
