package com.szrt.java.zp.homework161223.demo04;

import java.util.Scanner;

import org.junit.Test;

public class Exam {

	/**
	 * if else
	 * >=90优
     * >=80良
     * >=70及格
     * else 不及格
	 */
	
	@Test
	public void examIfElse(){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入你的考试成绩：");
		int score =sc.nextInt();
		sc.close();
		
		if(score<=100 && score>=90){
			System.out.println("你的成绩为优秀！");
		}else if(score<90 && score>=80){
			System.out.println("你的成绩为良好！");
		}else if(score<80 && score>=70){
			System.out.println("你的成绩为及格");
		}else{
			System.out.println("你的成绩不及格");
		}
	}
	
	/**
	 * switch
	 * >=90优
     * >=80良
     * >=70及格
     * else 不及格
	 */
	
	@Test
	public void examSwitch(){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入你的考试成绩：");
		int score =sc.nextInt();
		sc.close();
		
		int temp =score/10;
		
		switch (temp) {
		case 10:System.out.println("你的成绩为优秀！"); break;
		case 9: System.out.println("你的成绩为优秀！"); break;
		case 8: System.out.println("你的成绩为良好！"); break;
		case 7: System.out.println("你的成绩为及格！"); break;
		
		default:System.out.println("你的成绩为不及格！");break;
		}
	}
	
}
