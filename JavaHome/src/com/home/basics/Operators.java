package com.home.basics;

public class Operators {
	/*
	 * In Java, when the unary plus operator (+) is applied to a variable of type byte, char, or short
	 * it automatically converts the value to int due to Java's type promotion rules.
	 * Arithmetic operations in Java are designed to use int as the smallest type to ensure consistent results and avoid overflow for smaller types like byte or short.
	 * Without this promotion, calculations involving mixed data types could become complex and error-prone.
	 */
	public static void main(String[] args) {
		ArithmeticOperators operators = new ArithmeticOperators();
		operators.add(10, 20);
		operators.subtract(50, 30);
		operators.multiply(5.5, 4.0);
		operators.divide(20.0f, 4.0f);
		operators.modulus(25, 7);
		operators.addStrings("Hello", " World");
		AssignmentOperators operators1 = new AssignmentOperators();
		operators1.assign(10);
		operators1.addAssign(10, 5);
		operators1.subtractAssign(15, 5);
		operators1.multiplyAssign(3, 4);
		operators1.divideAssign(20, 4);
		operators1.modulusAssign(23, 5);
		operators1.andAssign(5, 3);
		operators1.orAssign(5, 3);
		operators1.xorAssign(5, 3);
		operators1.leftShiftAssign(2, 1);
		operators1.rightShiftAssign(4, 1);
		operators1.unsignedRightShiftAssign(-4, 1);
		LogicalOperators operators2 = new LogicalOperators();
		operators2.logicalAnd(true, false);
		operators2.logicalAnd(true, true);
		operators2.logicalOr(false, false);
		operators2.logicalOr(true, false);
		operators2.logicalNot(true);
		operators2.logicalNot(false);
		ComparisonOperators operators3 = new ComparisonOperators();
		//understand string part when studying strings in java
        operators3.isEqual(10, 20);
        operators3.isEqual("Hello", "Hello");
        operators3.isEqual("Hello", "HELLO");
        operators3.isEqual("Hello", "Govind");
        operators3.isNotEqual(10, 20);
        operators3.isNotEqual("Hello", "Hello");
        operators3.isNotEqual("Hello", "HELLO");
        operators3.isNotEqual("Hello", "Govind");
        operators3.isGreater(20, 10);
        operators3.isLesser(10, 20);
        operators3.isGreaterOrEqual(20, 20);
        operators3.isLesserOrEqual(10, 20);
        TernaryOperator operator4 = new TernaryOperator();
        operator4.maxNum(20,3,54);
        InstanceofOperator operators5 = new InstanceofOperator();
        operators5.checkInstance("Hello", String.class);
        operators5.checkInstance(42, Integer.class);
        operators5.checkInstance(42.0, Number.class);
        operators5.checkInstance("Hello");
        operators5.checkInstance(42);
        operators5.checkInstance(42.0);
        operators5.checkInstance(operators, ArithmeticOperators.class);
        operators5.checkInstance(operators1, ArithmeticOperators.class);
        BitwiseOperator operators6 = new BitwiseOperator();
        operators6.bitwiseAnd(5, 3);
        operators6.bitwiseOr(5, 3);
        operators6.bitwiseXor(5, 3);
        operators6.bitwiseComplement(5);
        operators6.bitwiseComplement(15);
        operators6.bitwiseComplement(55);
        ShiftOperator operators7 = new ShiftOperator();
        operators7.leftShift(5, 2);
        operators7.leftShift(10, 3);
        operators7.rightShift(20, 2);
        operators7.rightShift(10, 3);
        operators7.unsignedRightShift(-20, 2);
        UnaryOperators operators8 = new UnaryOperators();
        operators8.unaryPlus(5);
        operators8.unaryMinus(5);
        operators8.increment(10);
        operators8.decrement(10);
        operators8.logicalNot(true);
        operators8.logicalNot(false);
        operators8.bitwiseComplement(5);
        operators8.bitwiseComplement(-5);
        UnaryPlusPromotion operators9 = new UnaryPlusPromotion();
        operators9.unaryOperator();
        //dot operator
	}
}
class ArithmeticOperators{
	
	void add(int a, int b) {
		System.out.println("Addition of "+a+" and "+b+" is = "+(a + b));
	}
	
	void addStrings(String a, String b) {
		System.out.println("Concatenation of \"" + a + "\" and \"" + b + "\" is = \"" + (a + b) + "\"");
	}
	
	void subtract(int a, int b) {
		System.out.println("Subtraction of " + a + " and " + b + " is = " + (a - b));
	}
	
	void multiply(double a, double b) {
		System.out.println("Multiplication of " + a + " and " + b + " is = " + (a * b));
	}
	
	void divide(float a, float b) {
		if (b != 0) {
			System.out.println("Division of " + a + " by " + b + " is = " + (a / b));
		} else {
			System.out.println("Division by zero is not allowed.");
		}
	}
	
	void modulus(int a, int b) {
		if (b != 0) {
			System.out.println("Modulus of " + a + " and " + b + " is = " + (a % b));
		} else {
			System.out.println("Modulus by zero is not allowed.");
		}
	}
}
class AssignmentOperators {

	void assign(int a) {
		int result = a;
		System.out.println("Assigned value is: " + result);
	}

	void addAssign(int a, int b) {
		a += b;
		System.out.println("After addition assignment, value is: " + a);
	}

	void subtractAssign(int a, int b) {
		a -= b;
		System.out.println("After subtraction assignment, value is: " + a);
	}

	void multiplyAssign(int a, int b) {
		a *= b;
		System.out.println("After multiplication assignment, value is: " + a);
	}

	void divideAssign(int a, int b) {
		if (b != 0) {
			a /= b;
			System.out.println("After division assignment, value is: " + a);
		} else {
			System.out.println("Division by zero is not allowed.");
		}
	}

	void modulusAssign(int a, int b) {
		if (b != 0) {
			a %= b;
			System.out.println("After modulus assignment, value is: " + a);
		} else {
			System.out.println("Modulus by zero is not allowed.");
		}
	}

	void andAssign(int a, int b) {
		a &= b;
		System.out.println("After AND assignment, value is: " + a);
	}

	void orAssign(int a, int b) {
		a |= b;
		System.out.println("After OR assignment, value is: " + a);
	}

	void xorAssign(int a, int b) {
		a ^= b;
		System.out.println("After XOR assignment, value is: " + a);
	}

	void leftShiftAssign(int a, int b) {
		a <<= b;
		System.out.println("After left shift assignment, value is: " + a);
	}

	void rightShiftAssign(int a, int b) {
		a >>= b;
		System.out.println("After right shift assignment, value is: " + a);
	}

	void unsignedRightShiftAssign(int a, int b) {
		a >>>= b;
		System.out.println("After unsigned right shift assignment, value is: " + a);
	}
}
class LogicalOperators {

	void logicalAnd(boolean a, boolean b) {
		System.out.println("Logical AND of " + a + " and " + b + " is: " + (a && b));
	}

	void logicalOr(boolean a, boolean b) {
		System.out.println("Logical OR of " + a + " and " + b + " is: " + (a || b));
	}

	void logicalNot(boolean a) {
		System.out.println("Logical NOT of " + a + " is: " + (!a));
	}
}
class ComparisonOperators {

    void isEqual(int a, int b) {
        System.out.println(a + " == " + b + " : " + (a == b));
    }
    
    void isEqual(String a, String b) {
        System.out.println(a + " == " + b + " : " + (a == b));
    }

    void isNotEqual(int a, int b) {
        System.out.println(a + " != " + b + " : " + (a != b));
    }
    
    void isNotEqual(String a, String b) {
        System.out.println(a + " != " + b + " : " + (a != b));
    }

    void isGreater(int a, int b) {
        System.out.println(a + " > " + b + " : " + (a > b));
    }

    void isLesser(int a, int b) {
        System.out.println(a + " < " + b + " : " + (a < b));
    }

    void isGreaterOrEqual(int a, int b) {
        System.out.println(a + " >= " + b + " : " + (a >= b));
    }

    void isLesserOrEqual(int a, int b) {
        System.out.println(a + " <= " + b + " : " + (a <= b));
    }
}
class TernaryOperator{
	void maxNum(int a, int b, int c) {
		//if a > b and a > c then a
		//if a > b but a < c then c
		//if a < b but a > c or a < c then check is b > c if yes then b else c
		System.out.println("Max number is = "+((a>b)?(a>c)?a:c:(b>c)?b:c));
	}
}
class InstanceofOperator{

	//<?> is a wildcard in generics meaning "any type."
    void checkInstance(Object obj, Class<?> clazz) {
        System.out.println("Is " + obj.getClass().getSimpleName() + " an instance of " + clazz.getSimpleName() + "? : " + clazz.isInstance(obj));
    }
    void checkInstance(Object obj) {
        if (obj instanceof String) {
            System.out.println(obj + " is an instance of String.");
        } else if (obj instanceof Integer) {
            System.out.println(obj + " is an instance of Integer.");
        } else {
            System.out.println(obj + " is not a String or Integer.");
        }
    }
}
class BitwiseOperator{
	// 5 = 0101
	// 3 = 0011
    void bitwiseAnd(int a, int b) {//Sets each bit to 1 if both bits are 1
        System.out.println(a + " & " + b + " = " + (a & b));//0001
    }

    void bitwiseOr(int a, int b) {//Sets each bit to 1 if one of the bits is 1
        System.out.println(a + " | " + b + " = " + (a | b));//0111
    }

    void bitwiseXor(int a, int b) {//same bits then zero else 1
        System.out.println(a + " ^ " + b + " = " + (a ^ b));//0110
    }

    void bitwiseComplement(int a) {//Inverts all the bits
        System.out.println("~" + a + " = " + (~a));//-(0101)+0001 = -(0110) = -6 //-(1111)+(0001) = -(10000) = -16 //-(110111)+(000001) = -(111000) = -56
    }
}
class ShiftOperator{
	// Left shift operator '<<'
    void leftShift(int a, int n) {
        System.out.println(a + " << " + n + " = " + (a << n));//5*(2^2)=5*4=20 //10*(2^3)=10*8=80
    }

    // Right shift operator '>>'
    void rightShift(int a, int n) {
        System.out.println(a + " >> " + n + " = " + (a >> n));//20/(2^2)=20/4=5 //10/(2^3)=10/8=1
    }

    // Unsigned right shift operator '>>>'
    /*
     * In Java, integers are stored in 32 bits using 2's complement representation for signed integers.
     * 20 = 0000 0000 0000 0000 0000 0000 0001 0100
     * Inverted: 1111 1111 1111 1111 1111 1111 1110 1011
     * 2's complement: 1111 1111 1111 1111 1111 1111 1110 1100
     * The >>> operator shifts the bits to the right and fills the leftmost bits with 0 (logical shift).
     * Shift all bits 2 positions to the right, filling the leftmost 2 bits with 0:
     * After shift:  0011 1111 1111 1111 1111 1111 1111 1011
     * This is the sum of powers of 2 where the bits are 1:
	   = 2^30 + 2^29 + 2^28 + ... + 2^3 + 2^1 + 2^0
	   = 1073741824 + 536870912 + 268435456 + ... + 8 + 2 + 1
	   = 1073741819
	   
	   Right Shift Operator (>>)
	   Behavior: Preserves the sign of the number (sign-extended).
	   If the number is negative, the leftmost bits are filled with 1.
	   If the number is positive, the leftmost bits are filled with 0.
	   Usage: It is used for signed numbers, as it maintains the sign of the original number.
	   
	   Unsigned Right Shift Operator (>>>)
	   Behavior: Does not preserve the sign of the number.
	   Regardless of whether the number is positive or negative, the leftmost bits are always filled with 0.
	   Effectively treats the number as an unsigned integer.
	   Usage: It is used when dealing with unsigned binary values or when you want to avoid sign extension.
     */
    void unsignedRightShift(int a, int n) {
        System.out.println(a + " >>> " + n + " = " + (a >>> n));
    }
}
class UnaryOperators {

    void unaryPlus(int a) {
        System.out.println("Unary plus applied to " + a + ": " + (+a));
    }

    void unaryMinus(int a) {
        System.out.println("Unary minus applied to " + a + ": " + (-a));
    }

    void increment(int a) {
        System.out.println("Original value: " + a);
        System.out.println("Post-increment: " + (a++));
        System.out.println("After post-increment: " + a);
        a = a - 1; // Reset for pre-increment
        System.out.println("Pre-increment: " + (++a));
    }

    void decrement(int a) {
        System.out.println("Original value: " + a);
        System.out.println("Post-decrement: " + (a--));
        System.out.println("After post-decrement: " + a);
        a = a + 1; // Reset for pre-decrement
        System.out.println("Pre-decrement: " + (--a));
    }

    void logicalNot(boolean flag) {
        System.out.println("Logical NOT of " + flag + ": " + (!flag));
    }

    void bitwiseComplement(int a) {
        System.out.println("Bitwise complement of " + a + " (~a): " + (~a));
    }
}
class UnaryPlusPromotion{
	void unaryOperator() {
		byte b = 10;
	    char c = 'A'; // Unicode value is 65
	    short s = 20;

	    System.out.println("Result with byte: " + (+b));
	    System.out.println("Result with char: " + (+c));
	    System.out.println("Result with short: " + (+s));
	    
	    InstanceofOperator obj = new InstanceofOperator();
	    obj.checkInstance(+b);
	    obj.checkInstance(+c);
	    obj.checkInstance(+s);
	    
	    Object res = +b;
	    if (res instanceof Integer) {
            System.out.println(res + " is an instance of Integer.");
        }
	    Object res1 = +c;
	    if (res1 instanceof Integer) {
            System.out.println(res1 + " is an instance of Integer.");
        }
	    Object res2 = +s;
	    if (res2 instanceof Integer) {
            System.out.println(res2 + " is an instance of Integer.");
        }
	}
}