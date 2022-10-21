# 4. Інтерактивні консольні програми для платформи Java SE∗
## Тема
- Реалізація діалогового режиму роботи з користувачем в консольних програмах мовою Java. 
## 1. Вимоги
- Використовуючи програму рішення завдання лабораторної роботи №3, відповідно до прикладної задачі забезпечити обробку команд користувача у вигляді текстового меню:

  - введення даних;
  - перегляд даних;
  - виконання обчислень;
  - відображення результату;
  - завершення програми і т.д.
- Забезпечити обробку параметрів командного рядка для визначення режиму роботи програми:
  - параметр "-h" чи "-help": відображається інформація про автора програми, призначення (індивідуальне завдання), детальний опис режимів роботи (пунктів меню та параметрів командного рядка);
  - параметр "-d" чи "-debug": в процесі роботи програми відображаються додаткові дані, що полегшують налагодження та перевірку працездатності програми: діагностичні повідомлення, проміжні значення змінних, значення тимчасових змінних та ін.

### 1.1 Розробник
- Борисов Ілля Володимирович
- КН-921в
- 2 варіант

### 1.2 Загальне завдання
- Розробити прогрму 
- Оформити роботу


### 1.3 Задача
див. у 1



## 2. Опис програми
- Структура программи:
  - Головний клас з точкою входа в програму знаходиться у пакеті: ua.khpi.oop.borusov04.Main
  -  Графичний інтерфейс знаходится у классі uiInterface;
  -  Робота з текстом реалізована у классі replaceText;
- Компіляція програми у терміналі:
~~~bash

Words changing
[Enter a number to choose an action]
1 - Set values
2 - Display values
3 - Run program
4 - Exit

1
1 line: 
Bla bla bla bla
2 line: 
Ta ta ta

Words changing
[Enter a number to choose an action]
1 - Set values
2 - Display values
3 - Run program
4 - Exit

2
Bla bla bla bla
Ta ta ta

Words changing
[Enter a number to choose an action]
1 - Set values
2 - Display values
3 - Run program
4 - Exit

3

First letter is: B
Bla bla bla bla
Second letter is: T
Ta ta ta


Count length text One: 15
Bla bla bla bla
Count length text Two: 8
Ta ta ta

Words changing
[Enter a number to choose an action]
1 - Set values
2 - Display values
3 - Run program
4 - Exit

-h
Author: Borusov Illia KN-921V

1:
Setting a value for the program

2:
Show entered values

3:
We start the program

4:
Exit program

Task: Використовуючи програму рішення завдання лабораторної роботи №3, відповідно до прикладної задачі забезпечити оброб
ку команд користувача у вигляді текстового меню:

введення даних;
перегляд даних;
виконання обчислень;
відображення результату;
завершення програми і т.д.
Забезпечити обробку параметрів командного рядка для визначення режиму роботи програми:

параметр "-h" чи "-help": відображається інформація про автора програми, призначення (індивідуальне завдання), детальний
 опис режимів роботи (пунктів меню та параметрів командного рядка);
параметр "-d" чи "-debug": в процесі роботи програми відображаються додаткові дані, що полегшують налагодження та переві
рку працездатності програми: діагностичні повідомлення, проміжні значення змінних, значення тимчасових змінних та ін.


Words changing
[Enter a number to choose an action]
1 - Set values
2 - Display values
3 - Run program
4 - Exit

-help
Author: Borusov Illia KN-921V

1:
Setting a value for the program

2:
Show entered values

3:
We start the program

4:
Exit program

Task: Використовуючи програму рішення завдання лабораторної роботи №3, відповідно до прикладної задачі забезпечити оброб
ку команд користувача у вигляді текстового меню:

введення даних;
перегляд даних;
виконання обчислень;
відображення результату;
завершення програми і т.д.
Забезпечити обробку параметрів командного рядка для визначення режиму роботи програми:

параметр "-h" чи "-help": відображається інформація про автора програми, призначення (індивідуальне завдання), детальний
 опис режимів роботи (пунктів меню та параметрів командного рядка);
параметр "-d" чи "-debug": в процесі роботи програми відображаються додаткові дані, що полегшують налагодження та переві
рку працездатності програми: діагностичні повідомлення, проміжні значення змінних, значення тимчасових змінних та ін.


Words changing
[Enter a number to choose an action]
1 - Set values
2 - Display values
3 - Run program
4 - Exit

-d

First letter is: B
Bla bla bla bla
Second letter is: T
Ta ta ta


Count length text One: 15
Bla bla bla bla
Count length text Two: 8
Ta ta ta

Words changing
[Enter a number to choose an action]
1 - Set values
2 - Display values
3 - Run program
4 - Exit

-debug

First letter is: B
Bla bla bla bla
Second letter is: T
Ta ta ta


Count length text One: 15
Bla bla bla bla
Count length text Two: 8
Ta ta ta

Words changing
[Enter a number to choose an action]
1 - Set values
2 - Display values
3 - Run program
4 - Exit

4
~~~
  
### 2.1 Засоби ООП
- Java code convention
- JDK:
- StringBuilder
- OOP
### 2.2 Ієрархія та структура класів
- 1. Main
- 2. uiInterface
- 3. replaceText
### 2.3 Важливі фрагменти програми:
- Сортировка за алфавітом
~~~java
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

~~~
- Сортировка за кількістю знаків
~~~java
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
~~~
## Варіанти використання
Проста програма з інтерфейсом 
## Висновки
На цій лабораторній роботі навчились працювати з основами ООП