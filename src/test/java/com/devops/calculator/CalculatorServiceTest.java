package com.devops.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

public class CalculatorServiceTest {

    @Test
    public void testPing() {
        assertThat(new CalculatorService().ping(), containsString("Welcome to Java Maven Calculator Web App!!!"));
    }

    @Test
    public void testAdd() {
        assertEquals(15, new CalculatorService().Add(10, 5).getResult());
    }
    @Test
    public void testSub() {
        assertEquals(15, new CalculatorService().Sub(10, 5).getResult());
    }
@Test
    public void testMul() {
        assertEquals(15, new CalculatorService().Mul(10, 5).getResult());
    }
    @Test
    public void testDiv() {
        assertEquals(15, new CalculatorService().Div(10, 5).getResult());
    }
}
