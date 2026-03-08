package Assignments;

import java.util.Scanner;

public class string5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String a = scanner.nextLine();
		System.out.println("Enter the number to retriver character");
		int n=scanner.nextInt();
		System.out.println(a.charAt(n));
	}
}
