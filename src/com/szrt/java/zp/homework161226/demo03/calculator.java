package com.szrt.java.zp.homework161226.demo03;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入第1个数字：");
		int a =sc.nextInt();
		
		System.out.println("请输入1个符号 如：+ - * / %");
		String symbol =sc.next();
		
		System.out.println("请输入第2个数字:");
		int b =sc.nextInt();
		
		sc.close();
		calSwitch(a, symbol, b);
		
		/*Scanner sc =new Scanner(System.in);
		System.out.println("请输入你要计算的第1个数：");
		int num1 =sc.nextInt();
		
		System.out.println("请输入你要计算的符号，如：+ - * / %");
		String symbol =sc.next();
		
		System.out.println("请输入你要计算的第2个数：");
		int num2 =sc.nextInt();
		
		sc.close();
		calIfElse(num1, symbol, num2);*/
	}
	
	/**
	 * switch 计算器
	 * @param a 第1个数
	 * @param symbol 运算符号
	 * @param b 第2个数
	 */
	public static void calSwitch(int a,String symbol,int b){
		switch (symbol) {
		    case "+": System.out.println("你要计算的是："+a+" "+symbol+" "+b+" = "+(a+b)); break;
			case "-": System.out.println("你要计算的是："+a+" "+symbol+" "+b+" = "+(a-b)); break;
			case "*": System.out.println("你要计算的是："+a+" "+symbol+" "+b+" = "+(a*b)); break;
			case "/": System.out.println("你要计算的是："+a+" "+symbol+" "+b+" = "+(a/b)); break;
			case "%": System.out.println("你要计算的是："+a+" "+symbol+" "+b+" = "+(a%b)); break;
	
			default:break;
		}
		
	}
	
	/**
	 * if else计算器
	 */
	
	/**
	 * if else 计算器
	 * @param num1       第1个数
	 * @param symbol 运算符号
	 * @param num2       第2个数
	 *//*
	public static void calIfElse(int num1,String symbol,int num2){
		
		if(symbol.equals("+")){
			System.out.println("你要计算的是："+num1+" "+symbol+" "+num2+" = "+(num1+num2));
		}else if(symbol.equals("-")){
			System.out.println("你要计算的是："+num1+" "+symbol+" "+num2+" = "+(num1-num2));
		}else if(symbol.equals("*")){
			System.out.println("你要计算的是："+num1+" "+symbol+" "+num2+" = "+(num1*num2));
		}else if(symbol.equals("/")){
			System.out.println("你要计算的是："+num1+" "+symbol+" "+num2+" = "+(num1/num2));
		}else if(symbol.equals("%")){
			System.out.println("你要计算的是："+num1+" "+symbol+" "+num2+" = "+(num1%num2));
		}else{
			System.out.println("你的输入有误！");
		}
	}*/
	
}
