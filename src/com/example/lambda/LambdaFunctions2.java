package com.example.lambda;

public class LambdaFunctions2 {

    public static void main(String[] args) {
        // without parameter
        HelloWorld hi = () -> System.out.println("Hello World with Functional Interface and Lambda Function");

        hi.sayHi();
    }

    @FunctionalInterface
    interface HelloWorld{
        void sayHi();
    }
}
