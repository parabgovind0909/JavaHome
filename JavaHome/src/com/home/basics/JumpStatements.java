package com.home.basics;

public class JumpStatements {

	static String name;
	JumpStatements(String name){
		this.name = name;
	}
	/*
	 * important note :- 
	 * In while and do-while loops, continue causes the control to got **directly** to test condition and then to the iteration process.
	 */
	static void breakStatement() {
		int a = 5;
		int i = 0;
		for(;i<=a;i++) {//in for loop all three(initialization,inc/dec,condition) are optional
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		i=0;
		while(i!=a) {
			if(i==3) {
				break;
			}
			System.out.println(i);
			i++;
		}
		enum Color {R,G,B};
		switch(Color.B) {
		case R:
			System.out.println("Red Color");
			break;
		case G:
			System.out.println("Green Color");
			break;
		case B:
			System.out.println("Blue Color");
			break;
		default:
			System.out.println("Invalid Color");
		}
	}
	static void continueStatement() {
		int a = 5;
		int i = 0;
		do {
			i++;
			if(i==3) {
				continue;
			}
			System.out.println(i);
			i++;//read the important
		}while(i!=a);
		
		int[] arr = {10,20,30,40,50};
		for(int b : arr) {
			if(b==30) {
				continue;
			}
			System.out.println(b);
		}
	}
	
	//return can also be used in constructors, try-catch, lambda expressions, etc...
	static void returnStatement() {
		int n = 5;
		System.out.println("The Factorial Of "+n+" is = "+factorial(n));
		System.out.println("The square of number "+n+" is = "+square(n));
		compare(5,8);
		int[] arr = {10,20,30,-40,50};
		System.out.println("Array Has Negative Values = "+check(arr));
		name = getName(null);
		System.out.println((name==null)?"No name":"Name is "+name);
		name = getName(new JumpStatements("Govind"));
		System.out.println((name==null)?"No name":"Name is "+name);
		System.out.println(getStatus(404));
	}
	static String getName(JumpStatements obj) {
		if(obj == null) {
			return null;
		}
		return name;
	}
	static String getStatus(int code) {
		switch(code) {
		    case 200:
		    	return "OK";
		    case 404:
		    	return "Not Found";
		    default:
		    	return "Unknown";
		}
	}
	static boolean check(int[] arr) {
		for(int i : arr) {
			if(i<0) {
				return true;
			}
		}
		return false;
	}
	static int square(int n) {
		return n*n;
	}
	static long factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);
	}
	static void compare(int a,int b) {
		if(a==b) {
			System.out.println(a+" Equal to "+a);
			return;
		}
		if(a>b) {
			System.out.println(a+" Greater than "+b);
			return;
		}
		if(a<b) {
			System.out.println(a+" Less than "+b);
			return;
		}
	}
	static void emptyStatement() {
		int a = 110;
		if(a>20);
		if(a<100) {};
		while(a<2);//if you make conditon true then it will become infinite loop
		for(;a<110;) {};//if you make conditon true then it will become infinite loop
		do {}while(a<2);//if you make conditon true then it will become infinite loop
	}
	
	public static void main(String[] args) {
		breakStatement();
		continueStatement();
		returnStatement();
		emptyStatement();
	}
}
