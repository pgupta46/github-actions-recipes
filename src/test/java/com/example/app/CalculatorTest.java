package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.add(5, 7));
    }

    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(35, calc.multiply(5, 7));
    }
}
