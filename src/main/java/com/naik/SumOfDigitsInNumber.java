package com.naik;

import java.util.Scanner;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		while(num!=0) {
			sum = sum + num%10;
			num=num/10;			
		}
		System.out.println("Final sum of digits = "+sum);
	}
}
