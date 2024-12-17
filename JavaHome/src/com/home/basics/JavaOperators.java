package com.home.basics;

import java.util.ArrayList;
import java.util.List;

public class JavaOperators {
	/*
	 * important:-
	 * Any numeric value without floating point is by default type int
	 * Any numeric value with floating point is by default type double
	 * Hence, when initializing float apply 'f', double apply 'd', long apply 'l', and so on...
	 */
	int k = 12;
	
	static void arithmeticOperators() {
		int a = 15;
		int b = 2;
		float a2 = 15f;
		float b2 = 2f;
		String a1 = "Java";
		String b1 = "Home";
		
		//addition
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a1+" + "+b1+" = "+(a1+" "+b1));
		
		//subtraction
		System.out.println(a+" - "+b+" = "+(a-b));
		
		//multiplication
		System.out.println(a+" * "+b+" = "+(a*b));
		
		//division
		System.out.println(a+" / "+b+" = "+(a/b));
		System.out.println(a2+" / "+b2+" = "+(a2/b2));
		
		//modulo
		System.out.println(a+" % "+b+" = "+(a%b));
		System.out.println(b+" % "+a+" = "+(b%a));
		
		//example of precedence and associativity
		System.out.println("Value = "+(a * b / 2 % 2 + b - a));
		System.out.println("Value = "+(10 - 5 + 2 + 10 * 5 / 2 + 5));
	}
	
	static void unaryOperators(){
		int a = 15;
		boolean a1 = true;
		
		//unary minus
		System.out.println(a+" = "+(-a));
		
		//unary plus
	    System.out.println(a+" = "+(+a));
		
		//unary not
		System.out.println(a1+" = "+(!a1));
		
		//unary increment (post) //the value of the operand is incremented but the previous value is retained temporarily until the execution of **this statement** and it gets updated before the execution of the next statement
		System.out.println(a+" = "+(a++));
		
		//unary increment (pre) //the operands value is incremented instantly
		System.out.println(a+" = "+(++a));
		
		//unary decrement (post) //the value of the operand is decremented but the previous value is retained temporarily until the execution of **this statement** and it gets updated before the execution of the next statement
		System.out.println(a+" = "+(a--));
				
		//unary decrement (pre) //the operands value is decremented instantly
		System.out.println(a+" = "+(--a));		
	}
	
	static void ternaryOperator() {
		int a = 15;
		System.out.println((a % 3 == 0 && a % 5 == 0) ? a+" is divisible by both 3 and 5" : a+" is not divisible by both 3 and 5");	
	}
	
	static void relationalOperators() {
		int a = 15;
		int b = 10;
		int c = 15;
		String d = "Hello";
		String e = "hello";
		String f = "Hello";
		
		//equal to
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(d==e);
		System.out.println(d==f);
		
		//not equal to
		System.out.println(a!=b);
		System.out.println(a!=c);
		System.out.println(d!=e);
		System.out.println(d!=f);
		
		//greater than
		System.out.println(a>b);
		System.out.println(a>c);
		
		//less than
		System.out.println(a<b);
		System.out.println(a<c);
		
		//greater than equal to
		System.out.println(a>=b);
		System.out.println(a>=c);
				
		//less than equal to
		System.out.println(a<=b);
		System.out.println(a<=c);
	}
	
	static void logicalOperators() {
		int a = 15;
		int b = 10;
		int c = 15;
		boolean d = false;
		
		//and
		System.out.println(a>=c && a>b);
		//or
		System.out.println(a>=c || a<b);
		//not
		d = !d;
		if(d) {
			System.out.println(d);
		}
	}
	
	static void assignmentOperators() {
		int a = 15;
		int b = 3;
		
		System.out.println("(a+=b) = "+(a+=b));
		
		System.out.println("(a-=b) = "+(a-=b));
		
		System.out.println("(a/=b) = "+(a/=b));
		
		System.out.println("(a%=b) = "+(a%=b));
		
		System.out.println("(a*=b) = "+(a*=b));
		
		System.out.println("(a&=b) = "+(a&=b));
		
		System.out.println("(a|=b) = "+(a|=b));
		
		System.out.println("(a^=b) = "+(a^=b));
		
		System.out.println("(b<<=1) = "+(b<<=1));//(3*2^1)=6
		b = 3;
		System.out.println("(b<<=3) = "+(b<<=3));//(3*2^3)=24
		
		b = 3;
		System.out.println("(b>>=1) = "+(b>>=1));//(3/2^1)=1
		b = 3;
		System.out.println("(b>>=3) = "+(b>>=3));//(3/2^3)=0
		
		b = -3;
		System.out.println("(b>>>=1) = "+(b>>>=1));//2147483646(here leftmost bit is filled with zero regardless of sign)
	}
	
	static void bitwiseOperators() {
		
		int a = 5; //0101
		int b = 7; //0111
		
		//bitwise OR(|):- if either of the bits is 1, it gives 1, else it shows 0
		System.out.println("Bitwise OR = "+(a|b));
		
		//bitwise AND(&):- if both of the bits are 1, it gives 1, else it shows 0
		System.out.println("Bitwise AND = "+(a&b));
		
		//bitwise XOR(^):- if corresponding of the bits are different, it gives 1, else it shows 0
		System.out.println("Bitwise XOR = "+(a^b));
		
		//bitwise complement(~):- inverts all the bits
		// -(0101) + (0001) = -(0110) = -6
		System.out.println("Bitwise Complement = "+~(a));
	}
	
	static void instanceofOperator() {
		JavaOperators obj = new JavaOperators();
		List l1 = new ArrayList();
		System.out.println(obj instanceof JavaOperators);
		System.out.println(l1 instanceof JavaOperators);
		System.out.println(l1 instanceof ArrayList);
		System.out.println(l1 instanceof List);
	}
	
	static void dotOperator() {//member access operator
		//the member access (dot) operator is used frequently to access a field or to call a method on an object
		JavaOperators obj = new JavaOperators();
		System.out.println(obj.k);
		obj.k = 15;
		System.out.println(obj.k);
		System.out.println(obj.toString());
	}
	
	static void shiftOperators() {
		
		//signed left shift(<<):- shifts the bits to the left, filling with zero. also called as zero fill left shift
		//in java, the left shift works the same way for both logical and arithmetic shifts.
		//this is because the left shift always fills the empty positions with zeros, regardless of whetherthe number is signed or unsigned
		//same for both logical and arithmetic shifts
		System.out.println(5<<1);//(5*2^1) = 10
		System.out.println(10<<3);//(10*2^3) = 80
		System.out.println(-10<<3);//(-10*2^3) = -80
		
		//signed right shift(>>):- shifts bits to the right
		//different for logical and arithmetic
		System.out.println(5>>1);//(5/2^1) = 2
		System.out.println(8>>1);//(8/2^1) = 4
		
		//arithmetic(>>):- when we apply the arithmetic right shift the leftmost bit (which is the sign bit) is propagated to preserve the sign of the number.
		System.out.println(-8>>1);//(-8/2^3) = -4
		
		//logical(>>>):- when we apply the logical right shift the leftmost bit is filled with 0, even if the number is negative. It is also called unsigned right shift operator
		System.out.println(-8>>>1);//(-8/2^3) = 2147483644
		
		/*
		 * left shifts(<<) :- always behaves the same way, whether the number is signed or unsigned, because the empty bits are filled with zeros
		 * right shifts(>> vs >>>):- diifer in how the leftmost bits are handled
		 * 1. arithmetic right shift(>>):- preserves the sign by filling the leftmost bits with the original sign bit.
		 * 2. logical right shift(>>>):- fills the leftmost bits with zeros, regardless of the sign bit.
		 *  
		 */
	}

	public static void main(String[] args) {
		arithmeticOperators();
		unaryOperators();
		ternaryOperator();
		relationalOperators();
		logicalOperators();
		assignmentOperators();
		bitwiseOperators();
		instanceofOperator();
		dotOperator();
		shiftOperators();
	}
}
