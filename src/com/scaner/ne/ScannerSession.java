package com.scaner.ne;

import java.util.Scanner;

public class ScannerSession {
	
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter value :");
	String c = s.nextLine();
	System.out.println("Entered value :"+c);
	
	System.out.println("Enter a Value :");
	int a = s.nextInt();
	System.out.println("Entered value :"+a);
	System.out.println("Enter value :");
	long b =s.nextLong();
	System.out.println("Entered value :"+b);
//	System.out.println("Enter value :");
//	String c = s.nextLine();
//	System.out.println("Entered value :"+c);
	
	System.out.println("Enter attendance :");
	boolean d =s.nextBoolean();
	System.out.println("Entered attendance :"+d);
	
	System.out.println("Enter a name");
	System.out.println("JAYAKUMAR");
	
	
	}
}
