package com.comapanyname.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       App a =new App();
       System.out.println(a.msgPrint());
       System.out.println("addition of two number is:"+a.sumOfTwoNum(10,20));
       System.out.println("subtraction of two numbers is:"+a.subOfTwoNum(30,10));
    	System.out.println( "Hello World!" );
    }



public String msgPrint()
{
	String st1="say hello";
	return st1;
	}
public int sumOfTwoNum(int num1,int num2)
{
	int sum=0;
	sum=num1+num2;
	return sum;
}

public int subOfTwoNum(int num1,int num2)
{
	int sub=0;
	sub=num1-num2;
	return sub;
	}
}
