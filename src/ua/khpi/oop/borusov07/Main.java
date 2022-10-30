package ua.khpi.oop.borusov07;

import java.util.ArrayList;

public class Main {

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
        
        System.out.print(vacancies.getName() 
        		+ "\n" 
        		+ vacancies.getCompany() 
        		+ "\n" 
        		+ vacancies.getWorkingСonditions()
        		+ "\n" 
        		+ vacancies.getEarn() + "$"
        		+ "\n" 
        		+ vacancies.getTerms());
    }

}
