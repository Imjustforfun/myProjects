package com.szrt.java.zp.homework161226.demo03;


public class Whlie {

	public static void main(String[] args) {
		
		table99While();
		
	}
	
	/**
	 * while 九九乘法表
	 */
	public static void table99While(){
		
		int row =1;
		while(row<=9){
			int column =1;
			while(column<=row){
				System.out.print(column+" * "+row+" = "+(row*column));
				System.out.print("\t");
				column++;
			}
			row++;
			System.out.println();
		}
	}
}
