package com.example.bootcamp1.odev;

public class OdevMain {
    public static void main(String[] args) {
        Odev odev = new Odev();
        System.out.println(odev.convertToMile(100));
        System.out.println(odev.calculateRectangleArea(5,10));
        System.out.println(odev.calculateFactorial(5));
        System.out.println(odev.calculateE("deneme"));
        System.out.println(odev.calculateInternalAngle(5));
        System.out.println(odev.workingPayments(20));
        System.out.println(odev.carparkFee(2));
    }
}
