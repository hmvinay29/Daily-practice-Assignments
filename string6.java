package Assignments;

import java.util.Scanner;

public class string6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first string:");
		String a = scanner.nextLine();
		System.out.println("Enter the Second string:");
		String b= scanner.nextLine();
		int res = a.compareToIgnoreCase(b);
		if(res>0) {
			System.out.println("First string is greater.");
		}else if(res<0) {
			System.out.println("Second string is greater.");
		}else if(res==0)
		{
			System.out.println("Both strings are equal");
		}
	}
}
