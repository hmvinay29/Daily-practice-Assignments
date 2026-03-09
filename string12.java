package Assignments;

import java.util.Scanner;

public class string12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String:");
		String a =scanner.nextLine();
		System.out.println("Enter the number:");
		int b=scanner.nextInt();
		System.out.println(a.substring(b));
	}

}
