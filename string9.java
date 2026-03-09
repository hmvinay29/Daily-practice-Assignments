package Assignments;

import java.util.Scanner;

public class string9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String a=scanner.nextLine();
		System.out.println("Enter the second string:");
		String b=scanner.nextLine();
		
		System.out.println(a.endsWith(b));
	}
}
