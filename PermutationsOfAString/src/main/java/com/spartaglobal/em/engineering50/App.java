package com.spartaglobal.em.engineering50;

/*
Problem 3: Print all permutations of String
Write a Java program to print all permutations of a given String.
For example, if given String is "GOD" then your program should print
all 6 permutations of this string, e.g. "GOD," "OGD," "DOG," "GDO," "ODG," and "DGO."

Please write the unit tests for your solution using any of the unit testing framework.
 */


import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        StringPermutations stringPermutations = new StringPermutations();
        System.out.println(Arrays.toString(stringPermutations.getPermutations("dog") ));

    }
}
