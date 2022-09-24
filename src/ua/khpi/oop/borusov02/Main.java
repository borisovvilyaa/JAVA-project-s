package ua.khpi.oop.borusov02;
import java.util.Random;

/**
 * Завдання: Знайти найбільшу цифру в десятковому запису цілочисельного значення.
 *
 * @author Borusov Illia KN-921B
 *
 * @Version 1.2
 */


public class Main {
	 /** An instance of a class Random */
    static Random random = new Random();
    
    /**
     * Finding the largest digit in a number
     *
     * @param value the number in which to look for the largest digit
     * @return the largest digit in a number
     */
    static int findBiggestNumber(int number) {
        if(number < 0) 
        	number *= -1;
        int biggestNumber = 0;
        while (number != 0) {
            if (number % 10 > biggestNumber)
            	biggestNumber = number % 10;
            number /= 10;
        }
        return biggestNumber;
    }
    
    /**
     * Output variables to the console.
	 * @param i cycle number one unit added to house
	 * @param number number in that we are looking for a large digit
	 * @param biggestNumber result of finding the largest digit
     */

    static void print(int i, int number, int biggestNumber) {
    	System.out.println( "\n___________________________________________________\n");
        System.out.println("|#" + (i+1) +"| | Число: " + number + "| | Самая большая цифра: " + biggestNumber + "|");
        System.out.println("___________________________________________________");
    }
    
    /**
     * Program Entry Point
     *
     * @param args command line parameters
     */

	public static void main(String... args) {
		for(int i = 0; i < 10; i++){
            int number = random.nextInt();
            int biggestNumber = findBiggestNumber(number);
            
            print(i, number, biggestNumber);
        }
		
	}

}







