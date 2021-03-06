package com.szrt.java.zp.homework161223.demo10;

import org.junit.Test;

public class For {

	/**
	 * 正序输出
	 */
	@Test
	public void for99Table(){
		
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" * "+i+" = "+(j*i));
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * 倒序输出
	 */
	@Test
	public void for99Table2(){
		
		for(int i=9;i>=1;i--){
			for(int j=9;j>=i;j--){
				System.out.print(j+" * "+i+" = "+(j*i));
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
