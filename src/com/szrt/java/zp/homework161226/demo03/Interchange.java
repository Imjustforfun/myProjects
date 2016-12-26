package com.szrt.java.zp.homework161226.demo03;

import java.util.Scanner;

public class Interchange {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入第1个要比较的数：");
		int num1 =sc.nextInt();
		System.out.println("请输入第2个要比较的数：");
		int num2 =sc.nextInt();
		sc.close();
		
		CompareAndChange(num1, num2);
	}
	
	/**
	 * 比较两个数的大小，若第1个数大于第2个数，则位置互换
	 * @param num1   第1个数
	 * @param num2   第2个数
	 */
	public static void CompareAndChange(int num1,int num2){
		
		System.out.println("你依次输入的两个数分别为："+num1+" "+num2);
		
		if(num1>num2){
			System.out.println("----------------------------------------");
			System.out.println(num2+" "+num1);
			System.out.println("----------------------------------------");
			System.out.println("因为"+num1+"大于"+num2+"所以互换它们的次序！");
		}
			
	}
}
