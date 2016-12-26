package com.szrt.java.zp.homework161226.demo03;

import java.util.Scanner;


public class SwitchToCall {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入您要拨打的联系人号码，如：1 2 3 4");
		int num =sc.nextInt();
		sc.close();
		phone(num);
		
	}
	
	/**
	 * 输入数字拨打电话
	 * @param num   数字
	 */
	public static void phone(int num){
		
		switch (num) {
		case 1: System.out.println("您拨打了爸爸的号码！"); break;
		case 2: System.out.println("您拨打了妈妈的号码！"); break;
		case 3: System.out.println("您拨打了爷爷的号码！"); break;
		case 4: System.out.println("您拨打了奶奶的号码！"); break;
		
		default: break;
		}
		
	}
}
