package Assignments;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of cities:");
		int n = scanner.nextInt();
		float temp[]= new float[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the temperature of city "+(i+1)+":");
			temp[i]=scanner.nextFloat();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Temperature of city "+(i+1)+" is:"+temp[i]);
		}
	}

}
