//Check if given number(s) is odd,prime and palindrome
package com.performoperation;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PerformOperaton {
	
	public Predicate<Integer> isOdd() {  //Return true if number is odd using Lambda expression
		return  number -> number%2 != 0;
	}
	
	public Predicate<Integer> isPrime() {  //Return true if number is prime using Lambda expression
		return number -> number>1 && IntStream.range(2,number-1).noneMatch(i -> number%i == 0);
	}
	
	public Predicate<Integer> isPalindrome() {  //Return true if number is palindrome using Lambda expression
		return number -> Integer.toString(number).equals(new StringBuilder(Integer.toString(number)).reverse().toString());
	}

}