//Create a list of random integers using lambda expressions and filter them based on various criteria
package com.intlist;

import java.util.ArrayList;
import java.util.function.Predicate;

public class IntegerList {

	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList<>(); //Create an ArrayList of integers
		
		for(int i=0;i<10;i++)
			intList.add(1+(int)(Math.random()*1000)); //Add 10 random numbers to the list
		
		Predicate<Integer> isEven = number -> number%2==0; //Check if number is even
		Predicate<Integer> isOdd = number -> number%2!=0; //Check if number is odd
		Predicate<Integer> isDivisibleBySix = number -> number%6==0; //Check if number is divisible by 6
		Predicate<Integer> isLessThanTwelve = number -> number<12; //Check if number is less than 12
		Predicate<Integer> isGreaterThanFifty = number -> number>50; //Check if number is greater than 50
		
		System.out.println("Integers in the list are");	//Display all integers in the list
		intList.stream().forEach(System.out::println);
		
		System.out.println("Even numbers from the list are");
		intList.stream().filter(isEven).forEach(System.out::println);  //Display all even numbers
		
		System.out.println("Odd numbers from the list are");	
		intList.stream().filter(isOdd).forEach(System.out::println);  //Display all odd numbers
		
		System.out.println("Numbers divisible by 6 are");	
		intList.stream().filter(isDivisibleBySix).forEach(System.out::println);  //Display all numbers divisible by 6
		
		System.out.println("Numbers less than 12 are");
		intList.stream().filter(isLessThanTwelve).forEach(System.out::println);  //Display all numbers that are less than 12
		
		System.out.println("Numbers greater than 50 are");
		intList.stream().filter(isGreaterThanFifty).forEach(System.out::println);  //Display all numbers that are greater than 50
	}
}