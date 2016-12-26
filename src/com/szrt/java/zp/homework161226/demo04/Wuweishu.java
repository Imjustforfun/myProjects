package com.szrt.java.zp.homework161226.demo04;

import java.util.Scanner;

/**
 * 输入一个不大于5位的正整数，然后判断它是几位数，打印出各位数，并逆序输出这个整数
 * @author zsrt
 *
 */
public class Wuweishu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个不大于5位的正整数:");
		int num = sc.nextInt();
		
		print(num);
		
		sc.close();
	}
	
	public static void print(int num){
		
		if(num/10000>=1){
			System.out.println("你输入的是五位数！（万位数）");
			int[] array = new int[5];
			array[0] = qiuge(num);
			array[1] = qiushi(num);
			array[2] = qiubai(num);
			array[3] = qiuqian(num);
			array[4] = qiuwan(num);
			
			for(int j=array.length-1;j>=0;j--){
				System.out.print(array[j]+" ");
			}
			
			System.out.println();
			System.out.println("逆序输出为：");
			
			for(int i=0;i<=array.length-1;i++){
				System.out.print(array[i]+" ");
			}
			
		}else if(num/1000>=1){
			System.out.println("你输入的是四位数！（千位数）");
			int[] array = new int[4];
			array[0] = qiuge(num);
			array[1] = qiushi(num);
			array[2] = qiubai(num);
			array[3] = qiuqian(num);
			
			for(int j=array.length-1;j>=0;j--){
				System.out.print(array[j]+" ");
			}
			System.out.println();
			System.out.println("逆序输出为：");
			
			for(int i=0;i<=array.length-1;i++){
				System.out.print(array[i]+" ");
			}
			
		}else if(num/100>=1){
			System.out.println("你输入的是三位数！（百位数）");
			int[] array = new int[3];
			array[0] = qiuge(num);
			array[1] = qiushi(num);
			array[2] = qiubai(num);
			
			for(int j=array.length-1;j>=0;j--){
				System.out.println(array[j]+" ");
			}
			
			System.out.println();
			System.out.print("逆序输出为：");
			
			for(int i=0;i<=array.length-1;i++){
				System.out.print(array[i]+" ");
			}
			
			
		}else if(num/10>=1){
			System.out.println("你输入的是二位数！（十位数）");
			int[] array = new int[2];
			array[0] = qiuge(num);
			array[1] = qiushi(num);
			
			for(int j=array.length-1;j>=0;j--){
				System.out.print(array[j]+" ");
			}
			
			System.out.println();
			System.out.println("逆序输出为：");
			
			for(int i=0;i<=array.length-1;i++){
				System.out.print(array[i]+" ");
			}
		}else if(num<10){
			System.out.println("你输入的是一位数！（个位数）");
			int[] array = new int[1];
			array[0] = qiuge(num);
			
			for(int j=array.length-1;j>=0;j--){
				System.out.print(array[j]+" ");
			}
			
			System.out.println();
			System.out.println("逆序输出为：");
			
			for(int i=0;i<=array.length-1;i++){
				System.out.print(array[i]+" ");
			}
			
		}else{
			System.out.println("请按规定输入数字！");
		}
	}
	
	/**
	 * 求num的万位上的数
	 * @param num 用户输入的数字
	 * @return
	 */
	public static int qiuwan(int num){
		int wan = num/10000;
		return wan;
	}
	
	/**
	 * 求num的千位上的数
	 * @param num 用户输入的数字
	 * @return
	 */
	public static int qiuqian(int num){
		int qian = num%10000/1000;
		return qian;
	}
	
	/**
	 * 求num的百位上的数
	 * @param num 用户输入的数字
	 * @return
	 */
	public static int qiubai(int num){
		int bai = num%1000/100;
		return bai;
	}
	
	/**
	 * 求num的十位上的数
	 * @param num 用户输入的数字
	 * @return
	 */
	public static int qiushi(int num){
		int shi = num%100/10;
		return shi;
	}
	
	/**
	 * 求num的个位上的数
	 * @param num 用户输入的数字
	 * @return
	 */
	public static int qiuge(int num){
		int ge = num%10;
		return ge;
	}
}
