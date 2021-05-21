package com.example.springdocker.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MyMathCalcTest {

    MyMathCalc m;

    @BeforeEach
    public void beforeMethod(){
        m = new MyMathCalc();
    }

    @DisplayName("Testing add method")
    @Test
    void add() {
        int expected = 4;
        int actual = m.add(2, 2);

        assertEquals(expected, actual);

    }

    @DisplayName("Testing multiply method")
    @Test
    void multiply() {
        int expected = 8;
        int actual = m.multiply(2, 4);

        assertEquals(expected, actual);
    }

    @DisplayName("Testing divide method")
    @Test
    void divide() {
        int expected = 2;
        double actual = m.divide(8, 4);

        assertEquals(expected, actual);
    }

    @DisplayName("Testing divide method with throwing an error")
    @Test
    void divide_throws() {

        assertThrows(ArithmeticException.class, () -> m.divide(8, 0));
    }

}