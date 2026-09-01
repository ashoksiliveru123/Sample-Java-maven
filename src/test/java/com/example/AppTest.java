package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testMessage() {
        String message = "Hello Maven";
        assertEquals("Hello Maven", message);
    }

    @Test
    public void testAddition() {
        int a = 10;
        int b = 20;
        assertEquals(30, a + b);
    }
}
