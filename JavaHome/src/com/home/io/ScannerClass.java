package com.home.io;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

//Exceptions
//InputMismatchException- It will thrown this Exception if the next token is not a valid.
//
//NoSuchElementException- It will thrown this Exception if the input is exhausted.
//
//IllegalStateException- It will thrown this Exception if the innvocation is done after Scanner is closed.

public class ScannerClass {

	public static void main(String[] args) {
		BasicInput bi = new BasicInput();
//		bi.basicInputBoolean();
//		bi.basicInputBoolean("Passing a string that true contains a boolean value");
//		bi.basicInputInt();
//		bi.basicInputInt("Facebook.com 1010 13 + 3.0 = 16 true");
		//similar for byte, short and long data type and also for big integer just convert the result into string
//		bi.basicInputFloat();
//		bi.basicInputFloat("Facebook.com 1010 13 + 3.0 = 16 true");
		//similar for double
//		bi.basicMatch();
//		bi.basicNext();
//		bi.basicInputNextLine();
//		bi.basicInputReset();
//		bi.basicInputSkip();
//		bi.basicInputFindInLine();
//		bi.basicInputFindWithInHorizon();
	}

}
class BasicInput{
	
	void basicInputSkip() {
	    String str = "Java 102 131 Java 150 123 java";
	    Scanner scan = new Scanner(str);
	    String pattern = "[\\s+a-zA-Z]+"; // Regex to match alphabetic strings

	    while (scan.hasNext()) {
	        if (scan.hasNext(pattern)) {
	            scan.skip(pattern); // Skip alphabetic words
	        } else {
	            System.out.println(scan.next()); // Process non-matching tokens
	        }
	    }
	    scan.close();
	}
	void basicInputFindWithInHorizon() {
		//findWithinHorizon() method in Java's Scanner class is used to search for a specific pattern within a specified range (horizon) in the input stream.
		String str = "Hello World! This is Java world";  
        Scanner scanner = new Scanner(str);  
        System.out.println("Output: " + scanner.findWithinHorizon("World",15));  
        System.out.println("Remaining: " + scanner.nextLine());  
        scanner.close();  
	}
	void basicInputFindInLine() {
		String str = "Hello World!";  
        Scanner scanner = new Scanner(str);  
        System.out.println("Output: " + scanner.findInLine("World"));  
        System.out.println("Remaining: " + scanner.nextLine());  
        scanner.close();  
	}
	void basicInputReset() {
		//The reset() method doesn't reset the scanner to its original input state; it only clears any custom settings like delimiters or locales. 
		//Resetting the scanner doesn't reload skipped input.
        Scanner sc = new Scanner("123,456,789");
        //custom delimiter
        sc.useDelimiter(",");
        System.out.println("Custom Delimiter Output:");
        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt());
        }
        // Reset the scanner
        sc.reset();
        sc = new Scanner("123 456 789"); // Re-initialize for new input
        System.out.println("After Reset (Default Delimiter):");
        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt());
        }
        sc.close();
	}
	void basicInputBoolean() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Do you walk 5000 steps daily : ");
			if(sc.nextBoolean()) {
				System.out.println("Good Keep it up");
			}
			else {
				System.out.println("You should make a habit of walking 5000 steps daily");
			}
			sc.close();
		}catch(Exception e) {
			sc.close();
		}
	}
	void basicInputBoolean(String str) {
//		The US Locale is useful in these contexts:
//
//		Number Parsing: Ensures consistent formatting (e.g., 3.14 vs 3,14).
//		Date Formatting: Works with date formats specific to the US.
//		Boolean Recognition: Recognizes true and false regardless of case.
//		Currency Formatting: Displays numbers in US currency format
		
		Scanner sc = new Scanner(str);//creates a new instance of the Scanner class and sets up the scanner to read from the specified input source.
		try {
			sc.useLocale(Locale.US);
			while(sc.hasNext()) {
				if(sc.hasNextBoolean()) {
					System.out.println("Boolean value found in the string : "+sc.nextBoolean());
				}
				else {
					System.out.println("Boolean value not found in the string : "+sc.next());
				}
			}
			sc.close();
		}catch(Exception e) {
			sc.close();
		}
	}
	void basicInputInt() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter your age : ");
			System.out.println("Your age is "+sc.nextInt());
			sc.close();
		}catch(Exception e) {
			sc.close();
		}
	}
	void basicInputInt(String str) {
//		radix: The base of the number system to use while parsing the input.
//		Examples of common radix values:
//		2: Binary
//		8: Octal
//		10: Decimal (default)
//		16: Hexadecimal
		Scanner sc = new Scanner(str);
		try {
			while(sc.hasNext()) {
				if(sc.hasNextInt(2)) {
					System.out.println("Binary value found : "+sc.nextInt(2));
				}
				else if(sc.hasNextInt()) {
					System.out.println("Int value found : "+sc.nextInt());
				}
				else {
					System.out.println("Int value not found : "+sc.next());
				}
			}
			sc.close();
		}catch(Exception e) {
			sc.close();
		}
	}
	void basicInputFloat() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter your amount : ");
			System.out.println("Your balance is : "+sc.nextFloat()*1.5);
			sc.close();
		}catch(Exception e) {
			sc.close();
		}
	}
	void basicInputFloat(String str) {
		Scanner sc = new Scanner(str);
		try {
			while(sc.hasNext()) {
				if(sc.hasNextFloat()) {
					System.out.println("Float Value Found : "+sc.nextFloat());
				}
				else {
					System.out.println("Float value not found : "+sc.next());
				}
			}
			sc.close();
		}catch(Exception e) {
			sc.close();
		}
	}
	void basicMatch() {
		String str = "User:John Age:30 City:NewYork";
		Scanner sc = new Scanner(str);
		try {
			sc.useDelimiter("\\s+");

	        while (sc.hasNext()) {
	            System.out.println(sc.next().toUpperCase());
	        }
	        sc.close();
		}catch(Exception e) {
			sc.close();
		}
		str = "User:John:Age:30:City:NewYork";
		sc = new Scanner(str);
		try {
			sc.useDelimiter("\\:");

	        while (sc.hasNext()) {
	            System.out.println(sc.next().toLowerCase());
	        }
	        sc.close();
		}catch(Exception e) {
			sc.close();
		}
		str = "User:John Age:30 City:NewYork Contact-john@gmail.com";
		sc = new Scanner(str);
		try {
			sc.useDelimiter("\\s+");

	        while (sc.hasNext()) {
	        	String token = sc.next();
	            if(token.matches("(\\w+):(\\w+)")) {
	            	System.out.println("Found : "+token.toUpperCase());
	            }
	            else {
	            	System.out.println("Not Found : "+token.toLowerCase());
	            }
	        }
	        sc.close();
		}catch(Exception e) {
			sc.close();
		}
	}
	void basicNext() {
		String str = "Java 2024 Programming";
        Scanner sc = new Scanner(str);
        System.out.println(sc.next());
        System.out.println(sc.next());
        System.out.println(sc.next());
        sc.close();
        //changing the default delimiter space to numbers
        str = "Java 2024:Programming";
        sc = new Scanner(str);
        sc.useDelimiter("\\:");
        System.out.println(sc.next());
        System.out.println(sc.next());
        sc.close();
        //extract numbers
        str = "Java 2024 :Programming";
        sc = new Scanner(str);
        while(sc.hasNext()) {
        	if(sc.hasNext("[0-9]*")) {
        		System.out.println("Found : "+sc.next("[0-9]*"));
        	}
        	else {
        		System.out.println("Not Found : "+sc.next());
        	}
        }
        sc.close();
        str = "JavaLang Hello World!";  
        sc = new Scanner(str);  
        System.out.println("" + sc.next(Pattern.compile(".....ang")));  
        System.out.println("" + sc.next(Pattern.compile("...lo")));  
        sc.close(); 
        str = "Facebook.com \n Java.com 22 02";  
        sc = new Scanner(str);  
        System.out.println("Token Value1 " + sc.next());  
        System.out.println("Token value2: " + sc.next());  
        sc.close(); 
        
        
        try {
        	File file = new File("C:\\Users\\PRATAP M GAWAS\\OneDrive\\Desktop\\Govind.txt");  
            sc = new Scanner(file);  
            while(sc.hasNext()){  
                System.out.println(sc.next());  
            }  
            sc.close();  
        }catch(Exception e) {
        	sc.close();
        }
    }
	void basicInputNextLine() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter your age : ");
			sc.nextInt();
			System.out.println("Enter your name : ");
			sc.nextLine();//to avoid the complication :- this will eat the \n
			sc.nextLine();//this will take the input
		}catch(Exception e) {
			sc.close();
		}
		try {
			sc = new Scanner(System.in);
			System.out.println("Type your message : ");
			while(true) {
				String msg = sc.nextLine();
				System.out.println(msg);
				if(msg.isEmpty()) {
					break;
				}
			}
			sc.close();
		}catch(Exception e) {
			sc.close();
		}
		try {
			sc = new Scanner("Java\nPython\nSQL");
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
		}catch(Exception e) {
			sc.close();
		}
		try {
			File file = new File("C:\\Users\\PRATAP M GAWAS\\OneDrive\\Desktop\\Govind.txt");
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}catch(Exception e) {
			sc.close();
		}
		
	}
}