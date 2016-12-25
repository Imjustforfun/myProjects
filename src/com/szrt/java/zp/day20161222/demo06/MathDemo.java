package com.szrt.java.zp.day20161222.demo06;

public class MathDemo {

	public static void main(String[] args) {
		
		int c= 88;
		int java= 90;
		int sql= 73;
		
		System.out.println("----------------------------");
		
		System.out.println("C"+"\t"+"Java"+"\t"+"SQL");
		
		System.out.println(c+"\t"+java+"\t"+sql);
		
		System.out.println("----------------------------");
		
		int sub=java-sql;
		
		System.out.println("Java和SQL的成绩差为："+sub);
		
		int sum =c+java+sql;
		
		//整数除以整数只能是整数 整数除以小数肯定是小数 就算能整除 也会加.0
		System.err.println("三门课的平均分为："+sum/3);
		System.err.println("三门课的平均分为："+sum/3.0);
		
		double a =1.23;
		double b =3.21;
		System.out.println(a+b);
		//double存在精度丢失的问题 在面向对象时可以完美解决这个问题
		
	}
	
}
