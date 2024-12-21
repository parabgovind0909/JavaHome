package com.home.basics;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray {
/*
 * Array is the core data structure.
 * The Arrays class is a helper class that simplifies working with arrays through predefined methods.
 */
	public static void main(String[] args) {
		JavaArray obj = new JavaArray();
//		obj.basic1DArray();
//		obj.basicMDArray();
		//passing anonymous array
//		System.out.println(obj.evenArray(new int[] {10,20,22}));
		//passing array and returning a array
//		for(int i : obj.reverseArray(new int[] {10,20,30,40,50,60,70,80,90,100})) {
//			System.out.println(i);
//		}
		//array of objects
//		Family arr[] = new Family[3];
//		arr[0] = new Family("Sarvesh","Jaya","Suresh","Somya");
//		arr[1] = new Family("Bhavesh","Maya","Ramesh","Komal");
//		arr[2] = new Family("Pritesh","Krish","Jitesh","Krisha");
//		for(int i=0 ; i<arr.length;i++) {
//			System.out.println("Father : "+arr[i].father+"\t"+"Mother : "+arr[i].mother+"\t"+"Son : "+arr[i].son+"\t"+"Daughter : "+arr[i].daughter);
//		}
//		for(Family i : arr) {
//			System.out.println("Father : "+i.father+"\t"+"Mother : "+i.mother+"\t"+"Son : "+i.son+"\t"+"Daughter : "+i.daughter);
//		}
		Complextion c = new Complextion();
		c.complex();
	}
	int[] reverseArray(int arr[]) {
		for(int i = 0, j = arr.length-1 ; i < arr.length/2; i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}
	boolean evenArray(int arr[]) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] % 2 == 0) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
	void basicMDArray() {
		int matrix[][];
		matrix = new int[2][2];
		matrix[0][0] = 10;
		matrix[0][1] = 20;
		matrix[1][0] = 40;
		matrix[1][1] = 50;
		System.out.println(matrix.length);
		matrix[1][0] = 30;
		matrix[1][1] = 40;
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
		    	System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println();
		}
		for(int i[] : matrix) {
			for(int j : i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		String details[][] = {
				{"Name","Age","Grade"},
				{"Govind","24","A"},
				{"Ganesh","25","B"}
		};
		for(String i[] : details) {
			for(String j : i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
		int[][][] cube = {
			    { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} },  // First layer
			    { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} } // Second layer
			};
		int value = cube[0][1][1];
		System.out.println(value);
		cube[1][0][1] = 42;
		for (int i = 0; i < cube.length; i++) {          // Iterate over layers
		    for (int j = 0; j < cube[i].length; j++) {   // Iterate over rows in each layer
		        for (int k = 0; k < cube[i][j].length; k++) { // Iterate over columns in each row
		            System.out.print(cube[i][j][k] + " ");
		        }
		        System.out.println();
		    }
		    System.out.println("-----");
		}
		for (int[][] layer : cube) {
		    for (int[] row : layer) {
		        for (int val : row) {
		            System.out.print(val + " ");
		        }
		        System.out.println();
		    }
		    System.out.println("-----");
		}
		
		int[][] jaggedArray = {
	            {1, 2},
	            {3, 4, 5},
	            {6}
	        };
	        for (int i = 0; i < jaggedArray.length; i++) {
	            for (int j = 0; j < jaggedArray[i].length; j++) {
	                System.out.print(jaggedArray[i][j] + " ");
	            }
	            System.out.println();
	        }
	}
	void basic1DArray() {
		int numbers[];   // Declaration: Specify the data type and use square brackets
		numbers = new int[5]; // Instantiation: Allocate memory using the new keyword
		numbers[0] = 10;  // Initialization: Assign values to the array elements
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		for(int i : numbers) {
			System.out.print(i+"\t");
		}
		System.out.println();
		char alphabet[] = {'A','B','C'};
		System.out.println(alphabet.length);
		System.out.println(alphabet[1]);
		alphabet[1]='G';
		for(char i : alphabet) {
			System.out.print(i+"\t");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of students ");
		int no = sc.nextInt();
		sc.nextLine();
		String names[] = new String[no];
		for(int i = 0 ; i < names.length ; i++) {
			System.out.println("Enter Student "+i+" Name : ");
			names[i] = sc.nextLine();
		}
		for(String i : names) {
			System.out.println(i);
		}
	}
}
class Family{
	
	String father;
	String mother;
	String son;
	String daughter;
	
	Family(String _father, String _mother, String _son, String _daughter){
		this.father = _father;
		this.mother = _mother;
		this.son = _son;
		this.daughter = _daughter;
	}
}
class Complextion {
	void complex() {
//		== in Java Arrays
//		The == operator checks if two arrays are the same object in memory (reference equality).
//		It does not compare the contents of the arrays.
		int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = arr1;
        System.out.println(arr1 == arr2); // false (different objects)
        System.out.println(arr1 == arr3); // true (same object reference)
        System.out.println(arr1.toString());
        System.out.println(arr2.toString());
        System.out.println(arr3.toString());
        arr3[0]=2;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        
        String a[] = {"Govind","Sahil","Sanchit"};
        String b[] = new String[3];
        b[0] = "Govind";
        b[1] = "Sahil";
        b[2] = "Sanchit";
        String c[] = {"Govind","Sahil","Sanchit"};
        String d[] = a;
        String e[] = new String[3];
        e[0] = "Govind";
        e[1] = "Sahil";
        e[2] = "Sanchit";
        String f[] = c;
        String g[] = b;
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(g.toString());
        f[0]="Ritesh";
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(f));
        System.out.println(Arrays.toString(g));
        
//        equals() Method in Java Arrays
//        The equals() method in the context of arrays (from Object) does not compare the contents.
//        Instead, it behaves like == and checks if the references are the same.
//        To compare array contents, you should use Arrays.equals() for one-dimensional arrays and Arrays.deepEquals() for multi-dimensional arrays.
        arr2[0] = 2;
        // Default equals() behaves like ==
        System.out.println(arr1.equals(arr2)); // false
        System.out.println(arr1.equals(arr3)); // true
        // Use Arrays.equals() to compare contents
        System.out.println(Arrays.equals(arr1, arr2)); // true
        
//        clone() Method in Arrays
//        The clone() method creates a shallow copy of the array.
//        For primitive arrays, this works as expected because primitives are stored directly in the array.
//        For object arrays, the cloned array contains references to the same objects as the original array (not a deep copy).
        int[] original = {1, 2, 3};
        int[] shallowCopy = original.clone();
        System.out.println(Arrays.equals(original, shallowCopy)); // true
        System.out.println(original == shallowCopy); // false (different references)
        shallowCopy[0] = 5;
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(shallowCopy));
        
        // For object arrays which are immutable like string 
        String[] names = {"Alice", "Bob"};
        String[] shallowCopyNames = names.clone();
        System.out.println(names.toString());
        System.out.println(shallowCopyNames.toString());
        shallowCopyNames[0] = "Charlie";
        System.out.println(names.toString());
        System.out.println(shallowCopyNames.toString());
        System.out.println(Arrays.toString(names)); // [Alice, Bob]
        System.out.println(Arrays.toString(shallowCopyNames)); // [Charlie, Bob]
        
        // For object arrays which are mutable like class Person
        Person p1[] = new Person[1];
        p1[0] = new Person("Govind",24);
        Person p2[] = new Person[2];
        p2[0] = new Person("Govind",24);
        p2[1] = new Person("Sachin",24);
        Person p3[] = p1;
        System.out.println(Arrays.toString(p1));
        System.out.println(Arrays.toString(p2));
        System.out.println(Arrays.toString(p3));
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        p3[0] = new Person("Dinesh",26);
        System.out.println(Arrays.toString(p1));
        System.out.println(Arrays.toString(p2));
        System.out.println(Arrays.toString(p3));
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
//        Primitive Arrays (Deep Copy of Values)
//        Primitive data types (int, char, double, etc.) are stored directly in memory.
//        When you use the clone() method, the values of the primitive elements are copied into a new array.
//        Any modifications to the cloned array will not affect the original array.
//        
//        Object Arrays (Shallow Copy of References)
//        In object arrays, the clone() method copies only the references to the objects, not the actual objects themselves.
//        The cloned array and the original array both point to the same objects.
//        Whether modifications affect the original array depends on the mutability of the objects stored.
//        
//        Case 1: Immutable Objects (e.g., String)
//        Immutable objects cannot be changed after creation. 
//        Replacing an element in the cloned array does not affect the original array because you are simply changing the reference, not the object.
//        Strings are immutable, so modifying cloned[0] assigns a new String reference to cloned[0] without affecting original.
//        
//        Case 2: Mutable Objects
//        Mutable objects can have their internal state changed.
//        In a shallow copy, both the original and cloned arrays share the same object references, so modifying the state of an object affects both arrays.
//        Both original and cloned arrays share the same Person object at index 0.
//        Modifying cloned[0].name changes the state of the shared object, affecting original[0].name
        
        

//        The behavior of clone() for 2D arrays (or multidimensional arrays in general) is a mix of deep copy and shallow copy, depending on the level of the array being cloned.
//        When you clone a 2D array using the clone() method:
//
//    	The top-level array (the array of references to rows) is deep copied.
//    	The elements of the top-level array (the individual rows) are shallow copied.
//    	This means:
//
//    	The cloned array is a new object at the top level.
        
        int[][] original1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] cloned = original1.clone();
        cloned[0][0] = 99;
        System.out.println("Original Array: " + Arrays.deepToString(original1)); // [[99, 2, 3], [4, 5, 6]]
        System.out.println("Cloned Array: " + Arrays.deepToString(cloned));   // [[99, 2, 3], [4, 5, 6]]
//        The clone() method created a new array object for the top level.
//        However, the rows in the original and cloned arrays still reference the same memory locations.
//        Modifying an element in cloned[0][0] affects the corresponding element in original[0][0]
        		
        Person[][] original11 = {
            {new Person("Alice",24), new Person("Bob",25)},
            {new Person("Charlie",26), new Person("Dave",54)}
        };
        Person[][] cloned1 = original11.clone();
        cloned1[0][0].name = "Zara";
        System.out.println("Original Array: " + original11[0][0].name); // Zara
        System.out.println("Cloned Array: " + cloned1[0][0].name);   // Zara
//        The top-level array was deep copied, but the rows and their elements were shallow copied.
//        The Person objects are shared between the original and cloned arrays, so changes to the object affect both arrays.
        
//        Top-Level Array	Deep copy (new top-level array is created).
//        Rows in the Array	Shallow copy (rows are shared between the original and cloned array).
//        Primitive Rows	Since primitives are immutable, changes to cloned rows affect the original array only if rows are shared.
//        Object Rows	Changes to mutable objects in shared rows affect both the original and cloned arrays.
        
//        If you want a true deep copy of a 2D array (both the top-level and rows are fully independent), you need to manually clone each row.
        int[][] original111 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Create a deep copy
        int[][] deepCopy = new int[original111.length][];
        for (int i = 0; i < original111.length; i++) {
            deepCopy[i] = original111[i].clone(); // Clone each row
        }

        // Modify the deep copy
        deepCopy[0][0] = 99;

        // Print both arrays
        System.out.println("Original Array: " + Arrays.deepToString(original111)); // [[1, 2, 3], [4, 5, 6]]
        System.out.println("Deep Copy: " + Arrays.deepToString(deepCopy));     // [[99, 2, 3], [4, 5, 6]]
        
        
        
        
        
//        clone                                                                             copyof
//        Return Type	Same type as the original array.	                                Can be any size but same type as the original array.
//        Copying Behavior	Shallow copy of the array.	                                    Shallow copy of the array.
//        Multidimensional Arrays	Deep copy of top-level array; sub-arrays are shared.	Same as clone() (no deep copy of sub-arrays).
//        Flexibility	Fixed size (same as original array).	                            Can specify a new size for the array.
//        Extra Elements in New Array	Not applicable (size is fixed).	                    Initialized to default values (e.g., 0 for primitives).
//        Usage Simplicity	Simple and direct for cloning the entire array.	                More flexible for resizing or copying part of the array.
	}
}
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}