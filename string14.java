package Assignments;

import java.util.Scanner;

public class string14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String a = scanner.nextLine();
		System.out.println(a.trim().isEmpty());
	}

}
