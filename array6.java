package Assignments;

import java.util.Scanner;

public class array6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of boolean:");
		int n = scanner.nextInt();
		boolean check[]=new boolean[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the "+(i+1)+" boolean: ");
			check[i]=scanner.nextBoolean();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Value of index "+i+" is: "+check[i]);
		}
	}

}
