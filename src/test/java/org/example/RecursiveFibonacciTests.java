package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class RecursiveFibonacciTests {
    private RecursiveFibonacci recursiveFibonacciObject;

    @BeforeEach
    void BeforeEach(){
        recursiveFibonacciObject = new RecursiveFibonacci();
    }

    @Test
    void testThatCalculateRecursiveFibonacci(){
        long actually = recursiveFibonacciObject.calculate(6);
        long expected = 8;
        Assertions.assertEquals(expected, actually);
    }
}