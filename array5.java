package Assignments;

import java.util.Scanner;

public class array5 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n= scanner.nextInt();
		
		String name[] = new String[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of "+(i+1)+"student:");
			name[i]= scanner.next();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Student at index "+(i)+" is: "+name[i]);
		}
	}

}
