package com.szrt.java.zp.homework161226.demo03;

import java.util.Scanner;


public class Compare {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入第1个要比较的数：");
		int num1 =sc.nextInt();
		System.out.println("请输入第2个要比较的数：");
		int num2 =sc.nextInt();
		sc.close();
		
		maxIfElse(num1, num2);
	}
	
	/**
	 * 比较两个数的大小
	 * @param num1   第1个数
	 * @param num2   第2个数
	 */
	public static void maxIfElse(int num1,int num2){
		
		if(num1>num2){
			System.out.println(num1+"比"+num2+"大，大"+(num1-num2));
		}else if(num1<num2){
			System.out.println(num1+"比"+num2+"小，小"+(num2-num1));
		}else{
			System.out.println("你输入的两个数一样大！");
		}
	}
	
}
