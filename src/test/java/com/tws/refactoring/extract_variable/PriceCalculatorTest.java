package com.tws.refactoring.extract_variable;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PriceCalculatorTest {

    private PriceCalculator priceCalculator;

    @Before
    public void setUp() throws Exception {
        priceCalculator = new PriceCalculator();
    }

    @Test
    public void should_return_1100_when_call_getPrice_given_500 () {
        double result = priceCalculator.getPrice(500,2);
        Assert.assertEquals("1100.0", String.valueOf(result));
    }


    @Test
    public void should_return_1480_when_call_getPrice_given_700 () {
        double result = priceCalculator.getPrice(700,2);
        Assert.assertEquals("1480.0", String.valueOf(result));
    }

    @Test
    public void should_return_1100_when_call_getPrice_given_200 () {
        double result = priceCalculator.getPrice(200,2);
        Assert.assertEquals("440.0", String.valueOf(result));
    }

    @Test
    public void should_return_0_when_call_getPrice_given_0 () {
        double result = priceCalculator.getPrice(0,0);
        Assert.assertEquals("0.0", String.valueOf(result));
    }

}