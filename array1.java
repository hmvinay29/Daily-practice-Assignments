package Assignments;

import java.util.Scanner;

public class array1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n = scanner.nextInt();
		int age[] = new int[n];
		
		for(int i =0;i<n;i++)
		{
			System.out.println("Enter the age of "+(i+1)+"student:");
			age[i]=scanner.nextInt();
		}
		System.out.print("Ages are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+age[i]);
		}
	}
}
