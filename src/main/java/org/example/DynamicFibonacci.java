package org.example;

import java.util.HashMap;
import java.util.Map;

class DynamicFibonacci implements FibonacciCalculate{
    @Override
    public long calculate(int n){
        Map<Integer,Long> arrayMap = new HashMap<>();
        if(n<=1){
            return n;
        }
        if(arrayMap.containsKey(n)){
            return arrayMap.get(n);
        }
        long result = calculate(n-1)+calculate(n-2);
        arrayMap.put(n, result);
        return result;
    }
}
