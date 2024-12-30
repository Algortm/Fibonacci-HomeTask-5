package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class IterationFibonacciTests {
    private IterationFibonacci iterationFibonacciObject;

    @BeforeEach
    void beforeEach(){
        iterationFibonacciObject = new IterationFibonacci();
    }

    @Test
    void testThatCalculateIterationFibonacci(){
        long actually = iterationFibonacciObject.calculate(6);
        long expected = 8;
        Assertions.assertEquals(expected,actually);
    }
}