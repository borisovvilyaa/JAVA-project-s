package ua.khpi.oop.borusov08;


import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Main {
	private static Scanner scanner;
	public static void main(final String[] arguments) {
		
        final vacancies vacancies = new vacancies();
        
        ArrayList<String> terms = new ArrayList<String>();
        
        // Initialize an ArrayList with add()
        terms.add("Computer since");
        terms.add("4");
        terms.add("None");
        
        vacancies.setName("Фрон-енд");
        vacancies.setCompany("Distributed Lab");
        vacancies.setWorkingСonditions("Дистанційно");
        vacancies.setEarn(3000);
        vacancies.setTerms(terms);
        
        final vacancies vacancies1 = new vacancies();
        
        ArrayList<String> terms1 = new ArrayList<String>();
        
        // Initialize an ArrayList with add()
        terms1.add("Computer since");
        terms1.add("1");
        terms1.add("Bacalavr");
        
        vacancies1.setName("Бэк-энд");
        vacancies1.setCompany("Epam");
        vacancies1.setWorkingСonditions("Офіс");
        vacancies1.setEarn(5400);
        vacancies1.setTerms(terms1);
       
        
        List<vacancies> list = new ArrayList<>();
        list.add(vacancies);
        list.add(vacancies1);
        
        fullVacanises full = new fullVacanises();
        full.setVacancies(list);
        	
        scanner = new Scanner(System.in);
        System.out.print("Entry path: ");
		String path = scanner.nextLine();

       
        try {
			XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(path + ".xml")));
			x.writeObject(full);
			x.close();
			System.out.println("Done");
        } catch (FileNotFoundException e) {
		
			e.printStackTrace();
			System.out.println("Error");
		}
        
        
    }

	

}
