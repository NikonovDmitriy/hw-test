package com.example.hw_test.services.calculator_service;

import com.example.hw_test.exceptions.DivisionByZeroException;

public class CalculatorServiceUtil {
    public static final double DELTA = 10e-8;

    static void throwExceptionIfZero(double target) {
        if (Math.abs(target) - 0 < DELTA) {
            throw new DivisionByZeroException();
        }
    }
}
