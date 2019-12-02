package com.example.lambda;

public class LambdaFunctions {

    public static void main(String[] args) {

        Operations addition = (int val1, int val2) -> val1 + val2;

        // with body
        Operations subtraction = (val1, val2) -> {
            System.out.println("It's subtraction");
            return val1 - val2;
        };

        System.out.println(addition.operation(2,3));
        System.out.println(subtraction.operation(4,-2));
    }

    @FunctionalInterface
    interface Operations{
        int operation(int val1, int val2);
    }




}
