package com.spartaglobal.em.engineering50;

import java.util.Arrays;

public class StringPermutations {

    public String[] getPermutations(String string) {

        String[] permutations = new String[Factorials.getFactorial(string.length())];
        permutations[0] = string;
        int i = 0;
        permutations[i] = string;
        i++;
        while (!String.valueOf(permutations).contains(string) && i < permutations.length) {
            for (int j = 0; j < string.length() - 1; j++) {
                //permutations[i] += Character.toString(string.charAt(string.length() - j - 1));
                SwapChars swapChars = new SwapChars();
                string = swapChars.swap(string, j);
            }
            permutations[i] = string;
            i++;
        }

        return permutations;
    }

}
