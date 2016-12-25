package com.szrt.java.zp.homework161223.demo10;

import org.junit.Test;

public class For {

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
}
