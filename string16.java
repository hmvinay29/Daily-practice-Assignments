package Assignments;

import java.util.Scanner;

public class string16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String a = scanner.nextLine();
		System.out.println("Enter the character to be changer:");
		char b= scanner.next().charAt(0);
		System.out.println("Enter the character to add:");
		char c=scanner.next().charAt(0);
		System.out.println(a.replace(b, c));
	}
}
