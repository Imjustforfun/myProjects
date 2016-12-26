package com.szrt.java.zp.homework161226.demo03;


public class For {

	public static void main(String[] args) {
		
		for99Table();
		System.out.println();
		for99Table2();
		
	}
	
	/**
	 * for 循环语句
	 * 正序输出           九九乘法表
	 */
	public static void for99Table(){
		
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" * "+i+" = "+(j*i));
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * for循环语句
	 * 倒序输出        九九乘法表
	 */
	public static void for99Table2(){
		
		for(int i=9;i>=1;i--){
			for(int j=9;j>=i;j--){
				System.out.print(j+" * "+i+" = "+(j*i));
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
