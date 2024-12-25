package com.home.oop;
//for theory it good to read from websites
import java.io.*;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionHandling {
//	private static final Logger logger = Logger.getLogger(ExceptionHandling.class.getName());
	public static void main(String[] args) {
//		try {
//            readFile();
//        } catch (FileNotFoundException e) {
//            logger.log(Level.SEVERE, "File not found", e); // Logging the exception
//        } catch (IOException e) {
//            logger.log(Level.SEVERE, "I/O error occurred", e); // Logging the exception
//        }
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter an integer: ");
            int num = sc.nextInt(); // Will throw InputMismatchException if user enters non-integer input
            System.out.println("You entered: " + num);
            int r = 45/num;
            System.out.println("after division : "+r);
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Error: Invalid input! Please enter a valid non zero integer.");
        } finally {
//            sc.close(); //no need to close explicitly will be automatically closed when try block is completed
            System.out.println("Completed");
        }
		try {
            registerUser(16); // Test with invalid age
        } catch (InvalidAgeException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
		try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
		try {
            System.out.println("Executing try block");
            int result = 10 / 2; // No exception here
        } finally {
            System.out.println("Executing finally block (always runs)");
        }
		try {
            System.out.println("Outer try block");
            try {
                int result = 10 / 0; // This will throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner catch block: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Outer catch block: " + e.getMessage());
        }
		try {
            System.out.println("Executing try block");
        } finally {
            try {
                System.out.println("Executing try block inside finally");
                int result = 10 / 0; // This will throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Error in finally: " + e.getMessage());
            }
        }
		try {
            System.out.println("Try block execution");
            String str = null;
            System.out.println(str.length());  // NullPointerException
            int result = 10 / 0;  // This line is not reached
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
	}
	public static void registerUser(int age) throws InvalidAgeException {
        if (age < 18 || age > 60) {
            throw new InvalidAgeException("Age must be between 18 and 60. Provided age: " + age);
        }
        System.out.println("User registered successfully.");
    }
	
//	public static void readFile() throws FileNotFoundException, IOException {
//	    FileReader file = new FileReader("file.txt");
//	    int data = file.read();
//	    file.close();
//	}
}


//Custom Exception Class
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}
//IOException - Reading a file that may not exist.
class FileReadExample {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("example.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("File not found or unable to read file: " + e.getMessage());
        }
    }
}
//FileNotFoundException - Attempting to open a file that does not exist.
class FileNotFoundExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("missingfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
//ParseException - Parsing a date string in the wrong format.
class DateParseExample {
    public static void main(String[] args) {
        String dateString = "2024/12/25";
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date date = formatter.parse(dateString);
            System.out.println("Parsed date: " + date);
        } catch (ParseException e) {
            System.out.println("Date parsing failed: " + e.getMessage());
        }
    }
}
//NoSuchMethodException - Trying to reflectively invoke a non-existing method.
class MethodReflectionExample {
    public static void main(String[] args) {
        try {
            Method method = String.class.getMethod("nonExistentMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found: " + e.getMessage());
        }
    }
}
//InstantiationException - Attempting to instantiate an abstract class.
class InstantiationExample {
    public static void main(String[] args) {
        try {
            Class<?> cls = AbstractClassExample.class;
            Object obj = cls.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            System.out.println("Instantiation failed: " + e.getMessage());
        }
    }
}
abstract class AbstractClassExample {
    // Abstract class cannot be instantiated
}
//SQLException - Database connection issues or invalid SQL queries.
class SQLExceptionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nonexistentDB";
        String user = "root";
        String password = "password";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }
}
//ClassNotFoundException - Loading a class dynamically that doesn't exist in the classpath.
class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.nonexistent.ClassName");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found. Please check the classpath.");
        }
    }
}
//MalformedURLException - Invalid URL format when creating a URL object.
class MalformedURLExceptionExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("invalid://example");
        } catch (MalformedURLException e) {
            System.out.println("The URL format is invalid.");
        }
    }
}
//InterruptedException - A thread is interrupted while sleeping or waiting.
class InterruptedExceptionExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread is going to sleep.");
                Thread.sleep(5000);
                System.out.println("Thread woke up naturally.");
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted before completing sleep.");
            }
        });

        thread.start();

        // Wait for 2 seconds before interrupting the thread
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting.");
        }

        thread.interrupt();
    }
}
