package com.home.basics;

import java.util.Scanner;

public class DecisionMaking {
	
	static int a;
	static Scanner sc;
	
	static void getValue(int n) {
		try {
			sc = new Scanner(System.in);
			if(n == 0) {
				System.out.println("Enter a number : ");
				a = sc.nextInt();
				sc.nextLine();
			}
			else {
				System.out.println("Enter a bool value : ");
				a = (sc.nextBoolean()?1:0);
				sc.nextLine();
			}
			
			
			
		}
		catch(Exception e) {
			System.out.println("Exception is : "+e.toString());
			sc.close();
		}
	}
	
	static void ifStatement() {
		getValue(0);
		//if statement to check if number is positive, negative or neutral
		if(a > 0) {
			System.out.println(a+" is a positive number");
		}
		if(a < 0) {
			System.out.println(a+" is a negative number");
		}
		if(a == 0) {
			System.out.println(a+" is a neutral number");
		}
	}
	
	static void ifElseStatement() {
		getValue(0);
		//if-else statement to check if number is even or odd
		if(a % 2 == 0) {
			System.out.println(a+" is a even number");
		}
		else {
			System.out.println(a+" is a odd number");
		}
	}
	
	static void nestedIfStatement() {
		getValue(0);
		//nested if to check age based permissions
		if(a > 18) {
			getValue(1);
			if(a == 1) {
				System.out.println("You are eligible to vote");
			}
			else {
				System.out.println("You are not eligible to vote");
			}
		}
		else {
			System.out.println("You are not eligible to vote");
		}
	}
	
	static void ternaryOperator() {
		getValue(0);
		//check if number is divisible by both 3 and 5 or not
		System.out.println((a % 3 == 0 && a % 5 == 0) ? a+" is divisible by both 3 and 5" : a+" is not divisible by both 3 and 5");	
	}
	
	static void ifElseLadder() {
		getValue(0);
		//check the grade obtained by student based on marks
		if(a > 90) {
			System.out.println("Grade O");
		}
		else if(a > 80) {
			System.out.println("Grade A");
		}
		else if(a > 70) {
			System.out.println("Grade B");
		}
		else if(a > 60) {
			System.out.println("Grade C");
		}
		else if(a > 50) {
			System.out.println("Grade D");
		}
		else if(a > 35) {
			System.out.println("Grade E");
		}
		else {
			System.out.println("Grade F");
		}
	}
	
	static void switchStatement() {
		//with integer
		int dayOfWeek = 5;
		switch(dayOfWeek) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Day of Week");
		}
		
		//with enum
		enum Color {RED,GREEN,ORANGE};
		switch(Color.GREEN) {
		case RED:
			System.out.println("Red Color");
			break;
		case GREEN:
			System.out.println("Green Color");
			break;
		case ORANGE:
			System.out.println("Orange Color");
			break;
		default:
			System.out.println("Invalid Color");
		}
		
		//with string
		String msg = "Afternoon";
		switch(msg) {
		case "Morning":
			System.out.println("Good Morning");
			break;
		case "Afternoon":
			System.out.println("Good Afternoon");
			break;
		case "Evening":
			System.out.println("Good Evening");
			break;
		case "Night":
			System.out.println("Good Night");
			break;
		default:
			System.out.println("Invalid Message");
		}
		
		//with char
		char grade = 'B';
		switch(grade) {
		case 'O':
			System.out.println("Between 90-100");
			break;
		case 'A':
			System.out.println("Between 80-90");
			break;
		case 'B':
			System.out.println("Between 70-80");
			break;
		case 'C':
			System.out.println("Between 60-70");
			break;
		case 'D':
			System.out.println("Between 35-60");
			break;
		case 'F':
			System.out.println("Between 0-35");
			break;
		default:
			System.out.println("Invalid Grade");	
		}
		
		//with expression and without default statement
		switch(50 % 2) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		}
	}

	public static void main(String[] args) {
		ifStatement();
		ifElseStatement();
		nestedIfStatement();
		ternaryOperator();
		ifElseLadder();
		switchStatement();
		sc.close();
	}
}