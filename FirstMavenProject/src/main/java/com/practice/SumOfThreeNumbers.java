package com.practice;

public class SumOfThreeNumbers
{
    public static void main(String[] args) {
        int n1,n2,n3=0;
        System.out.println("welcome to java programming");
        //System.out.println("given sum of 3 no's is:"+m.threeNumbers(1,2,3));
        System.out.println("given sum of 3 no's is:"+SumOfThreeNumbers.threeNumbers());
    }

    public static int threeNumbers(){
        int num1=10,num2=20,num3=30;
        int sum =0;
        sum = num1+num2+num3;
        return sum;
    }
}
