package com.home.basics;

public class PrimitiveDataTypesRange {
    public static void main(String[] args) {
        System.out.println("Smallest and Largest Values of Primitive Data Types in Java:");
        
        // byte
        System.out.println("byte: ");
        System.out.println("Minimum: " + (-128));
        System.out.println("Maximum: " + (127));
        System.out.println("Minimum: " + Byte.MIN_VALUE);
        System.out.println("Maximum: " + Byte.MAX_VALUE);

        // short
        System.out.println("short: ");
        System.out.println("Minimum: " + (-32768));
        System.out.println("Maximum: " + (32767));
        System.out.println("Minimum: " + Short.MIN_VALUE);
        System.out.println("Maximum: " + Short.MAX_VALUE);

        // int
        System.out.println("int: ");
        System.out.println("Minimum: " + (-2147483648));
        System.out.println("Maximum: " + (2147483647));
        System.out.println("Minimum: " + Integer.MIN_VALUE);
        System.out.println("Maximum: " + Integer.MAX_VALUE);

        // long
        System.out.println("long: ");
        System.out.println("Minimum: " + (-9223372036854775808L));
        System.out.println("Maximum: " + (9223372036854775807L));
        System.out.println("Minimum: " + Long.MIN_VALUE);
        System.out.println("Maximum: " + Long.MAX_VALUE);

        // Both float and double data types were designed especially for scientific calculations, where approximation errors are acceptable. 
        // If accuracy is the most prior concern then, it is recommended not to use these data types and use BigDecimal class instead. 
        // understand the float and double while studying BigDecimal
        // float
        System.out.println("float: ");
        System.out.println("Minimum: " + Float.MIN_VALUE);
        System.out.println("Maximum: " + Float.MAX_VALUE);

        // double
        System.out.println("double: ");
        System.out.println("Minimum: " + Double.MIN_VALUE);
        System.out.println("Maximum: " + Double.MAX_VALUE);

        // Unlike languages such as C or C++ that use the ASCII character set, Java uses the Unicode character set to support internationalization. 
        // Unicode requires more than 8 bits to represent a wide range of characters from different languages, including Latin, Greek, Cyrillic, Chinese, Arabic, and more. 
        // As a result, Java uses 2 bytes to store a char, ensuring it can represent any Unicode character.
        // char
        System.out.println("char: ");
        System.out.println("Minimum: " + (int) '\u0000');
        System.out.println("Maximum: " + (int) '\uffff');
        System.out.println("Minimum: " + (int) Character.MIN_VALUE);
        System.out.println("Maximum: " + (int) Character.MAX_VALUE);

        // boolean
        System.out.println("boolean: ");
        System.out.println("Values: " + false + " and " + true);
        System.out.println("Values: " + Boolean.FALSE + " and " + Boolean.TRUE);
    }
}
