package com.szrt.java.zp.homework161223.demo10;

import org.junit.Test;

public class DoWhile {

	/**
	 * do while 九九乘法表
	 */
	@Test
	public void table99DoWhile(){
		
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
