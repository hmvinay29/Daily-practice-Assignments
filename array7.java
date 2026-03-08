package Assignments;

import java.util.Scanner;

public class array7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Schools:");
		int n=scanner.nextInt();
		System.out.println("Enter the number of classrooms:");
		int cr=scanner.nextInt();
		System.out.println("Enter the number of students:");
		int s=scanner.nextInt();
		
		int agess[][][] =new int [n][cr][s];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<cr;j++)
			{
				for(int k=0;k<s;k++)
				{
					System.out.println("Enter the age of students"+(k+1)+":");
					agess[i][j][k] = scanner.nextInt();
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<cr;j++)
			{
				for(int k=0;k<s;k++)
				{
					System.out.print(agess[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}

}
