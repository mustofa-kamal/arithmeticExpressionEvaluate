package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AppTest {

    ArithmeticExpressionUtil aeu;
    int result;

    @Before
    public void runBeforeTestMethod() {
        aeu = new ArithmeticExpressionUtil();
    }

    @Test
    public void testEvaluateExpressionNoBracket() {
        String expression = "1+2*3";
        int expectedResult = 7;
        result = aeu.calculate(expression);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testEvaluateExpressionWithBracket() {
        String expression = "(1+2) * (4 - 2)";
        int expectedResult = 6;
        result = aeu.calculate(expression);
        assertEquals(expectedResult, result);
    }


}
