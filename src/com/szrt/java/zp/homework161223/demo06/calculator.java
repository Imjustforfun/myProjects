package com.szrt.java.zp.homework161223.demo06;

import java.util.Scanner;

import org.junit.Test;

public class calculator {

	/**
	 * switch计算器
	 */
	@Test
	public void calSwitch(){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入第1个数字：");
		int a =sc.nextInt();
		
		System.out.println("请输入1个符号 如：+ - * / %");
		String symbol =sc.next();
		
		System.out.println("请输入第2个数字:");
		int b =sc.nextInt();
		
		sc.close();
		
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
	
	@Test
	public void calIfElse(){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入你要计算的第1个数：");
		int num1 =sc.nextInt();
		
		System.out.println("请输入你要计算的符号，如：+ - * / %");
		String symbol =sc.next();
		
		System.out.println("请输入你要计算的第2个数：");
		int num2 =sc.nextInt();
		
		sc.close();
		
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
				
	}
	
}
