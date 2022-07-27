package com.zoolatech.lecture4.tasks._3;

/**
 * Create a functional interface StringModifier with a method modify that accepts a string and returns a modified
 * string. In the main class create a method that accepts a string value and a lambda expression, applies the lambda
 * to the value and outputs the result. In the main method create two lambda expressions that implement the interface:
 * one should convert all characters to the lower case, second - to the upper case. Both lambdas should prepend
 * a prefix “modified: ” before the modified values (e.g., “test” -> “modified: TEST”). Call the defined method
 * with some string value and both lambdas. Call the same method with two method references that just convert
 * all characters to the lower and upper case.
 */

public class Task3 {
    public static void main(String[] args) {
        StringModifier stringUp = (expression) -> {
            String result = expression.toUpperCase();
            return result;
        };
        StringModifier stringDown = (expression) -> {
            String result = expression.toLowerCase();
            return result;
        };

        String expression = "LonDoN IS tHe CaPItaL of GREAt britaIn";
        printResult(expression, stringUp);
        printResult(expression, stringDown);
    }

    public static void printResult(String expression, StringModifier stringModifier) {
        System.out.println("'" + expression + "' -> modified:'" + stringModifier.modify(expression) + "'");
    }
}
