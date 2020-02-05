package com.spartaglobal.em.engineering50;

public class SwapChars {

    public String swap(String string, int index) {
        char[] array = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            array[i] = string.charAt(i);
        }
        char spare = array[index];
        array[index] = array[index + 1];
        array[index + 1] = spare;
        return String.valueOf(array);

    }

}
