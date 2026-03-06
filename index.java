package Assignments;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n = scanner.nextInt();
		long phone[] = new long[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the phone number of "+(i+1)+" Student:");
			phone[i]=scanner.nextLong();
		}
		System.out.print("Phone numbers are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+phone[i]);
		}
		
	}

}
