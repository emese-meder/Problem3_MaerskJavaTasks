package com.spartaglobal.em.engineering50;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringPermutations {

    StringPermutations stringPermutations = new StringPermutations();
    Factorials factorials = new Factorials();

    @Test
    public void testIfWeGetCorrectOnesForTwoCharWord(){
        assertEquals("[no, on]", Arrays.toString(stringPermutations.getPermutations("no")));
    }

    @Test
    public void testIfWeGetCorrectOnesForTDog(){
        assertEquals("[dog, ogd, gdo, dog, ogd, gdo]", Arrays.toString(stringPermutations.getPermutations("dog")));
    }

    @Test
    public void testIfWeGetCorrectLengthArray(){
        String str = "bow";
        String[] array = stringPermutations.getPermutations(str);
        assertEquals(factorials.getFactorial(str.length()), array.length);
    }

    @Test
    public void testIfWeGetCorrectLengthArrayFor7CharWord(){
        String str = "borrows";
        String[] array = stringPermutations.getPermutations(str);
        assertEquals(factorials.getFactorial(str.length()), array.length);
    }



}
