package com.szrt.java.zp.homework161226.demo03;


public class HollowDiamond {

	public static void main(String[] args) {
		
		hollowDiamondSpace();
		
		hollowDiamodNumber();
		
	}
	
	/**
	 * 空格定位 打印空心菱形
	 */
	public static void hollowDiamondSpace(){
		
		for(int s=1;s<=3;s++){
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();
		
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3-i;j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k=1;k<=2*i-1;k++){
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		for(int i=1;i<=2;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int k=1;k<=5-2*i;k++){
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		for(int s=1;s<=3;s++){
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();
	}
	
	/**
	 * 位置定位 打印空心菱形
	 */
	public static void hollowDiamodNumber(){
		//top
		for(int i=1;i<=7;i++){
			if(i!=4){
				System.out.print(" ");
			}else{
				System.out.print("*");
			}
		}
		System.out.println();
		
		//1
		for(int i=1;i<=3;i++){
			for(int j=1;j<=7;j++){
				if(j==4-i || j==4+i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//2
		for(int i=1;i<=2;i++){
			for(int j=1;j<=7;j++){
				if(j==1+i || j==7-i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//bottom
		for(int i=1;i<=7;i++){
			if(i!=4){
				System.out.print(" ");
			}else{
				System.out.print("*");
			}
		}
		System.out.println();
		
	}
}
		
						
		
		

