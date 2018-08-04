//Create a text file containing 100 random integers and filter on various criteria
package com.randomintegercollection;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Result {

	public static void main(String[] args) throws IOException {
		
		File file=new File("boy.txt");  //Create text file
		
		PrintWriter printWriter=new PrintWriter(file);
		
		for(int i=0;i<100;i++)
		{
			Random random=new Random();
			printWriter.println(1+random.nextInt(49)); //Write random integers to the file, each on a new line
		}
		printWriter.close();
		
		ArrayList<Integer> intList= new ArrayList<>(); //Create an ArrayList to store integers read from file
		Scanner scanner=new Scanner(file);
		
		while(scanner.hasNextInt()) {
			intList.add(scanner.nextInt()); //Read integers from file and add to ArrayList
		}
		scanner.close();
		
		//Remove duplicates and display sorted ArrayList
		intList.stream().distinct().sorted().forEach(System.out::println); 
	}
}