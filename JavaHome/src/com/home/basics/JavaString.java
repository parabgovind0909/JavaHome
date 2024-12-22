package com.home.basics;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class JavaString {

	public static void main(String[] args) {
//		String str1 = "GeeksforGeeks"; // Stored in String Constant Pool
//        String str2 = "GeeksforGeeks"; // Refers to the same object in the pool
//        String str3 = "GFG";           // New object in the pool
//        String str4 = str1+"";//string is immutable so a new object is created
//        // Comparing references
//        System.out.println(str1 == str2); // true (both refer to the same object)
//        System.out.println(str1 == str3); // false (different objects)
//        System.out.println(str1 == str4); // false
//        System.out.println(Integer.toHexString(System.identityHashCode(str1)));
//        System.out.println(Integer.toHexString(System.identityHashCode(str2)));
//        System.out.println(Integer.toHexString(System.identityHashCode(str3)));
//        System.out.println(Integer.toHexString(System.identityHashCode(str4)));
        
//        String str1 = new String("Welcome"); // Creates an object in the heap
//        String str2 = new String("Welcome"); // Another new object in the heap
//        String str3 = "Welcome";             // Refers to the constant pool
//        String str4 = str2;
//        String str5 = str3;
//        
//        // Comparing references
//        System.out.println(str1 == str2); // false (different heap objects)
//        System.out.println(str1 == str3); // false (different memory locations)
//        System.out.println(str1.equals(str3)); // true (content comparison)
//        System.out.println(Integer.toHexString(System.identityHashCode(str1)));
//        System.out.println(Integer.toHexString(System.identityHashCode(str2)));
//        System.out.println(Integer.toHexString(System.identityHashCode(str3)));
//        System.out.println(Integer.toHexString(System.identityHashCode(str4)));
//        System.out.println(Integer.toHexString(System.identityHashCode(str5)));
		JavaString obj = new JavaString();
//		obj.stringClasses();
//		obj.stringInterface();
		StringMethods s = new StringMethods();
		s.basicMethods();
	}
	void stringInterface() {
//		CharSequence Interface Implemented by classes such as String, StringBuilder, and StringBuffer.
//		Contains methods to work with character sequences.
		
//		The CharSequence interface represents any readable sequence of characters. 
//		This allows Java to handle text data in various forms without being tied to a specific implementation, such as String or StringBuilder.
//		Instead of writing separate code for String, StringBuilder, and StringBuffer, 
//		the CharSequence interface allows you to write general-purpose methods that can handle all these types.
		// This method can work with any CharSequence implementation:
		printString("Hello");               // String
		printString(new StringBuilder("Hi")); // StringBuilder
		printString(new StringBuffer("Hey")); // StringBuffer
//		The CharSequence interface improves interoperability between different APIs that may use different implementations for character data.
//		For example:
//		Some libraries may return StringBuilder or StringBuffer objects.
//		By accepting CharSequence in your methods, you can process these objects without needing explicit conversion.
		System.out.println(reverse("Hello")); // Works with String
	    System.out.println(reverse(new StringBuilder("World"))); // Works with StringBuilder
//	    charsequence promotes flexibility, reusability, and consistency across different implementations (String, StringBuilder, StringBuffer),
//	    making it easier to write generic and maintainable code.
	    
//	    Promotes Loose Coupling
//	    Interfaces like CharSequence promote loose coupling between different parts of your code. 
//	    If you depend on a specific class like String, your code is tightly coupled to that class.
//	    Loose coupling makes your code easier to test, maintain, and extend.
	    
	    
//	    Polymorphism allows an object of a class that implements an interface to be referenced by that interface type.
//	    In your case, "Hello, World!" is a String, and since String implements CharSequence, it is perfectly valid to assign it to a CharSequence reference.
//	    The reference type (CharSequence) determines what methods can be called on the object.
//	    Only the methods declared in the CharSequence interface are accessible.
	    
	    
//	    An interface reference means you use the name of the interface as the type of the variable (e.g., CharSequence cs).
//	    This reference can point to any object of a class that implements the interface.
//
//	    In Java, if a class implements an interface, that class guarantees it has implemented all the methods defined in the interface.
//	    Therefore, any object of that class can be treated as an object of the interface, but only the methods defined in the interface are accessible through the reference.
//
//	    The actual type of the object (e.g., String) determines the behavior when a method is called.
//	    The reference type (e.g., CharSequence) restricts what methods you can call to only those defined in the interface.
//	    
//	    Polymorphism allows objects of different classes to be treated as objects of a common interface. 
//	    The actual behavior depends on the runtime type of the object, not the reference type.
	    
//	    There are two main types of polymorphism:
//    	Compile-time (Static) Polymorphism: Achieved through method overloading.
//    	Runtime (Dynamic) Polymorphism: Achieved through method overriding and dynamic method dispatch.
//    	
//    	At compile-time, the compiler ensures that length() is a valid method in the CharSequence interface.
//    	At runtime, the JVM dynamically determines that cs refers to a String object and invokes the length() method implemented in the String class. 
//	    This process is called dynamic method dispatch, and it is the basis of runtime polymorphism.
	    
//	    Method Binding at Runtime: The actual implementation of the method (in this case, String.length()) is determined 
//	    during runtime based on the object type (String), not the reference type (CharSequence).
    	

//	    Only the methods defined in the interface are accessible through the interface reference, even if the object is of a class that has more methods.
	    CharSequence cs = "Hello"; // String object
	    System.out.println(cs.length()); // Allowed (CharSequence method)
	    // cs.toUpperCase(); // Error: toUpperCase() is not in CharSequence
//	    Even though the reference is of type CharSequence, the length() method behaves according to the actual object type (String in this case).
	}
	static void printString(CharSequence cs) {
		System.out.println(cs);
	}
	public static String reverse(CharSequence cs) {
	    StringBuilder reversed = new StringBuilder(cs.length());
	    for (int i = cs.length() - 1; i >= 0; i--) {
	        reversed.append(cs.charAt(i));
	    }
	    return reversed.toString();
	}
	void stringClasses() {
//		String
//		Immutable: Once a String object is created, its value cannot be changed.
//		Suitable for situations where string content does not need frequent modification.
		String s1 = "Hello";
        String s2 = s1.concat(" World");
        System.out.println(s1); // Output: Hello (original remains unchanged)
        System.out.println(s2); // Output: Hello World
//        Any modification creates a new string object.
//        Best for read-only operations.
        
        
//        StringBuffer
//        Mutable: You can modify the content of a StringBuffer object.
//        Thread-safe: It is synchronized, meaning multiple threads can safely use it.
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb); // Output: Hello World
        sb.insert(6, "Java ");
        System.out.println(sb); // Output: Hello Java World
        sb.replace(6, 10, "C++");
        System.out.println(sb); // Output: Hello C++ World
        sb.reverse();
        System.out.println(sb); // Output: dlroW ++C olleH
        System.out.println(sb.capacity());
//        Use when thread safety is required, and strings need frequent modification
        
        
//        StringBuilder
//        Mutable: Similar to StringBuffer.
//        Not thread-safe: Faster than StringBuffer as it is not synchronized.
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" World");
        System.out.println(sb1); // Output: Hello World
        sb1.delete(6, 11);
        System.out.println(sb1); // Output: Hello
//        Use when thread safety is not a concern and performance is critical.
        
        
//        StringTokenizer
//        Used to break a string into tokens based on a delimiter.
//        Less flexible than modern alternatives like String.split().
        StringTokenizer st = new StringTokenizer("Hello World Java", " ");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println(st.countTokens());
//        Useful for simple tokenization.
//        Modern alternatives like String.split() are often preferred.
        
        
//        StringJoiner
//        Introduced in Java 8 for joining strings with a delimiter, prefix, and suffix.
//        Simplifies joining strings in a readable way.
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add("Apple").add("Banana").add("Cherry");
        System.out.println(sj); // Output: [Apple, Banana, Cherry]
//        Flexible for creating formatted strings with custom delimiters, prefixes, and suffixes.
	}
}
class StringMethods{
	void basicMethods() {
		String a = "Hello";
		// length - Returns the number of characters in the string.
		System.out.println(a.length());
		
		// charAt(int index) - Returns the character at the specified index.
		System.out.println(a.charAt(1));
		
		// codePointAt(int index) - Returns the Unicode code point at the specified index.
		System.out.println(a.codePointAt(2));
		
		//codePointBefore(int index) - Returns the unicode value of the character before the specified index in a string
		System.out.println(a.codePointBefore(2));// so it will give unicode value of char at index 2-1 = 1
		
		// codePointCount(int beginIndex, int endIndex) - Returns the number of unicode values found in a string(i.e the characters that has unicode values)
		System.out.println(a.codePointCount(0, 5));
		
		// equals(Object obj) - Compares two strings for equality.
		String b = "hello";
		String c = "Art";
		String d = "Hello";
		System.out.println(a.equals(b));//false
		System.out.println(a.equals(c));//false
		System.out.println(a.equals(d));//true
		
		// equalsIgnoreCase(String anotherString) - Compares strings, ignoring case considerations.
		System.out.println(a.equalsIgnoreCase(b));//true
		
		// trim() - Removes leading and trailing spaces.
		System.out.println("  Govind  ".trim());
		
		// isEmpty() - Checks if the string is empty
		System.out.println("   ".isEmpty());//false
		
		// isBlank() - Checks if the string is blank (empty or contains only whitespace).
		System.out.println("   ".isBlank());//true
		
		// Lower and Upper case
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		
		//concat and + operator
		System.out.println(c.concat(" "+d));
		System.out.println("Kite"+" Flying");
		
		// string from char array
		char z[] = {'A','n','i','s','h'};
		System.out.println(new String(z));
		
		// toCharArray() - Converts the string into a character array.
		String l = "Animals";
        char[] chars = l.toCharArray();
        for (char m : chars) {
            System.out.println(m);
        }
		
		// indexOf(int ch) - Finds the first occurrence of a character in the string
		// indexOf(int ch, int fromIndex) - Finds the first occurrence of a character starting from the given index
		// indexOf(String str) - Finds the first occurrence of a substring in the string
		// indexOf(String str, int fromIndex) - Finds the first occurrence of a substring starting from the given index
		// lastIndexOf(int ch) - Finds the last occurrence of a character in the string
		// lastIndexOf(int ch, int fromIndex) - Finds the last occurrence of a character starting from the given index (searching backward)
		// lastIndexOf(String str) - Finds the last occurrence of a substring in the string
		// lastIndexOf(String str, int fromIndex) - Finds the last occurrence of a substring starting from the given index (searching backward)
		String str = "Java Programming in Java";
        // indexOf methods
        System.out.println("indexOf('g'): " + str.indexOf('g'));
        System.out.println("indexOf('g', 10): " + str.indexOf('g', 10));
        System.out.println("indexOf(\"Java\"): " + str.indexOf("Java"));
        System.out.println("indexOf(\"Java\", 5): " + str.indexOf("Java", 5));
        // lastIndexOf methods
        System.out.println("lastIndexOf('g'): " + str.lastIndexOf('g'));
        System.out.println("lastIndexOf('g', 10): " + str.lastIndexOf('g', 10));
        System.out.println("lastIndexOf(\"Java\"): " + str.lastIndexOf("Java"));
        System.out.println("lastIndexOf(\"Java\", 20): " + str.lastIndexOf("Java", 20));
		
        // repeat(int count) - Repeats the string a specified number of times
        System.out.println("look".repeat(3));
		
        // intern() - Returns a string from the string pool
		String h = new String("Kite");
		String i = "Kite";
		h = h.intern();
		System.out.println(h==i);//true
		
		// compareTo(String anotherString) - Compares strings lexicographically.
		// The comparison is based on unicode value of each character in the string
		System.out.println("Apple".compareTo("Apply"));//e(101)-y(121)=-20
		
		// compareToIgnoreCase(String anotherString) - Compares strings lexicographically, ignoring case.
		// The comparison is based on unicode value of each character in the string converted to lowercase
		System.out.println("Apple".compareToIgnoreCase("apple"));
		
		// replace(char oldChar, char newChar) - Replaces all occurrences of a character
		System.out.println("Apple".replace('p', 'a'));
		
		// replaceFirst(String regex, String replacement) - Replaces the first substring matching the regex
		String j = "apple apple apple";
        System.out.println(j.replaceFirst("apple", "orange"));
		
        // replaceAll(String regex, String replacement) - Replaces all substrings matching the regex
        String k = "apple apple apple";
        System.out.println(k.replaceAll("apple", "orange")); // Output: orange orange orange
		
        // substring(int beginIndex) - Returns a substring from the specified index to the end
        System.out.println("Govind Parab".substring(7));
        // substring(int beginIndex, int endIndex) - Returns a substring from the specified range
        System.out.println("GovindParab".substring(2,6));
        
        // contains(CharSequence seq) - Checks if the string contains the specified sequence
        System.out.println("Govind Parab".contains("ara"));//true
        
        // startsWith(String prefix) - Checks if the string starts with the specified prefix.
        System.out.println("Govind Parab".startsWith("g"));//false
        System.out.println("Govind Parab".startsWith("G"));//true
        System.out.println("Govind Parab".startsWith("a",10));//true
        
        // endsWith(String suffix) - Checks if the string ends with the specified suffix.
        System.out.println("Govind Parab".endsWith("b"));
        
        // matches(String regex) - Checks if the string matches a regular expression.
        System.out.println("12345".matches("\\d+")); // Output: true (only digits)
        System.out.println("1234e5".matches("\\d+")); // Output: false (e present in digits)
        
        // regionMatches(int toffset, String other, int ooffset, int len) - Compares parts of two strings.
        System.out.println("Hello World".regionMatches(6, "World", 0, 5)); // Output: true
        System.out.println("Hello World".regionMatches(6, "world", 0, 5)); // Output: false
        System.out.println("Hello World".regionMatches(true,6, "world", 0, 5)); // Output: true
        
        // string valueOf method, you can convert int , float, long, double, object, char array, byte, short, boolean to string.
        System.out.println(String.valueOf(new char[] {'H','e','y'}));
        System.out.println(String.valueOf(45));
        
        String[] words = { "Java", "is", "fun" };
        
        String joinedString = String.join("+", words);
        System.out.println("Joined String: " + joinedString); 
        List<String> strings = List.of("Java", "is", "cool");
        String message = String.join(" ", strings);
        System.out.println(message);
        
        String formattedString = String.format("Sentence: [%s] has %d words.", joinedString, words.length);
        System.out.println("Formatted String: " + formattedString); 

        String[] splitWords = joinedString.split("\\+");
        System.out.println("Split Words: " + Arrays.toString(splitWords)); 

        String processedString = String.join("-", Arrays.stream(splitWords)
                                                .map(String::toUpperCase)
                                                .toArray(String[]::new));
        System.out.println("Processed String: " + processedString); 
        
        // getBytes() - Converts the string into a byte array.(there are other variations of this method)
        String n = "Java";
        byte[] bytes = n.getBytes();
        for (byte o : bytes) {
            System.out.print(o+" ");
        }
	}
}