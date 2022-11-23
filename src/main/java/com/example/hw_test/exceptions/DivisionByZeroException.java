package com.example.hw_test.exceptions;

public class DivisionByZeroException extends RuntimeException{

    public DivisionByZeroException() {
        super("Division by zero!");
    }
}