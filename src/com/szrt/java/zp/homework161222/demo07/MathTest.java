package com.szrt.java.zp.homework161222.demo07;

import org.junit.Test;

public class MathTest {

	/**
	 * = 赋值
	 * == 等于
	 */
	
	@Test
	public void equal01(){
		
		int a=11;
		int b=11;
		System.out.println(a==b);
	}
	
	@Test
	public void equal02(){
		
		//变量可以多次赋值
		double salary =8000;
		salary =salary+2000;
		System.out.println(salary);
		
	}
	
	@Test
	public void equal03(){
		
		//变量在一定区间内不能重复定义
		int num =10;
		//int num =9;
		
		System.out.println(num);
	}
	
	/**
	 * 重点 除法求模的区别
	 */
	
	@Test
	public void mod(){
		
		/**
		 *   / 代表是除法 结果是整数部分 a=9
		 */
		int a =49/5;
		System.out.println(a);
		
		/**
		 *   % 代表是求模 结果是余数部分 b=4
		 */
		int b=49%5;
		System.out.println(b);
	}
	
	@Test
	public void subsub01(){
		
		int a =10;
		int b =a--;
		System.out.println("a: "+a+" "+"b: "+b);
	}
	
	@Test
	public void subsub02(){
		
		int a =10;
		int b =--a;
		System.out.println("a: "+a+" "+"b: "+b);
	}
	
	@Test
	public void addadd01(){
		
		int a =21;
		a =a++;
		System.out.println(a);
	}
	
	@Test
	public void addadd02(){
		
		int a =21;
		int b =a++;
		System.out.println(a);
		System.out.println(b);
	}
	
	@Test
	public void addadd03(){
		
		int a =21;
		int b =++a;
		System.out.println(a);
		System.out.println(b);
	}
	
	@Test
	public void sum01(){
		
		int a =10;
		int b =20;
		double sum =a+b;
		sum =sum+1;
		System.out.println(sum);
	}
	
	@Test
	public void sum02(){
		
		int a =10;
		int b =20;
		double sum=a+b;
		sum =sum++;
		System.out.println(sum);
	}
	
}
