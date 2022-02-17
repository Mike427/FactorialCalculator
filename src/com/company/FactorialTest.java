package com.company;

public class FactorialTest {

    public static void main(String[] args) {
        long factorial = 1;
        long number = 20;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
            System.out.println(i + "! = " + factorial);
        }
        System.out.printf("Factorial of %d is: %d", number, factorial);
    }
}
