package com.crio.qcalc;

public class StandardCalculator {
    protected double result;

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }
    public double getResult() {
        return result;
    }
    // public int  automaticConversion(double num1, double num2) {

    // }
    public void setResult(double value) {
        this.result = value;
    }
    public final void add(double num1, double num2) {
        double result = num1 + num2;
        if(result == Double.MAX_VALUE || result == Double.POSITIVE_INFINITY) {
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }
    public final void subtract(double num1, double num2) {
        double result = num1 - num2;
        if(result == -Double.MAX_VALUE || result == -Double.POSITIVE_INFINITY) {
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }
    public final void multiply(double num1, double num2) {
        double result = num1 * num2;
        if(result == Double.MAX_VALUE || result == Double.POSITIVE_INFINITY || result == -Double.POSITIVE_INFINITY ) {
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }
    public final void divide(double num1, double num2) {
        double result = num1 / num2;
        if(result == Double.MAX_VALUE || result == Double.POSITIVE_INFINITY) {
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }
    
    public void clearResult() {

        this.result = 0;

    }
    
    public void printResult(){

        System.out.println("Standard Calculator Result:"+ result);

    }

}
