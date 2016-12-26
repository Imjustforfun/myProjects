package com.szrt.java.zp.homework161226.demo03;

import java.util.Scanner;


public class SwitchGrade {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入你的考试等级，如：A B C D");
		String level =sc.next();
		sc.close();
		grade(level);
	}
	
	/**
	 * 输入等级给予评价
	 * @param level  等级
	 */
	public static void grade(String level){
		
		switch (level) {
		case "A": System.out.println("你的评价为优秀！"); break;
		case "B": System.out.println("你的评价为良好！"); break;
		case "C": System.out.println("你的评价为及格！"); break;
		case "D": System.out.println("你的评价为不及格"); break;

		default: System.out.println("请输入正确的考试等级！"); break;
		}
	}
}
