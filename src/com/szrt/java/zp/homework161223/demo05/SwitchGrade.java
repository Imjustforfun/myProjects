package com.szrt.java.zp.homework161223.demo05;

import java.util.Scanner;

import org.junit.Test;

public class SwitchGrade {

	@Test
	public void grade(){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入你的考试等级，如：A B C D");
		String level =sc.next();
		sc.close();
		
		switch (level) {
		case "A": System.out.println("你的评价为优秀！"); break;
		case "B": System.out.println("你的评价为良好！"); break;
		case "C": System.out.println("你的评价为及格！"); break;
		case "D": System.out.println("你的评价为不及格"); break;

		default: System.out.println("请输入正确的考试等级！"); break;
		}
	}
}
