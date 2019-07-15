package com.tws.refactoring.extract_variable;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {

    @Test
    public void should_return_1100_when_call_getPrice_given_500 () {
        PriceCalculator priceCalculator = new PriceCalculator();
        double result = priceCalculator.getPrice(500,2);
        Assert.assertEquals("1100.0", String.valueOf(result));
    }


    @Test
    public void should_return_1480_when_call_getPrice_given_700 () {
        PriceCalculator priceCalculator = new PriceCalculator();
        double result = priceCalculator.getPrice(700,2);
        Assert.assertEquals("1480.0", String.valueOf(result));
    }

    @Test
    public void should_return_1100_when_call_getPrice_given_200 () {
        PriceCalculator priceCalculator = new PriceCalculator();
        double result = priceCalculator.getPrice(200,2);
        Assert.assertEquals("440.0", String.valueOf(result));
    }

    @Test
    public void should_return_0_when_call_getPrice_given_0 () {
        PriceCalculator priceCalculator = new PriceCalculator();
        double result = priceCalculator.getPrice(0,0);
        Assert.assertEquals("0.0", String.valueOf(result));
    }

}