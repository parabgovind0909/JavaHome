package com.home.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class JavaArraysClass {
//	The Arrays class in java.util package is a part of the Java Collection Framework. 
//	This class provides static methods to dynamically create and access Java arrays. 
//	It consists of only static methods and the methods of Object class. 
//	The methods of this class can be used by the class name itself.
	public static void main(String[] args) {
		JavaArraysClass obj = new JavaArraysClass();
		obj.asListArrayMethod();
		obj.binarysearchArraysMethod();
		obj.compareArrayMethod();
		obj.compareUnsignedArrayMethod();
		obj.copyOfArrayMethod();
		obj.copyRangeArrayMethod();
		obj.equaldeepEqualArrayMethod();
		obj.hashcodedeephashcode();
		obj.tostringdeeptostrigArrayMethod();
		obj.fillArrayMethod();
		obj.mismatchArrayMethod();
		obj.parallelprefixArrayMethod();
		obj.setallparallelsetallArrayMethod();
		obj.sortparallelsortArrayMethod();
		obj.spliteratorArrayMethod();
		obj.streamArrayMethod();
	}
	void streamArrayMethod() {
//		The Arrays.stream() method converts an array into a Stream.
//		A Stream represents a sequence of elements that can be processed in parallel or sequentially.
//		Once an array is converted into a stream, you can perform various operations like filtering, sorting, and collecting the results in a much more readable and concise manner.
		
//		Arrays.stream(numbers): Converts the numbers array (which is an int[]) into an IntStream.
//		filter(num -> num % 2 != 0): This uses a lambda expression to filter the elements of the stream.
//		num is the parameter representing each element in the stream (which are the elements of the numbers array).
//		num % 2 != 0 checks if the number is odd (i.e., the remainder when divided by 2 is not zero).
//		forEach(System.out::println): This iterates through the remaining elements of the stream (after filtering) and prints each element.
		int numbers[] = {23,56,78,10,59,65,30};
		Arrays.stream(numbers)
	      .filter(num -> num % 2 != 0)
	      .forEach(System.out::println);
	}
	void spliteratorArrayMethod() {
//The spliterator() method provides a spliterator that can traverse the elements of an array, potentially in parallel.
//The spliterator can split the array into smaller parts, which can be processed concurrently (in parallel streams). This makes it useful for handling large datasets.
//Key Features of Spliterator:
//tryAdvance(): Iterates over elements one at a time, similar to a traditional iterator.
//forEachRemaining(): Performs an action on each remaining element of the collection.
//trySplit(): Splits the current spliterator into two parts, allowing parallel processing.
//estimateSize(): Returns an estimate of the number of elements remaining to be processed.
//characteristics(): Returns a set of characteristics (e.g., ORDERED, DISTINCT) of the spliterator.
		Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Spliterator<Integer> spliterator = Arrays.spliterator(array);
        Spliterator<Integer> spliterator1 = spliterator.trySplit();
        System.out.println("First half:");
        spliterator1.forEachRemaining(element -> System.out.println(element));
        System.out.println("Second half:");
        spliterator.forEachRemaining(element -> System.out.println(element));
	}
	void sortparallelsortArrayMethod() {
//		The Arrays.parallelSort() method in Java is part of the Arrays utility class, introduced in Java 8. 
//		This method allows you to sort arrays using parallelism to take advantage of multiple CPU cores, which can significantly improve performance for large arrays.
//		Arrays.sort(): Sorts the array sequentially.
//		Arrays.parallelSort(): Sorts the array using parallel processing, which can speed up sorting for large arrays on multi-core systems.
		double[] array = {12.5, 5.3, 8.7, 3.4, 20.1, 15.2, 1.0, 9.8};
        Arrays.parallelSort(array);
        System.out.println(Arrays.toString(array));
	}
	void setallparallelsetallArrayMethod() {
//		The parallelSetAll method applies the provided operator to each element of the array in parallel.
//		It internally splits the array into segments and processes them in parallel threads, using the Fork/Join Framework.
//		This is particularly beneficial for large arrays as it can significantly speed up the operation by utilizing multiple CPU cores.
		
//		setall :- The operation is performed sequentially (i.e., not in parallel).
		int[] array = new int[5];
        Arrays.setAll(array, index -> index * index);
        System.out.println(Arrays.toString(array));
		int[] array1 = new int[10];
        Arrays.parallelSetAll(array1, index -> index * index);
        System.out.println(Arrays.toString(array1));
	}
	void parallelprefixArrayMethod() {
//		The first element in the array remains unchanged.
//		For subsequent elements, the result of applying the binary operator cumulatively is stored.
//		For example, if the binary operator is addition:
//		Result: [a[0], a[0] + a[1], a[0] + a[1] + a[2], ...].
		int[] array = {1, 2, 3, 4, 5};
        Arrays.parallelPrefix(array, (x, y) -> x + y);
        System.out.println(Arrays.toString(array)); // Output: [1, 3, 6, 10, 15]
        Arrays.parallelPrefix(array, 1, 4, (x, y) -> x + y);
        System.out.println(Arrays.toString(array)); // Output: [1, 3, 9, 16, 15]
        String[] words = {"a", "b", "c", "d"};
        Arrays.parallelPrefix(words, (x, y) -> x + y);
        System.out.println(Arrays.toString(words)); // Output: [a, ab, abc, abcd]
	}
	void mismatchArrayMethod() {
		boolean array1[] = { false, false, true, true, false};
        boolean array2[] = { false, true, true, true, false};
	    int result = Arrays.mismatch(array1, 0, 2, array2, 0, 2);  
	    if(result == -1) {
	        System.out.println("No mismatch. Arrays are same.");
	    } else {
	        System.out.println("First mismatch is at index: " + result);
	    }
	}
	void fillArrayMethod() {
		String names[] = {"Govind","Sahil","Sanchit"};
		System.out.println(Arrays.deepToString(names));
		Arrays.fill(names, "Swara");
		System.out.println(Arrays.deepToString(names));
	}
	void tostringdeeptostrigArrayMethod() {
		int a[] = {10,20,30};
		// Arrays.toString() for 1d
		System.out.println(Arrays.toString(a));
		//Arrays.deepToString() for Nd
		int arr[][] = {{10,20,30},{100,200,300},{50,60,70}};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr));
	}
	void hashcodedeephashcode() {
		Object[] array = {1, new int[]{2, 3}, 4};
//		hashCode():
//		Computes a hash code for the array at the top level.
//		Does not handle nested arrays or their contents.
//		deepHashCode():
//		Recursively computes hash codes for all elements, including nested arrays.

        int shallowHashCode = Arrays.hashCode(array);
        int deepHashCode = Arrays.deepHashCode(array);
        System.out.println("Shallow HashCode: " + shallowHashCode); // Different hash value
        System.out.println("Deep HashCode: " + deepHashCode);       // Considers nested arrays
	}
	void equaldeepEqualArrayMethod() {
//		equals:
//		Compares arrays at the top level.
//		Does not consider nested array elements.
//		Arrays.equals does not check the contents of nested arrays. It only compares the references (memory addresses) of the nested arrays.
//		deepEquals:
//		Recursively compares all nested elements, including nested arrays.
		
//		Equals (Shallow Comparison)
//		DeepEquals (Recursive Comparison)
		
//		Arrays.equals() method compares arrays element by element, but this method only works for single-dimensional arrays or arrays of objects.
//		Arrays.deepEquals() method compares arrays recursively by making it suitable for multi-dimensional arrays.
		
		int a[] = {10,20};
		int b[] = {10,20};
		int c[] = b;
		Object[] q = {"Dinesh"};
		Object[] w = {"Dinesh"};
		Object[] e = q;
		System.out.println(q.toString());
		System.out.println(w.toString());
		System.out.println(e.toString());
		System.out.println(Arrays.equals(q, e));
		System.out.println(Arrays.equals(a, b));//true
		System.out.println(Arrays.equals(a, c));//true
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		c[0] = 30;
		System.out.println(Arrays.equals(a, b));//false
		System.out.println(Arrays.equals(a, c));//false
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		
		Object[] array1 = {1, 2, new int[]{3, 4}};
        Object[] array2 = {1, 2, new int[]{3, 4}};
        Object[] array3 = {1, 2, new int[]{4, 3}};
        System.out.println("Array1 and Array2 are deeply equal: " + Arrays.deepEquals(array1, array2)); // true
        System.out.println("Array1 and Array3 are deeply equal: " + Arrays.deepEquals(array1, array3)); // false
        
        // Since array1 and array2 contain references to different int[] objects, the references are not the same, and the result is false.
        System.out.println("Equals: " + Arrays.equals(array1, array2)); // false
	}
	void copyRangeArrayMethod() {
//		original: The array from which the elements are copied.
//		from: The starting index (inclusive) of the range to copy.
//		to: The ending index (exclusive) of the range to copy.
//		The copyOfRange method in the java.util.Arrays class is used to copy a specific range of elements from an existing array into a new array. 
//		This method allows you to define the start (fromIndex) and end (toIndex) of the range to be copied.
		int[] original = {10, 20, 30, 40, 50};
        int[] range1 = Arrays.copyOfRange(original, 1, 3);
        System.out.println("Range 1 (1 to 3): " + Arrays.toString(range1)); // [20, 30]
        int[] range2 = Arrays.copyOfRange(original, 0, 5);
        System.out.println("Range 2 (0 to 5): " + Arrays.toString(range2)); // [10, 20, 30, 40, 50]
        int[] range3 = Arrays.copyOfRange(original, 3, 6);
        System.out.println("Range 3 (3 to 6): " + Arrays.toString(range3)); // [40, 50, 0]
	}
	void copyOfArrayMethod() {
		// Copying Data:
		// Copies the elements of the original array into a new array.
		// If the newLength is greater than the original array's length, the remaining elements are initialized to the default values for that data type (e.g., 0 for numeric types, false for boolean, null for objects).
		// Truncation:
		// If the newLength is smaller than the original array's length, only the first newLength elements are copied.
		int[] original = {1, 2, 3, 4, 5};

        int[] copySameLength = Arrays.copyOf(original, original.length);
        System.out.println("Copy with same length: " + Arrays.toString(copySameLength));

        int[] copyIncreasedLength = Arrays.copyOf(original, 7);
        System.out.println("Copy with increased length: " + Arrays.toString(copyIncreasedLength));

        int[] copyDecreasedLength = Arrays.copyOf(original, 3);
        System.out.println("Copy with decreased length: " + Arrays.toString(copyDecreasedLength));
        
        String[] original1 = {"Java", "Python", "C++"};

        String[] copySameLength1 = Arrays.copyOf(original1, original1.length);
        System.out.println("Copy with same length: " + Arrays.toString(copySameLength1));

        String[] copyIncreasedLength1 = Arrays.copyOf(original1, 5);
        System.out.println("Copy with increased length: " + Arrays.toString(copyIncreasedLength1));

        String[] copyDecreasedLength1 = Arrays.copyOf(original1, 2);
        System.out.println("Copy with decreased length: " + Arrays.toString(copyDecreasedLength1));
	}
	void compareUnsignedArrayMethod() {
		byte[] array1 = {(byte) 1, (byte) 2, (byte) -128}; // -128 treated as 128 unsigned
        byte[] array2 = {(byte) 1, (byte) 2, (byte) 127};
        byte[] array3 = {(byte) 1, (byte) 2, (byte) -128};
        byte[] array4 = {(byte) 1, (byte) 2};

        System.out.println("array1 vs array2: " + Arrays.compareUnsigned(array1, array2)); // Positive
        System.out.println("array1 vs array3: " + Arrays.compareUnsigned(array1, array3)); // Zero
        System.out.println("array1 vs array4: " + Arrays.compareUnsigned(array1, array4)); // Positive
        System.out.println("array4 vs array2: " + Arrays.compareUnsigned(array4, array2)); // Negative
	}
	void compareArrayMethod() {
		// For boolean arrays :-The values are compared in order: false is considered less than true.
		// If arrays differ in length but are otherwise equal up to the shorter length, the shorter array is considered smaller.
		
//		Use Arrays.equals() when:
//		You need to check if two arrays are identical (i.e., have the same content and length).
//		Use Arrays.compareTo() when:
//		You need to order arrays, or you need to check the lexicographical ordering of arrays.
		
	      boolean array1[] = { true, true, false, true};
	      boolean array2[] = { true, true, true};
	      int result = Arrays.compare(array1, array2);
	      if(result > 0) {
	    	  System.out.println("First array is greater than second array.");
	      } else if (result == 0) {
	    	  System.out.println("Arrays are same.");
	      } else {
	    	  System.out.println("First array is less than second array.");
	      }
	      // The comparison stops as soon as a difference is found.
	      // Shorter arrays are considered smaller if they match the elements of the longer array up to their length.
	      int a1[] = {10,20,30};
	      int a2[] = {5,500,500};
	      result = Arrays.compare(a1, a2);
	      if(result > 0) {
	    	  System.out.println("First array is greater than second array.");
	      } else if (result == 0) {
	    	  System.out.println("Arrays are same.");
	      } else {
	    	  System.out.println("First array is less than second array.");
	      }
	}
	
	void asListArrayMethod() {
//	The java.util.Arrays.asList() method is a convenient way to create a fixed-size list backed by a specified array.
//	Fixed Size: The list created by asList is fixed in size. You cannot add or remove elements from it, but you can modify the elements if the backing array is mutable.
//	Backed by Array: The returned list is directly linked to the original array. Changes made to the array are reflected in the list, and vice versa.
//	Not Resizable: Attempting to add or remove elements results in an UnsupportedOperationException.
//	Important Points: The array type must be a wrapper class i.e. Integer, Float, for primitive data types i.e. int, float. 
//	You cannot pass int[], but you can pass Integer[]. 
//	Passing int[] will return a List<int[]> instead of a List<Integer>, as autoboxing does not occur in this case, which may cause errors in collection functions.
		// Create an array
        String[] array = {"Java", "Python", "C++"};
        
        // Convert array to a list
        List<String> list = Arrays.asList(array);
        
        // Print the list
        System.out.println("List: " + list);
        
        // Modify an element via the list
        list.set(1, "JavaScript");
        System.out.println("Modified List: " + list);
        
        // Reflect changes in the array
        System.out.println("Modified Array: " + Arrays.toString(array));
        
     // Attempt to add an element (throws exception)
        // list.add("Ruby"); // Uncommenting this line will throw UnsupportedOperationException
        
        
        // Primitive array
        int[] intArray = {1, 2, 3};

        // Convert to a list (requires wrapper class)
        List<Integer> list1 = Arrays.asList(1, 2, 3);

        System.out.println("List: " + list1);

        // Cannot directly use a primitive array
        // List<Integer> list2 = Arrays.asList(intArray); // Incorrect
        
        // Primitive Arrays: If you pass a primitive array, asList treats the entire array as a single element.
        // To convert a primitive array into a list of elements, use a loop or IntStream
        List<Integer> list3 = Arrays.stream(intArray).boxed().toList();
        System.out.println(list3);
        // If you need a resizable list
        List<Integer> mutable = new ArrayList<>(Arrays.asList(1,2,3));
        mutable.add(4);
        System.out.println(mutable);
        
        Students data[] = new Students[2];
        data[0] = new Students(1,"Govind");
        data[1] = new Students(2,"Minakshi");
        List<Students> s = Arrays.asList(data);
        System.out.println(s);
	}
	void binarysearchArraysMethod() {
		// The array must be sorted by the Arrays.sort() method before making this call. If it is not sorted, the results are undefined.
		// If duplicates exist, it is uncertain which index will be returned.
		// It returns the index of the key, if the index is found.
		// If the index not found, it returns - (insertion point) - 1, where the insertion point is where the key would fit in a sorted array.
		
		// Also we have static int binarySearch(long[] a, int fromIndex, int toIndex, long key)
        // This method searches a range of the specified array of longs for the specified value using the binary search algorithm.
		
		int arr[] = {10,10,20,50,40,30,90};
		//sorting
		Arrays.sort(arr);
		//removing duplicates
		System.out.println(Arrays.stream(arr).distinct().boxed().toList());
        int index = Arrays.binarySearch(arr, 10);
        System.out.println("Element 10 found at index: " + index);
        int notFoundIndex = Arrays.binarySearch(arr, 22);
        System.out.println("Element 22 not found, insertion point: " + Math.abs((notFoundIndex+1)));
        // for objects
        Book[] books = {
                new Book(101, "Java Programming"),
                new Book(102, "Data Structures"),
                new Book(103, "Algorithms"),
                new Book(104, "Operating Systems")
            };
        // Sort the array by title using a custom comparator
        Arrays.sort(books, Comparator.comparing(book -> book.title));

        // Display the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(books));
        
        Arrays.sort(books);
        // Display the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(books));
        Book key = new Book(102, ""); // Only the ID matters for comparison
        int index1 = Arrays.binarySearch(books, key);
        if (index1 >= 0) {
        	System.out.println("Book found at index " + index1 + ": " + books[index1]);
        } else {
            System.out.println("Book not found. Insertion point: " + (-index1 - 1));
        }
	}

}
class Book implements Comparable<Book> {
//	The Arrays.sort method relies on the natural ordering provided by compareTo.
//	Without compareTo, the method would not know how to sort your custom objects.
    int id;
    String title;
    Book(int id, String title) {
        this.id = id;
        this.title = title;
    }
    @Override
    public int compareTo(Book other) {
        return this.id - other.id; // Sorting based on ID in ascending order
    }
    @Override
    public String toString() {
        return "[ID: " + id + ", Title: " + title + "]";
    }
}
class Students{
	int roll_no;
	String name;
	public Students(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}
//	Overriding the toString() method allows a meaningful representation of objects when printing.
//	This method returns a custom string representation of a Student object in the format [ rollNo, name ].
//	When the List is printed, each Student object in the list is represented using this custom format.
	@Override
	public String toString() {
		return "Students [roll_no=" + roll_no + ", name=" + name + "]";
	}
}