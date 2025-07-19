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

    @Test
    void GivenTwoPosInts_WhenDivide_ThenProvideFloatQuotient() {
        assertThat(this.calculator.divide(6, 3), closeTo(2.0, 0.0001));
    }

    @Test
    void GivenTwoNegInts_WhenDivide_ThenProvidePositiveFloatQuotient() {
        assertThat(this.calculator.divide(-6, -3), closeTo(2.0, 0.0001));
    }

    @Test
    void GivenPosAndNegInt_WhenDivide_ThenProvideNegativeFloatQuotient() {
        assertThat(this.calculator.divide(6, -3), closeTo(-2.0, 0.0001));
    }

    @Test
    void GivenNegAndPosInt_WhenDivide_ThenProvideNegativeFloatQuotient() {
        assertThat(this.calculator.divide(-6, 3), closeTo(-2.0, 0.0001));
    }

    @Test
    void GivenZeroNumerator_WhenDivide_ThenProvideZeroFloat() {
        assertThat(this.calculator.divide(0, 3), closeTo(0.0, 0.0001));
    }

    @Test
    void GivenInt_WhenDivideByZero_ThenThrowArithmeticException() {
        assertThrows(ArithmeticException.class, () -> this.calculator.divide(3, 0));
    }


}
