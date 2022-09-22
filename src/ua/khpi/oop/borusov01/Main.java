package ua.khpi.oop.borusov01;


/**
 * Завдання: Обрати тип змінних та встановити за допомогою констант та літералів початкові значення.
 * Використовуючи десятковий запис цілочисельного значення кожної змінної знайти і підрахувати кількість парних і непарних цифр.
 * Використовуючи двійковий запис цілочисельного значення кожної змінної підрахувати кількість одиниць.
 *
 * @author Borusov Illia KN-921V
 *
 * @Version 1.0
 */


public class Main {
	/** Number in the record book */
	
	static int decentNumber = 0x0002; // 2 => 0003
	
    /** Mobile phone number */
    static long phoneNumber = 380994593546L; 
    
    /** The last two non-zero digits in the phone number */
    static int twoLastNumber = 0b101110; // 46 => 0b101110
    
    /** The last four non-zero digits of the phone number */
    static int fourLastNumber = 6732; // 3547 => 6732
    
    /** determine the increased by one value of the remainder from dividing by 26 the decreased by one student number in the group log */
    static int someName = ((2 - 1) % 26) + 1;
    
    /** A character of the English alphabet in upper case, the number of which corresponds to the previously found value */
    static char letter = 'A';
    
    /**
     * Counts odd numbers
     * @return number of odd
     * @param  a set of numbers from which odd numbers will be counted */

    static int oddCount(long... value) {
        int oddCount = 0;
        for (int i = 0; i < value.length; i++)
            if (value[i] % 2 == 0)
                oddCount++;
        return oddCount;
    }
    
    /**
     * Counting units
     * @return the number of units
     * @param a set of numbers from which units will be counted */

    static int oneCount(long... value) {
        int oneCount = 0;
        for (int i = 0; i < value.length; i++) {
            while (value[i] != 0) {
                if (value[i] % 2 != 0)
                    oneCount++;
                value[i] /= 2;
            }
        }
        return oneCount;
    }
    

    /** Entry point */

	public static void main(String... args) {
        System.out.println("Непарні: " + oddCount(decentNumber, phoneNumber,twoLastNumber, fourLastNumber, someName, letter));
        System.out.println("Одиниці: " + oneCount(decentNumber, phoneNumber,twoLastNumber, fourLastNumber, someName, letter));
	}

}
