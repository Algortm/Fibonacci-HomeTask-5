package org.example;

public class Main {
    public static void main(String[] args) {
        IterationFibonacci resultIteration = new IterationFibonacci();
        System.out.println(resultIteration.calculate(18));
        RecursiveFibonacci resultRecursive = new RecursiveFibonacci();
        System.out.println(resultRecursive.calculate(10));
        DynamicFibonacci resultDynamic = new DynamicFibonacci();
        System.out.println(resultDynamic.calculate(7));
    }
}