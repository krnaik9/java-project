/**
 * when you use % it considers remainder
 * when you use / it considers quotient
 */
package com.naik;

import java.util.Scanner;

public class PrintDigitsOfNumber {

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int digit;
		
		while(num!= 0) {
			digit = num%10;
			System.out.print(digit+" ");
			num = num/10;
		}				
		scanner.close();
	}

}
