package com.example.app;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(5, 7);
        System.out.println("Result: " + result);
    }
}
