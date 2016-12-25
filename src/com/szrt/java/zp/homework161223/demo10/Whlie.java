package com.szrt.java.zp.homework161223.demo10;

import org.junit.Test;

public class Whlie {

	/**
	 * while 九九乘法表
	 */
	@Test
	public void table99While(){
		
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
