package com.calculator;


import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;


import org.junit.Before;
import org.junit.Test;

public class CalculatorTest 
{
    private Calculator calculator;

    @Before
    public void setUp() 
    {
        calculator = new Calculator();
    }

    @Test
    public void GivenTwoPosInts_WhenAdd_ThenProvideSum() 
    {
        assertThat(this.calculator.add(2,3), is(5));
    }

    @Test
    public void GivenTwoInts_WhenSubtract_ThenProvidePositiveDiff() {
        assertThat(this.calculator.subtract(3, 2), is(1));
    }

    @Test
    public void GivenTwoInts_WhenSubtract_ThenProvideNegativeDiff() {
        assertThat(this.calculator.subtract(2, 3), is(-1));
    }

    @Test
    public void GivenTwoEqualInts_WhenSubtract_ThenProvideZero() {
        assertThat(this.calculator.subtract(2, 2), is(0));
    }

    @Test
    public void GivenTwoNegativeInts_WhenSubtract_ThenProvideNegativeResult() {
        assertThat(this.calculator.subtract(-3, -2), is(-1));
    }

    @Test
    public void GivenTwoNegativeInts_WhenSubtract_ThenProvidePositiveResult() {
        assertThat(this.calculator.subtract(-2, -3), is(1));
    }

    @Test
    public void GivenNegativeAndPositiveInt_WhenSubtract_ThenProvideNegativeResult() {
        assertThat(this.calculator.subtract(-2, 3), is(-5));
    }

    @Test
    public void GivenPositiveAndNegativeInt_WhenSubtract_ThenProvidePositiveResult() {
        assertThat(this.calculator.subtract(3, -2), is(5));
    }

    @Test
    public void GivenTwoPosInts_WhenDivide_ThenProvideFloatQuotient() {
        assertThat(this.calculator.divide(6, 3), closeTo(2.0, 0.0001));
    }

    @Test
    public void GivenTwoNegInts_WhenDivide_ThenProvidePositiveFloatQuotient() {
        assertThat(this.calculator.divide(-6, -3), closeTo(2.0, 0.0001));
    }

    @Test
    public void GivenPosAndNegInt_WhenDivide_ThenProvideNegativeFloatQuotient() {
        assertThat(this.calculator.divide(6, -3), closeTo(-2.0, 0.0001));
    }

    @Test
    public void GivenNegAndPosInt_WhenDivide_ThenProvideNegativeFloatQuotient() {
        assertThat(this.calculator.divide(-6, 3), closeTo(-2.0, 0.0001));
    }

    @Test
    public void GivenZeroNumerator_WhenDivide_ThenProvideZeroFloat() {
        assertThat(this.calculator.divide(0, 3), closeTo(0.0, 0.0001));
    }

    @Test  (expected = ArithmeticException.class)
    public void GivenInt_WhenDivideByZero_ThenThrowArithmeticException() {
        this.calculator.divide(3, 0);
    }

    @Test
    public void GivenTwoPosInts_WhenMultiply_ThenProvideProduct() {
        assertThat(this.calculator.multiply(4, 3), is(12));
    }

    @Test
    public void GivenTwoNegInts_WhenMultiply_ThenProvidePositiveProduct() {
        assertThat(this.calculator.multiply(-2, -3), is(6));
    }

    @Test
    public void GivenPosAndNegInt_WhenMultiply_ThenProvideNegativeProduct() {
        assertThat(this.calculator.multiply(4, -3), is(-12));
    }

    @Test
    public void GivenNegAndPosInt_WhenMultiply_ThenProvideNegativeProduct() {
        assertThat(this.calculator.multiply(-4, 3), is(-12));
    }

    @Test
    public void GivenZeroMultiplier_WhenMultiply_ThenProvideZero() {
        assertThat(this.calculator.multiply(4, 0), is(0));
        assertThat(this.calculator.multiply(0, 3), is(0));
    }

}
