package com.spartaglobal.em.engineering50;

public class StringPermutations {

    public String[] getPermutations(String string) {

        String[] permutations = new String[Factorials.getFactorial(string.length())];
        int i = 0;
        permutations[i] = string;
        i++;
        while (!String.valueOf(permutations).contains(string) && i < permutations.length) {
            for (int j = 0; j < string.length() - 1; j++) {
                SwapChars swapChars = new SwapChars();
                string = swapChars.swap(string, j);
            }
            permutations[i] = string;
            i++;
        }

        return permutations;
    }

}
