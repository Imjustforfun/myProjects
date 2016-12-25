package com.szrt.java.zp.homework161223.demo02;



import java.util.Scanner;

import org.junit.Test;

public class Interchange {

	@Test
	public void CompareAndChange(){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入第1个要比较的数：");
		int num1 =sc.nextInt();
		System.out.println("请输入第2个要比较的数：");
		int num2 =sc.nextInt();
		sc.close();
		
		System.out.println("你依次输入的两个数分别为："+num1+" "+num2);
		
		if(num1>num2){
			System.out.println("----------------------------------------");
			System.out.println(num2+" "+num1);
			System.out.println("----------------------------------------");
			System.out.println("因为"+num1+"大于"+num2+"所以互换它们的次序！");
		}
			
	}
}
