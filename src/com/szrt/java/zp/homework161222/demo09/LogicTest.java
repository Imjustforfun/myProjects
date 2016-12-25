package com.szrt.java.zp.homework161222.demo09;

import org.junit.Test;

public class LogicTest {

	@Test
	public void pass(){
		
		int yw =59;
		int sx =89;
		boolean yq =yw> 60 && sx>60;
		
		System.out.println(yq);
		
	}
	
	@Test
	public void work01(){
		
		//本科毕业或工作两年以上才能进行初试
		String diploma ="本科";
		int years =0;
		System.out.println(diploma.equals("本科") || years>=2);
	}
	
	@Test
	public void work02(){
		
		//本科毕业或工作两年以上才能进行初试
		String diploma ="专科";
		int years =2;
		System.out.println(diploma.equals("本科") || years>=2);
	}
	
	@Test
	public void work03(){
		
		//本科毕业或工作两年以上才能进行初试
		String diploma ="专科";
		int years =0;
		System.out.println(diploma.equals("本科") || years>=2);
	}
}
