package org.example;

public class IterationFibonacci implements FibonacciCalculate{
    @Override
    public long calculate(int n){
        if(n<=1){
            return n;
        }
        long a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
