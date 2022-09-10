package com.selflearning;
//try catch 1
public class unit30 {
    public static void main(String[] args) {


        try {
           int a = 8;
           int  b = 0;
            System.out.println("a / b = " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error " + e.toString());
            System.out.println("tra ve a = " );
        } finally {
            System.out.println("dap an " );
        }

    }




}