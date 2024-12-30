package com.angeltravieso.accounts;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    /**
     * Adds two numbers and returns the result
     * @param a the first number
     * @param b the second number
     * @return the sum of the two numbers
     */
    public static int add(int a, int b) {
        System.out.println("Sum: " + (a + b));
        return a + b;
    }

    /**
     * Subtracts two numbers and returns the result
     * @param a the first number
     * @param b the second number
     * @return the difference of the two numbers
     */
    public static int subtract(int a, int b) {
        System.out.println("Difference: " + (a - b));
        return a - b;
    }

    /**
     * Multiples two numbers and returns the result
     * @param a the first number
     * @param b the second number
     * @return the multiplication of the two numbers
     */
    public static int multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
        return a * b;
    }

    /**
     * Divides two numbers and returns the result
     * @param a the first number
     * @param b the second number
     * @return the division of the two numbers
     */
    public static double divide(int a, int b) {
        System.out.println("Quotient: " + (double) a / (double) b);
        return (double) a / (double) b;
    }
}
