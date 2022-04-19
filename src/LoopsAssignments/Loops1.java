package LoopsAssignments;

public class Loops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * A1. WAP to print following output: 
		 *   
		 * I am Batman﻿
		 * I am Batman﻿
		 * I am Batman﻿ 
		 * I am Batman
		 * I am Batman
		 */

		String test="I am Batman";
		
		for(int i=0; i<5; i++) {
			System.out.println(test);
		}
		
		/*
		 * A2: WAP to print following output: 
		 * I am Batman 1
		 * I am Batman 2
		 * I am Batman 3
		 * I am Batman 4
		 * I am Batman 5
		 * I am Batman 6
		 * I am Batman 7 
		 * I am Batman 8
		 * I am Batman 9
		 */	
		
		for(int k=1; k<10; k++) {
			System.out.println(test+" "+k);
		}
		}

}
