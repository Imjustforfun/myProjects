package com.szrt.java.zp.homework161223.demo03;

import java.util.Scanner;

import org.junit.Test;

public class Compare {

	/**
	 * if else 比较两个数大小
	 */
	@Test
	public void maxIfElse(){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入第1个要比较的数：");
		int num1 =sc.nextInt();
		System.out.println("请输入第2个要比较的数：");
		int num2 =sc.nextInt();
		sc.close();
		
		if(num1>num2){
			System.out.println(num1+"比"+num2+"大，大"+(num1-num2));
		}else if(num1<num2){
			System.out.println(num1+"比"+num2+"小，小"+(num2-num1));
		}else{
			System.out.println("你输入的两个数一样大！");
		}
	}
	
}
