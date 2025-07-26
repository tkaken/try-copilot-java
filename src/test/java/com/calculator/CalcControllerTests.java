package com.calculator;

import org.junit.After;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.mockito.BDDMockito.*;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;

public class CalcControllerTests 
{
    	@Rule public MockitoRule rule = MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS);
 
    private CalcController calcController;

    @Before
    public void setUp() {
        calcController = new CalcController(mockDisplay, mockCalculator);
    }

	@Mock
	api.calculator.Calculator_I mockCalculator;

    @Mock api.calculator.Display_I mockDisplay;

	@Test
	public void givenTwoPositiveIntegers_WhenTheAddFunctionIsCalled_ThenAPositiveSumIsDisplayed() 
    {
		int expectedAugend = 3;
		int expectedAddend = 4;
		int expectedSum = 42;
		
		//expectations
		given(mockCalculator.add(expectedAugend, expectedAddend))
			.willReturn(expectedSum);

		//act
		calcController.add(expectedAugend, expectedAddend);
		
		//verification
		then(mockDisplay)
			.should(times(1))
			.display(Integer.toString(expectedSum));
    }

    @Test
    public void givenTwoIntegers_WhenTheSubtractFunctionIsCalled_ThenADifferenceIsDisplayed() 
    {
        int expectedMinuend = 7;
        int expectedSubtrahend = 3;
        int expectedDifference = 4;
        
        //expectations
        given(mockCalculator.subtract(expectedMinuend, expectedSubtrahend))
            .willReturn(expectedDifference);

        //act
        calcController.subtract(expectedMinuend, expectedSubtrahend);
        
        //verification
        then(mockDisplay)
            .should(times(1))
            .display(Integer.toString(expectedDifference));
    }

    @Test
    public void givenTwoIntegers_WhenTheDivideFunctionIsCalled_ThenAFormattedQuotientIsDisplayed() 
    {
        int expectedDividend = 5;
        int expectedDivisor = 2;
        double expectedQuotient = 2.5;
        
        //expectations
        given(mockCalculator.divide(expectedDividend, expectedDivisor))
            .willReturn(expectedQuotient);

        //act
        calcController.divide(expectedDividend, expectedDivisor);
        
        //verification
        then(mockDisplay)
            .should(times(1))
            .display(String.format("%.2f", expectedQuotient));
    }

    @Test
    public void givenZeroDivisor_WhenTheDivideFunctionIsCalled_ThenErrorMessageIsDisplayed() 
    {
        int expectedDividend = 5;
        int expectedDivisor = 0;
        String expectedErrorMessage = "Error: Division by zero";
        
        //expectations
        given(mockCalculator.divide(expectedDividend, expectedDivisor))
            .willThrow(new ArithmeticException("Division by zero"));

        //act
        calcController.divide(expectedDividend, expectedDivisor);
        
        //verification
        then(mockDisplay)
            .should(times(1))
            .display(expectedErrorMessage);
    }

}
