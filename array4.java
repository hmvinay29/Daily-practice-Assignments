package Assignments;

import java.util.Scanner;

public class array4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n = scanner.nextInt();
		double cgpa[] = new double[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the cgpa of student "+(i+1)+":");
			cgpa[i]=scanner.nextFloat();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("CGPA of student "+(i+1)+"is: "+cgpa[i]);
		}
	}

}
