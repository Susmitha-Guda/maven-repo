package com.lti;

public class Calc {
	
	public static int add(int num1,int num2) {
		return num1+num2;
	}
	
	public static int diff(int num1,int num2) {
		return num1-num2;
	}
	public static int mul(int num1,int num2) {
		return num1*num2;
	}
	public static int div(int num1,int num2) {
		return num1/num2;
	}
	
	public static void main(String[] args)
	{
		System.out.println(add(10,20));
		System.out.println(diff(50,20));
		System.out.println(mul(50,20));
		System.out.println(div(50,25));
	}

}
