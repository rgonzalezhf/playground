package com.rga.playground.service;

public class SomeService {

    public String greet() {
        return "Hello!";
    }

    public String greet(String name) {
        return String.format("Hello %s!", name);
    }

}
