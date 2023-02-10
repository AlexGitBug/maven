package org.example;

import java.util.function.Supplier;

public class App {

    public static void main(String[] args) {
        Supplier<String> s = () -> "hello world!";
    }
}
