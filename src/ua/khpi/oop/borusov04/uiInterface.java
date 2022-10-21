package ua.khpi.oop.borusov04;


import java.util.Scanner;
public class uiInterface {
	replaceText uiInterface = new replaceText();
	
	private static String textTwo;
	private static String textOne;
	
	private Scanner scanner;
	
	
	/**
     * method to print help information
     * */
    public void help() {
    	System.out.println("Author: Borusov Illia KN-921V\n");
    	System.out.println("1:\nSetting a value for the program\n");
    	System.out.println("2:\nShow entered values\n");
    	System.out.println("3:\nWe start the program\n");
    	System.out.println("4:\nExit program\n");
    	System.out.println("Task: Використовуючи програму рішення завдання лабораторної роботи №3, відповідно до прикладної задачі забезпечити обробку команд користувача у вигляді текстового меню:\r\n"
    			+ "\r\n"
    			+ "введення даних;\r\n"
    			+ "перегляд даних;\r\n"
    			+ "виконання обчислень;\r\n"
    			+ "відображення результату;\r\n"
    			+ "завершення програми і т.д.\r\n"
    			+ "Забезпечити обробку параметрів командного рядка для визначення режиму роботи програми:\r\n"
    			+ "\r\n"
    			+ "параметр \"-h\" чи \"-help\": відображається інформація про автора програми, призначення (індивідуальне завдання), детальний опис режимів роботи (пунктів меню та параметрів командного рядка);\r\n"
    			+ "параметр \"-d\" чи \"-debug\": в процесі роботи програми відображаються додаткові дані, що полегшують налагодження та перевірку працездатності програми: діагностичні повідомлення, проміжні значення змінних, значення тимчасових змінних та ін.\r\n");
    }

    public void debug() {
    	replaceText.sortText(textOne, textTwo);
    }

	
	private boolean matchOptions(String values) {
        boolean result = false;
        switch (values) {
            case "1":
            	scanner = new Scanner(System.in);
        		System.out.println("1 line: ");
        		textOne = scanner.nextLine();
        		System.out.println("2 line: ");
        		textTwo = scanner.nextLine();
        		
            	break;
            case "2":
            	System.out.print(textOne + "\n");
            	System.out.print(textTwo + "\n");
                break;
            case "3":
            	replaceText.sortText(textOne, textTwo);
            	break;
            case "4":
                System.exit(0);
                break;
            case "-h":
            case "-help":
            	help();
                break;
            case "-d":
            case "-debug":
            	debug();
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
