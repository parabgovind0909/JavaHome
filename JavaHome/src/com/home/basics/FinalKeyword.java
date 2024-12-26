package com.home.basics;

import java.util.ArrayList;
import java.util.List;

public class FinalKeyword {

	public static void main(String[] args) {
//		The final keyword in Java is used to create constants, prevent method overriding, and prevent inheritance. 
//		It can be applied to variables, methods, and classes.
//		Constructors cannot be declared as final because they are not inherited and cannot be overridden.
		FinalVariable obj = new FinalVariable();
		obj.print();
//		A final method cannot be overridden by subclasses. This ensures that the method's behavior remains consistent across all subclasses.
		FinalMethod obj1 = new FinalMethod();
		obj1.display();
//		When a class is declared as final, it cannot be extended by any other class.
//		This is useful when you want to prevent inheritance for security or design reasons.
		Animal obj2 = new Animal();
		obj2.message();
		//notice that one declared with static belongs to class and other belongs to instance of class
		BlankFinalVariable obj3 = new BlankFinalVariable(1);
		BlankFinalVariable obj4 = new BlankFinalVariable(2);
		obj3.display();
		obj4.display();
		obj3.display();
		//note that if there are more than one constructor, you must initialize blank final variable in each constructor
		BlankFinal obj5 = new BlankFinal();
		obj5 = new BlankFinal(10);
		obj5.show();
		Elements obj6 = new Elements();
		
		//making a class as immutable
//		Creating an immutable class in Java involves designing a class such that its state cannot be modified after it is created. 
//		Using the final keyword appropriately is one of the key steps in creating immutable classes.
//
//		Here’s how to create an immutable class in Java:
//
//		Steps to Create an Immutable Class
//		Mark the Class as final:
//
//		This prevents the class from being extended, which could introduce mutability.
//		Mark Fields as private and final:
//
//		private: Prevents direct access to fields.
//		final: Ensures fields cannot be reassigned after initialization.
//		Initialize Fields in Constructor:
//
//		The fields should be assigned values only once, either directly or through the constructor.
//		Do Not Provide Setter Methods:
//
//		This ensures that fields cannot be modified after the object is created.
//		Return Deep Copies for Mutable Objects:
//
//		If a field is a reference to a mutable object (e.g., a list or a map), return a copy instead of the original object.
//		Ensure No Methods Modify State:
//
//		Avoid methods that allow changing the fields.
		Address address = new Address("123 Main St", "Springfield");
        ImmutablePerson person = new ImmutablePerson("John Doe", 30, address);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());

        // Attempt to modify the address object outside the class
        address.setStreet("456 Elm St");
        System.out.println("Modified Address (outside): " + address);

        // Address inside the immutable object remains unchanged
        System.out.println("ImmutablePerson's Address: " + person.getAddress());
        
//      The final keyword ensures that the address reference cannot point to a new object, but it does not make the object itself immutable. 
//      By using deep copies and designing the class carefully:
//
//      You prevent changes to the internal state of the object (ImmutablePerson).
//      This ensures that the class behaves as immutable, even if it contains references to mutable objects.
        
        
        //final parameter
        FinalParameterExample example = new FinalParameterExample();
        // Final primitive parameter
        example.updateValue(10);
        // Final reference parameter
        StringBuilder message = new StringBuilder("Hello");
        example.updateReference(message);
        System.out.println("Modified Message: " + message); // Prints: Hello World!
	}
}
class Elements {
	Elements(){
//	The final keyword can be used with variables in a for-each loop to ensure that the loop variable cannot be reassigned during each iteration. 
//	This enforces immutability for the loop variable, meaning its reference cannot be changed, though the contents of the object it refers to (if mutable) can still be modified.
//	Declaring the loop iterator as final in a standard for loop causes a compilation error because the loop's mechanism modifies the iterator (e.g., i++).
		
//		immutable objects are objects whose state cannot be changed after they are created. 
//		Any operation that appears to modify an immutable object actually creates a new object with the modified state, leaving the original object unchanged.
		
		//mutable
		StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb); // Output: Hello World
        
        //immutable
        String str = "Hello";
        str.concat(" World");
        System.out.println(str); // Output: Hello (unchanged)
        
//      final with primitives: The variable cannot be reassigned during the loop.
//      final with objects: The reference cannot be changed, but you can modify the object's internal state if it's mutable.
        int[] numbers = {1, 2, 3, 4, 5};

        //since the number variable goes out of the scope with each iteration of the loop, it is actually re-declaration at each iteration, allowing the same token(i.e numbers) to be used to represent multiple variables
        for (final int number : numbers) {
            System.out.println(number);
            // number = number * 2; // Uncommenting this will cause a compilation error
        }
        
        //an arraylist of mutable type
        List<StringBuilder> names = new ArrayList<>();
        names.add(new StringBuilder("Govind"));
        names.add(new StringBuilder("Sanchit"));
        names.add(new StringBuilder("Sahil"));

        for (final StringBuilder name : names) {
            System.out.println(name);
            name.append(" Parab"); // Modifying the object's internal state is allowed
            // name = new StringBuilder("Krish"); // Uncommenting this will cause a compilation error
        }

        System.out.println("Modified List:");
        for (StringBuilder name : names) {
            System.out.println(name);
        }
        List<String> names1 = new ArrayList<>();
        names1.add(new String("Govind"));
        names1.add(new String("Kartik"));
        names1.add(new String("Lalit"));

        for (final String name : names1) {
            System.out.println(name);
            name.concat(" Lokesh"); // Modifying the object's internal state is allowed it will create a new object which will be discarded as it is not stored and strings are immutable in java 
            // name = new String("Jinesh"); // Uncommenting this will cause a compilation error
        }

        System.out.println("Modified List:");
        for (String name : names1) {
            System.out.println(name);
        }
	}
}
class BlankFinal {
	final int MIN_VAL;
	BlankFinal(){
		MIN_VAL = 10;
//		In the default constructor, the MIN_VAL is first initialized to 10.
//		Then the constructor chaining (this(10)) invokes the parameterized constructor, which attempts to reinitialize the final variable MIN_VAL to 10.
//		This violates the rules for final variables, as they can only be assigned once.
//		this(10);
	}
	BlankFinal(int min_val){
		this.MIN_VAL = min_val;
	}
	void show() {
		System.out.println("Parameterized : "+MIN_VAL);
		System.out.println("Non Parameterized : "+MIN_VAL);
	}
}
class BlankFinalVariable {
//	A blank final variable is a final instance variable that is declared but left uninitialized. 
//	It must be initialized in the constructor(s) of the class to avoid a compilation error. OR in the initializer block
	final int FLAG;
	final int TEMP;
	{
		TEMP = 28;
	}

//	BlankFinalVariable(){
//		flag = 1;
//	}
	BlankFinalVariable(int flag){
		this.FLAG = flag;
	}
	void display() {
		System.out.println("Blank Final Variable = "+FLAG);
		System.out.println("Blank Final Variable = "+TEMP);
		System.out.println("Static Blank Final Variable = "+AGE);
	}
	final static int AGE;
//	A static blank final variable is a final variable declared with the static keyword but not initialized during declaration. 
//	Since the variable is static, it belongs to the class, not instances, and must be initialized in a static block.
	static {
		AGE =24;
	}
}
class FinalVariable {
//	The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. 
//	It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only.
//	When a variable is declared as final, its value cannot be changed once initialized. This makes the variable a constant.
	final public int MAX_VALUE = 100;
	void print() {
		System.out.println("Final Variable : "+MAX_VALUE);
//		Attempting to reassign a final variable will result in a compile-time error.
//		this.MAX_VALUE = 200;//Uncommenting this will cause a compilation error
	}
}
class FinalMethod {
    void display() {
    	//a final method cannot be overridden but can be inherited
    	ChildClass obj = new ChildClass();
    	obj.displayMessage(); // Calls the final method from the parent class
        obj.getMessage();     // Calls the overridden method from the child class
        obj.callParentGetMessage(); // Explicitly calls ParentClass's getMessage() method
    }
}
class ParentClass {
    final void displayMessage() {
        System.out.println("This is a final method in the parent class.");
    }
    void getMessage() {
    	System.out.println("From Parent Class");
    }
}

class ChildClass extends ParentClass {
    // Uncommenting the below method will cause a compilation error
    // @Override
    // void displayMessage() {
    //     System.out.println("Trying to override the final method.");
    // }
	@Override
	void getMessage() {
		System.out.println("From Child Class");
	}
	void callParentGetMessage() {
        super.getMessage(); // Calls the getMessage() method from ParentClass
    }
}
final class Animal {
	void message() {
		System.out.println("Final Animal Class");
	}
}
//Uncommenting the below code will cause a compilation error
//class Dog extends Animal {
//}


final class ImmutablePerson {
    private final String name;   // Immutable field
    private final int age;       // Immutable field
    private final Address address; // Mutable field (requires special handling)

    // Constructor to initialize all fields
    public ImmutablePerson(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        // Create a deep copy of the mutable object to ensure immutability
        this.address = new Address(address.getStreet(), address.getCity());
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for address (returning a copy to ensure immutability)
    public Address getAddress() {
        return new Address(address.getStreet(), address.getCity());
    }

    // No setters provided, ensuring immutability
}

// Supporting class (mutable object)
class Address {
    private String street;
    private String city;

    // Constructor
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // Getters and setters
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return street + ", " + city;
    }
}



class FinalParameterExample {
    void updateValue(final int number) {
        // number = 20; // Error: cannot reassign a final parameter
        System.out.println("Number: " + number);
    }

    void updateReference(final StringBuilder text) {
        text.append(" World!"); // Allowed: modifying the object's state
        // text = new StringBuilder("New Text"); // Error: cannot reassign a final parameter
    }
}
