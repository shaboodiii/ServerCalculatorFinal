package com.calculatorServer.CalculatorServer.model;

public class Calculator {

    private double xValue;
    private double yValue;
    private String operator;

    public Calculator() {
    }

    public Calculator(double xValue, double yValue, String operator) {
        this.xValue = xValue;
        this.yValue = yValue;
        this.operator = operator;
    }

    public double getxValue() {
        return xValue;
    }

    public void setxValue(double xValue) {
        this.xValue = xValue;
    }

    public double getyValue() {
        return yValue;
    }

    public void setyValue(double yValue) {
        this.yValue = yValue;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "xValue=" + xValue + '\'' +
                ", yValue=" + yValue + '\'' +
                ", operator='" + operator + '\'' +
                '}';
    }
}
