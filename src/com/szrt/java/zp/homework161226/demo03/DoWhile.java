package com.szrt.java.zp.homework161226.demo03;


public class DoWhile {

	public static void main(String[] args) {
		
		table99DoWhile();
		
	}
	/**
	 * do while 打印九九乘法表
	 */
	public static void table99DoWhile(){
		
		int row =1; 
		do{
			int column =1;
			do{
				System.out.print(column+" * "+row+" = "+(row*column));
				System.out.print("\t");
				column++;
			}while(column<=row);
			System.out.println();
			row++;
		}while(row<=9);
		
	}
	
}
