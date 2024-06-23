/**
 * Credit score
 * 			400 to 600 --- Silver Card
 * 			600 to 800 --- Gold Card
 * 			800 to 850 --- Platinum Card
 */
package com.naik;

import java.util.Scanner;

public class CreditCardIssuer {

	public static void main(String[] args) {
		System.out.println("Please enter a credit score");
		Scanner scanner = new Scanner(System.in);
		int creditScore = scanner.nextInt();
		if(creditScore<400 || creditScore>850) {
			System.out.println("Its a invalid credit score");
		}else if(creditScore>=400 && creditScore<600) {
			System.out.println("Its a silver card");
		}else if(creditScore>=600 && creditScore<800) {
			System.out.println("Its a gold card");
		}else {
			System.out.println("Its a platinum card");
		}
				
		scanner.close();

	}

}
