package com.example.homework_2_3.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    @Override
    public int addition(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public int subtraction(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public int multiplication(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public double division(Integer a, Integer b) {
        if(b==0) throw new IllegalArgumentException("На ноль делить нельзя");
        return (double) a / b;
    }
}