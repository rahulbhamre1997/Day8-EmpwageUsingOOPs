package com.empwage.oops;

import java.util.Random;

public class EmpWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage problem using OOPs");
		
		Random ran = new Random();
		int present = 1;
		int empCheck = ran.nextInt(2);
		if (empCheck == present) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	
	}
}
