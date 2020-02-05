package com.spartaglobal.em.engineering50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSwapChars {
    SwapChars swapChars = new SwapChars();

    @Test
    public void testIfTwoCharsAreSwapped(){
        assertEquals("ba" , swapChars.swap("ab", 0));
    }

    @Test
    public void testIfSecondTwoCharsAreSwappedFromThree(){
        assertEquals("acb" , swapChars.swap("abc", 1));
    }
}
