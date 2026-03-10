package Assignments;

import java.util.Scanner;

public class string15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String:");
		String a = scanner.nextLine();
		String []word = a.split("\\s+");
		for(int i=0;i<word.length;i++)
		{
			System.out.println(word[i]);
		}
	}

}
