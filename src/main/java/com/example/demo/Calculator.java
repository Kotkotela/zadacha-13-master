package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Qualifier("subtractor")
    @Autowired
    private Operation subtractor;

    @Qualifier("adder")
    @Autowired
    private Operation adder;

    @Qualifier("multiplication")
    @Autowired
    private Operation multiplication;

    @Qualifier("division")
    @Autowired
    private Operation division;

    public void calc(double a, double b) {
        System.out.print("Subtraction: " + subtractor.getResult(a, b));
        System.out.print(" Addition: " + adder.getResult(a, b));
        System.out.print(" multiplication: " + multiplication.getResult(a, b));
        System.out.print(" division: " + division.getResult(a, b) + "   ");
    }
}