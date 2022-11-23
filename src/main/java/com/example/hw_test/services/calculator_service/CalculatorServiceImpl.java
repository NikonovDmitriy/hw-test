package com.example.hw_test.services.calculator_service;

import com.example.hw_test.services.CalculatorService;
import org.springframework.stereotype.Service;

import static com.example.hw_test.services.calculator_service.CalculatorServiceUtil.throwExceptionIfZero;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double difference(double a, double b) {
        return a - b;
    }

    @Override
    public double division(double a, double b) {
        throwExceptionIfZero(b);
        return a / b;
    }
}

