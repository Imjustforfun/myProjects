package com.szrt.java.zp.homework161223.demo01;

import java.util.Scanner;

import org.junit.Test;

public class RunNian {

	@Test
	public void runNian(){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个年份，我来告诉你是不是闰年：");
		int year =sc.nextInt();
		sc.close();
		
		if(year%400==0){
			System.out.println(year+"为闰年！");
		}else if(year%4==0 && year%100!=0){
			System.out.println(year+"为闰年！");
		}else{
			System.out.println(year+"不是闰年！");
		}
	}
}
