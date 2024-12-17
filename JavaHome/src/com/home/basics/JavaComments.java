package com.home.basics;

/**
 * Javadoc for class
 * This class represents multiple methods for understanding the comments and its types in java.
 * @author Govind
 * @version 1.0
 * @since 17-12-2024
 */
public class JavaComments {
	
	/**
	 * Javadoc for field
	 * The make of the car (e.g., Honda, BMW)
	 */
	//private String make;//note that doc of private is not added 
	
	public static void singleLineComment() {
		//Single line comments are useful for short notes or inline explanations.
		System.out.println("Single line comments are used to comment a single line of code or add a short explanation.");
	}
	public static void multiLineComment() {
		/*
		 * Multi Line comments are better when you need to explain more complex logic or temporarily disable code blocks.
		 * This is a static method and can be called even before creating the object of class.
		 */
		System.out.println("Multi Line comments are used for longer description or temporarily disabling large portions of code during debugging.");
	}
	public static void javaDocComment() {
		/*
		 * Javadoc is a tool and a special kind of comment in java that is used to generate HTML-based documentation for java classes, methods and fields.
		 * It is essential for documenting your code in a standardized way so that other developers can easily understand its functionality, parameters, return values and other relevant details.
		 */
		/*
		 * Javadoc is both:
		 * A Comment Syntax used within the java source code to provide detailed documentation for classes, methods and fields
		 * A tool(command-line utility) that extracts these comments from the source code and generates HTML documentation.
		 */
		/*
		 * This is the standard format for documenting code in java, and is widely used to create API documentation for java libraries and frameworks.
		 * Javadoc comments must be placed immediately before the class, method, or field you want to document. The comment start with /** and then ends with *\/(\ this is escape character).
		 */
		/*
		 * Inside javadoc comments there are special tags that provide structure and help to organize the documentation.
		 * These tags are used to specify parameters, return values, exceptions and more.
		 * common tags are defined below:
		 * @param - describes a method parameter
		 * @return - describes what the method returns
		 * @author - indicates the author of class, method, etc.
		 * @version - specifies the version of class, method, etc.
		 * @throws/@exception - describes the exceptions thrown by the methods
		 * @see - references other classes, methods or fields for further reading
		 * @since - specifies when a feature or method was introduced
		 * @deprecated - marks a method, class or field as deprecated
		 */
		System.out.println("The javadoc tool generates HTML documentation from these javadoc comments, providing easily accessible API documentation.");
		
	}
	/**
	 * Javadoc for method
	 * This method adds two integers and returns the result
	 * @param n1 the first integer to add
	 * @param n2 the second integer to add
	 * @return the sum of n1 and n2
	 */
	public static int add(int n1, int n2) {
		return n1+n2;
	}
	public static void main(String[] args) {
		singleLineComment();
		multiLineComment();
		javaDocComment();
		System.out.println(add(12,3));
	}
}
