/**
 * LEAP YEAR - A leap year is a year that contains an extra day, Feb 29th, to keep
 * the calender year synchronized with astronomical year.
 *
 * Given a year 
 * 
 * year%4 == 0 and year%100!=0
 * year%400 == 0 
 */
package com.naik;

import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		System.out.println("Please enter a year");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if(year%4==0 && year%100!= 0 || year%400 == 0) {
			System.out.println("Its a leap year");
		}else {
			System.out.println("Its not a leap year");
		}
		
		scanner.close();
 
	}

}
