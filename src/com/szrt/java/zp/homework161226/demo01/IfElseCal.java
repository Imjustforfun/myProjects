package com.szrt.java.zp.homework161226.demo01;

import java.util.Scanner;

public class IfElseCal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("请输入你要运算的符号,如：+ - * / 或输入：quit退出！");
			String symbol = sc.next();
			if(symbol.equals("quit")){
				System.out.println("你已退出计算器，欢迎下次再使用！");
				break;
			}
			
			System.out.println("请输入你要计算的第1个数：");
			int one = sc.nextInt();
			
			System.out.println("请输入你要计算的第2个数：");
			int two = sc.nextInt();
			
			cal(symbol,one,two);
		}
		sc.close();
	}
	
	/**
	 * if else 条件语句
	 * 两个整数的间的简单运算
	 * @param symbol 运算符号：'+' '-' '*' '/' '%'
	 * @param one    第1个数
	 * @param two    第2个数
	 */
	public static void cal(String symbol,int one,int two){
		
		if(symbol.equals("+")){
			System.out.println(one+two);
		}else if(symbol.equals("-")){
			System.out.println(one-two);
		}else if(symbol.equals("*")){
			System.out.println(one*two);
		}else if(symbol.equals("/")){
			System.out.println(one/two);
		}else if(symbol.equals("%")){
			System.out.println(one%two);
		}
	}

}
