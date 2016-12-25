package com.szrt.java.zp.homework161223.demo07;

import java.util.Scanner;

import org.junit.Test;

public class SwitchToCall {

	@Test
	public void phone(){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入您要拨打的联系人号码，如：1 2 3 4");
		int num =sc.nextInt();
		sc.close();
		
		switch (num) {
		case 1: System.out.println("您拨打了爸爸的号码！"); break;
		case 2: System.out.println("您拨打了妈妈的号码！"); break;
		case 3: System.out.println("您拨打了爷爷的号码！"); break;
		case 4: System.out.println("您拨打了奶奶的号码！"); break;
		
		default: break;
		}
		
	}
}
