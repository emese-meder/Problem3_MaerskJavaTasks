package com.spartaglobal.em.engineering50;

public class Factorials {

    static int getFactorial(int positiveInteger) {
        if (positiveInteger == 1 || positiveInteger == 0) {
            return 1;
        } else {
            return positiveInteger * getFactorial(positiveInteger - 1);
        }
    }
}
//for the purpose of this task, code is not accounting for number inputs below zero
// as the input number here is never less than zero since it will be a length of a string


