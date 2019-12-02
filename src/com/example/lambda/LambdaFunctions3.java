package com.example.lambda;

public class LambdaFunctions3 {
    public static void main(String[] args) {
        //

        Mathematics goodVariableName = (a) -> {
            if (a % 2 == 0)
                return "even";

            else
                return "odd";
        };

        System.out.println(goodVariableName.check(0));
    }

    @FunctionalInterface
    interface Mathematics{
        String check(int number);
    }
}
