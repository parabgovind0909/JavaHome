package com.home.basics;

public class FlowControl {
//	If Statement
//	If-Else Statement
//	If-Else-If Ladder
//	Ternary(short hand if)
//	Switch :- The expression can be of type byte, short, char, int, long, enums, String, or wrapper classes (Integer, Short, Byte, Long).
//	For Loop
//	For Each Loop
//	While Loop
//	Do While Loop
//	Break Statement
//	Empty Statement
//	Labeled statement
//	Continue Statement
//	Return Statement
//	Nested
	int fifth() {
		return 12+13;
	}
	void first() {
		System.out.println("First");
		second();
		return;
	}
	void second() {
		System.out.println("Second");
		return;
	}
	void third() {
		System.out.println("Third");
		fourth();
		return;
	}
	void fourth() {
		for(int i = 0 ; i <= 5 ; i++) {
			for(int j = 0 ; j <= 5 ; j++) {
				System.out.println(i*j);
				return;
			}
			System.out.println("Fourth");
		}
		System.out.println("Fourth");
	}
	void currency() {
        String currencyCode = "EUR";
		double amountUSD = 100;
		switch (currencyCode) {
            case "EUR":
                System.out.printf("%.2f USD = %.2f EUR%n", amountUSD, amountUSD * 0.85);
                break;
            case "GBP":
                System.out.printf("%.2f USD = %.2f GBP%n", amountUSD, amountUSD * 0.75);
                break;
            case "INR":
                System.out.printf("%.2f USD = %.2f INR%n", amountUSD, amountUSD * 83.00);
                break;
            case "JPY":
                System.out.printf("%.2f USD = %.2f JPY%n", amountUSD, amountUSD * 150.00);
                break;
            default:
                System.out.println("Invalid currency code. Please enter EUR, GBP, INR, or JPY.");
                break;
        }
	}
	String grade(int marks) {
		return ((marks < 0 || marks > 100)?"Invalid Marks"
				:(marks < 60)?"F"
				:(marks >= 60 && marks <= 69)?"D"
				:(marks >= 70 && marks <= 79)?"C"
				:(marks >= 80 && marks <= 89)?"B":"A");
//		return (marks < 0 || marks > 100) ? "Invalid marks"
//                : (marks >= 90) ? "A"
//                : (marks >= 80) ? "B"
//                : (marks >= 70) ? "C"
//                : (marks >= 60) ? "D"
//                : "F";
	}
	String loanEligibility(int age, int income) {
		if(age>=18 && age<=25){
			if(income < 30000) {
				return "Loan approved at 10% interest rate";
			}
			else if(income >= 30000 && income <=50000) {
				return "Loan approved at 7% interest rate";
			}
			else{
				return "Loan approved at 4% interest rate";
			}
		}
		else if(age > 25){
			if(income < 30000) {
				return "Loan approved at 8% interest rate";
			}
			else if(income >= 30000 && income <=50000) {
				return "Loan approved at 5% interest rate";
			}
			else {
				return "Loan approved at 4% interest rate";
			}
		}
		else{
			return "You are not eligible for loan";
		}
		
	}
	boolean isArmStrongNumber(int v) {
		int sum = 0, n = 0, a = v;
		int e = String.valueOf(v).length();
		while(true) {
			n = a%10;
			a = a / 10;
			sum = sum +(int)(Math.pow(n,e));
			if(a == 0) {
				break;
			}
			
		}
		if(v == sum) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean isPalindrome(int v) {
		int rev = 0, n= v, rem = 0;
		while(n != 0) {
			rem = n % 10;
			rev = (rev*10)+rem;
			n = n / 10;
		}
		if(v == rev) {
			return true;
		}
		else {
			return false;
		}
	}
	void ifStatement() {
		int a = 10, b = 0, c = -5;
		boolean red = false;
		if(a > 0) {
			System.out.println(a+" is a positive number");
		}
		if(a > 0 && a % 2 == 0) {
			System.out.println(a+" is positive and even number");
		}
		if(c < 0 || c > 100) {
			System.out.println(c+" is outside the range 0-100");
		}
		if(red) {
			System.out.println("You can go");
		}
		if(!(red)) {
			System.out.println("You can go");
		}
		if(b == 0) {
			System.out.println(b+" is equal to zero");
		}
		if(b > c) {
			System.out.println(b+" is greater than "+c);
		}
		System.out.println((isArmStrongNumber(9474))?"Is Armstrong number":"Is Not Armstrong number");
		if(a>0) {
			if(b == 0) {
				if(c<0) {
					System.out.println("a greater than zero and b is qual to zero and c is less than zero");
				}
			}
		}
		System.out.println((isPalindrome(1551))?"Is Palindrome number":"Is Not Palindrome number");
		System.out.println(loanEligibility(22, 28000));
		System.out.println(grade(90));
//		Immediate Exit:
//		The return statement terminates the entire method, not just the inner loop.
//		Execution stops completely, and the method returns the specified value (if any) to the caller.
//		Control Transfer:
//		If the method has a return type (e.g., int, String), the value in the return statement is passed back to the calling method.
//		If the method is void, the return statement simply exits the method.
//		break: Exits only the loop in which it is used (e.g., inner loop).
//		return: Exits the entire method, regardless of the number of nested loops.
//		you can return a many more which will discussed ahead
		first();
		third();
		currency();
		float val = fifth();//if short or byte used it will ask for casting which can lead to data loss //with return type as int boolean as value holder can't be used here
		System.out.println(val);
	}

	public static void main(String[] args) {
		FlowControl obj = new FlowControl();
		obj.ifStatement();
	}

}
