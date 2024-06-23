package com.naik;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num<=0) {
			System.out.println("number is not positive to proceed further");
		}else {
			if(num%2 == 0) {
				System.out.println("number is even");
			}else {
				System.out.println("number is odd");
			}
		}

		scanner.close();
	}

}
