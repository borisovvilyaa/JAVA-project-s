package ua.khpi.oop.borusov06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class uiInterface {
	
	private Scanner scanner;
	
	private boolean matchOptions(String values) {
        boolean result = false;
        switch (values) {
            case "1":
            	textReplace replace = new textReplace();
            
            	try (FileOutputStream fs = new FileOutputStream("out.dat");
            	    	ObjectOutputStream oos = new ObjectOutputStream(fs)){
            			oos.writeObject(replace);
        	    		System.out.println("Done...");
            	    } catch (IOException ex) {
            	    	ex.printStackTrace(System.out);
            	    }
            	break;

            default:
                System.out.println("You printed wrong value!");
        }
        return result;
    }
    public void start() {
        System.out.println();
        System.out.println("Words changing");
        System.out.println("[Enter a number to choose an action]");
        System.out.println("1 - Set values");
        System.out.println("2 - Display values");
        System.out.println("3 - Run program");
        System.out.println("4 - Exit");
        System.out.println();
        scanner = new Scanner(System.in);
		String value = scanner.nextLine();
        if (matchOptions(value)) {
        	System.out.print("Done");
        } else {
            start();
        }
    }
}
