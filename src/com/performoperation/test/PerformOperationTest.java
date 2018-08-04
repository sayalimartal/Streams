//Test if entered number is odd,prime and palindrome
package com.performoperation.test;

import java.util.Scanner;

import com.performoperation.PerformOperaton;

public class PerformOperationTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		PerformOperaton performOperaton = new PerformOperaton();
		
		System.out.println("Enter a number");
		int number = scanner.nextInt();  //Input a number
		scanner.close();
		
		if(performOperaton.isOdd().test(number))  //Display if number is odd or not
			System.out.println(number+" is odd");
		else
			System.out.println(number+" is even");
		
		if(performOperaton.isPrime().test(number))  //Display if number is prime or not
			System.out.println(number+" is prime");
		else
			System.out.println(number+" is not prime");
		
		if(performOperaton.isPalindrome().test(number))  //Display if number is palindrome or not
			System.out.println(number+" is a palindrome number");
		else
			System.out.println(number+" is not a palindrome number");

	}
}
