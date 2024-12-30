package org.example;

import java.util.ArrayList;

public class IterationFibonacci implements FibonacciCalculate{
    @Override
    public long calculate(int n){
        ArrayList<Long> arrayList = new ArrayList<>();
        if(n<=1){
            return n;
        }
        long result = 2L;
        arrayList.add(0L);
        arrayList.add(1L);
        for(int i = 2; i<=n; i++){
            arrayList.add(arrayList.get(i-1)+arrayList.get(i-2));
            result = arrayList.get(i);

        }
        return result;
    }
}
