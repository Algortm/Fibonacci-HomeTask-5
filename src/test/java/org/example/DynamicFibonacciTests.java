package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DynamicFibonacciTests {
    private DynamicFibonacci dynamicFibonacciObject;

    @BeforeEach
    void BeforeEach(){
        dynamicFibonacciObject = new DynamicFibonacci();
    }
    @Test
    void testThatCalculateDynamicFibonacci(){
        long actually = dynamicFibonacciObject.calculate(6);
        long expected = 8;
        Assertions.assertEquals(expected, actually);
    }
}