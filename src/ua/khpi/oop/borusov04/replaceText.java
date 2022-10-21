package ua.khpi.oop.borusov04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class replaceText {
	private static Scanner scanner;
	private static String textTwo;
	private static String textOne;
	
	/**
     * Start function
     *
     * @param textOne, textTwo
     */
	static void sortText (String textOne, String textTwo) {
		System.out.print("\n");
		sortAplphabet(textOne, textTwo);
		count(textOne, textTwo);
	}
	
	/**
     * Sorting text
     *
     * @param textOne, textTwo
     * @return Sort text which alphabet
     */
	static void sortAplphabet (String textOne, String textTwo) {		
		String letterOne = Character.toString(textOne.charAt(0));
		String letterTwo = Character.toString(textTwo.charAt(0));

		ArrayList<String> abc = new ArrayList<String>(); 
		abc.add(letterOne); 
		abc.add(letterTwo); 

		Collections.sort(abc); 
		Iterator<String> itr=abc.iterator();  
		
		if (itr.next() == letterOne) {
			System.out.println("First letter is: "+letterOne);
			System.out.println(textOne);
			System.out.println("Second letter is: "+letterTwo);
			System.out.println(textTwo);
		} else {
			System.out.println("Second letter is: "+letterTwo);
			System.out.println(textTwo);
			System.out.println("First letter is: "+letterOne);
			System.out.println(textOne);
		}
		System.out.println("\n");

	}
	/**
     * Count letter in sting
     *
     * @param textOne, textTwo
     * @return most biggest text
     */
	static void count (String textOne, String textTwo) {
		
		int lengthOne = textOne.length();
		int lengthTwo = textTwo.length();
	
		if (lengthOne > lengthTwo) {
			System.out.println("Count length text One: " +  textOne.length());
			System.out.println(textOne);
			System.out.println("Count length text Two: " +  textTwo.length());
			System.out.println(textTwo);

		} else {
			System.out.println("Count length text Two: " +  textTwo.length());
			System.out.println(textTwo);
			System.out.println("Count length text One: " +  textOne.length());
			System.out.println(textOne);
		}
			
	}
 	
    /**
     * Console application entry point
     *
     * @param args command line parameters
     */
    static void replace() {

    	scanner = new Scanner(System.in);
		System.out.println("1 line: ");
		textOne = scanner.nextLine();
		System.out.println("2 line: ");
		textTwo = scanner.nextLine();
		
		sortText(textOne, textTwo);
    }
}
