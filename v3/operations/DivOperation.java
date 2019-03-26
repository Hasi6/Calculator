package com.company.v3.operations;

public class DivOperation implements Operations {

    private final double num1;
    private final double num2;

    public DivOperation(double num1, double num2){

        this.num1 = num1;
        this.num2 = num2;
    }
    @Override
    public double perform() {
        return num1/num2;
    }
}
