package com.home.basics;

import java.util.Scanner;
public class Loops {
	
	void whileLoop(Scanner sc){
		try {
			System.out.println("Inside While");
			System.out.println("Guess the number : ");
			int n = sc.nextInt();
			int i = 9;
			while(i!=n) {
				System.out.println("Guess the number : ");
				n = sc.nextInt();
				sc.nextLine();
			};
		}
		catch(Exception e) {
			System.out.println("Exception is : "+e.toString());
		}
	}
	
	void doWhileLoop(Scanner sc){
		try {
			System.out.println("Inside Do While");
			System.out.println("Guess the number : ");
			int n = sc.nextInt();
			int i = 9;
			do {
				System.out.println("Guess the number : ");
				n = sc.nextInt();
				sc.nextLine();
			}while(i!=n);
		}
		catch(Exception e) {
			System.out.println("Exception is : "+e.toString());
		}
	}
	
	void simpleForLoop(){
		int[] arr =  {10,20,30,40,50};
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
	}
	void nestedForLoop(){
		for(int i = 1; i<=5;i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
	}
	void forEachLoop() {
		int[] arr =  {10,20,30,40,50};
		for(int i : arr) {
			System.out.println(i);
		}
		String[] arr1 = {"Govind","Minal","Sahil"};
		for(String i : arr1) {
			System.out.println(i);
		}
	}
	void forLoop() {
		for(int i = 0, j = 10, k = 20; i < 10 && j < 15 && k < 25; i=i+2 ,j++ ,k++) {
			System.out.println((i+10)+"\t"+(j+30)+"\t"+(k+50));
		}
	}
	void labeledForloop() {
		label_1 :
			for(int i = 5 ; i <= 10 ; i++) {
				label_2 :
					for(int j = 1 ; j <= 10 ; j++) {
						if(i==7) {
							continue label_2;
						}
						if(i==9) {
							break label_1;
						}
						System.out.println(i+" * "+j+" = "+i*j);
					}
			}
	}
	
//	static void pattern() {
//		for(int i = 1 ; i <= 5 ; i++) {
//			for(int j = 1 ; j <= i ; j++) {
//				System.out.print("*"+"\t");
//				
//			}
//			System.out.print("\n");
//		}
//	}
//	public void infinitiveLoops() {
//		while(true) {
////			code block
//		};
//		
//		do {
////			code block
//		}while(true);
//	    for(;;) {
////	    	code block
//	    }
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Loops obj = new Loops();
		obj.whileLoop(sc);
		obj.doWhileLoop(sc);
		obj.simpleForLoop();
		obj.nestedForLoop();
		obj.forEachLoop();
		obj.forLoop();
		obj.labeledForloop();
		sc.close();
	}
}
