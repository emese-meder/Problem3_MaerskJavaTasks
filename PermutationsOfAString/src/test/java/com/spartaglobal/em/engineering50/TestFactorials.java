package com.spartaglobal.em.engineering50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFactorials {

    Factorials factorials = new Factorials();

    @Test
    public void testFactorialOfThreeIsSix(){
        assertEquals(6, factorials.getFactorial(3) );
    }

    @Test
    public void testFactorialOfZeroIsOne(){
        assertEquals(1, factorials.getFactorial(0) );
    }

    @Test
    public void testFactorialOfOneIsOne(){
        assertEquals(1, factorials.getFactorial(1) );
    }



}
