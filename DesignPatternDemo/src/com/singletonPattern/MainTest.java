package com.singletonPattern;

public class MainTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		
		StudentSingletonDemo ssd1 = StudentSingletonDemo.getStudentObject();
		StudentSingletonDemo ssd2 = StudentSingletonDemo.getStudentObject();
		
		System.out.println(ssd1.hashCode());
		System.out.println(ssd2.hashCode());
		
		StudentSingletonDemo ssd3=(StudentSingletonDemo) ssd1.clone();
		System.out.println(ssd3.hashCode());
	}

}
