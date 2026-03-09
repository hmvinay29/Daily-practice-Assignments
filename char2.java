package Assignments;

import java.util.Scanner;

public class char2 {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String:");
		String a =scanner.nextLine();
		System.out.println("Enter the character:");
		char b=scanner.next().charAt(0);
		System.out.println(a.indexOf(b));
	}

}
