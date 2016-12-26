package com.szrt.java.zp.homework161226.demo03;

import java.util.Scanner;

public class RunNian {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个年份，我来告诉你是不是闰年：");
		int year =sc.nextInt();
		sc.close();
		runNian(year);
	}
	
	/**
	 * 判断是输入年份是否为闰年
	 * @param year 年份
	 */
	public static void runNian(int year){
		
		if(year%400==0){
			System.out.println(year+"为闰年！");
		}else if(year%4==0 && year%100!=0){
			System.out.println(year+"为闰年！");
		}else{
			System.out.println(year+"不是闰年！");
		}
	}
	
}
