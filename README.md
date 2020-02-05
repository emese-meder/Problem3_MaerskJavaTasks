# Problem 3 - Permutations of a string

* Number Three of the six java coding challenges for beginners by Maersk for Sparta Global Academy.

Write a Java program to print all permutations of a given String. For example, if given String is "GOD" then your program should print all 6 permutations of this string, e.g. "GOD," "OGD," "DOG," "GDO," "ODG," and "DGO."

Please write the unit tests for your solution using any of the unit testing framework.

## Instructions to build and run the code

    1. Open the project in Intellij
    2. Navigate to the App.java file in the project explorer
    3. Run the main method

* Note: App.java can be found in Problem3_MaerskJavaTasks\PermutationsOfAString\src\main\java\com\spartaglobal\em\engineering50\App.java

* In main, the getPermutations() method accepts a String as an input and returns an array with all the permutaions of the string.

## Platform limitations

* No notable limitations for Intellij.

## Dependencies

* JUnit 5.6.0 https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api 

## Assumptions

* Output is a String array.

* for the purpose of this task, the method in Factorials class is not accounting for number inputs below zero as the input number here is never less than zero since it will be a length of a string.

## Highlights

* StringPermutations class.

* Code Coverage on SwapChars class methods: 100% lines: 100%.

* Code Coverage on Factorials class methods: 100% lines: 100%.

* Code Coverage on StringPermutations class methods: 100% lines: 100%.


## Improvements

* make Factorials class potentially reusable by handling potential negative inputs. 

