package com.deloitte.lab09.ex01;
//
//Exercise 1: Write a lambda expression which accepts x and y numbers and return xy.


import java.util.function.BiFunction;

public class App{

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> power = (x, y) -> (int) Math.pow(x, y);
        int x = 2;
        int y = 3;
        int result = power.apply(x, y);

        System.out.println(x + " raised to the power of " + y + " is: " + result);
    }
}
