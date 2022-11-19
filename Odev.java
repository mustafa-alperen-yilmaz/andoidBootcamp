package com.example.bootcamp1.odev;

public class Odev {
    public double convertToMile(int km){
        double mile;
        mile = km * 0.621;
        return mile;
    }
    public int calculateRectangleArea(int longEdge , int shortEdge){
        int area;
        area = 2 *(longEdge + shortEdge);
        return area;
    }
    public int calculateFactorial(int number){
        int temp = 1;
        int i;
        for(i = 1; i<=number;i++){
            temp = temp*i;
        }
        return temp;
    }
    public int calculateE(String text){
        char whichCharWeNeed = 'e';
        int temp = 0;
        int i;
        for (i = 0; i<text.length();i++){
            if (whichCharWeNeed == text.charAt(i)){
                temp+=1;
            }
        }
        return temp;
    }
    public double calculateInternalAngle(int number){
        int temp;
        double actualCalculation;
        temp = (number-2)*180;
        actualCalculation = temp / number;
        return actualCalculation;
    }
    public int workingPayments(int days){
        int hour = 8;
        int temp , temp2,actual,shift;
        int payment1 = 40;
        int payment2 = 80;
        temp = days*hour;
        if (temp<150){
            return temp*payment1;
        }
        else {
            temp2 = temp-150;
            shift = temp2*payment2;
            actual = 150*payment1;
            return shift+actual;
        }

    }

    public int carparkFee(int hour){
        int fee = 50;
        int temp = 0;
        if (hour == 1){
            return fee;
        }else{
            for (int i = 1; i < hour; i++){
                temp+=10;
            }
            return fee+temp;
        }

    }
}
