package com.szrt.java.zp.homework161226.demo03;


public class Diamond {

	public static void main(String[] args) {
		
		diamond();
		
	}
	
	/**
	 * 打印菱形
	 */
	public static void diamond(){
		
		for(int i=1;i<=4;i++){
			int star =2*i-1;
			for(int j=1;j<=(7-star)/2;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			int star =7-2*i;
			for(int k=1;k<=star;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
