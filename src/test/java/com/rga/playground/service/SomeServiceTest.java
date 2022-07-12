package com.rga.playground.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeServiceTest {

    private SomeService service = new SomeService();

    @Test
    public void shouldGreet() {

        String greet = service.greet();

        assertEquals("Hello!", greet);
    }

    @Test
    public void shouldGreetMe() {

        String greet = service.greet("MyName");

        assertEquals("Hello MyName!", greet);
    }
}
