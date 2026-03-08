package Assignments;

import java.util.Scanner;

public class string4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first sentence or word:");
		String a=scanner.nextLine();
		System.out.println("Enter the Second sentence or word:");
		String b=scanner.nextLine();
		System.out.println(a.equals(b));
	}
}
