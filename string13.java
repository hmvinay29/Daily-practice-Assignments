package Assignments;

import java.util.Scanner;

public class string13 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the string:");
			String x = scanner.next();
			System.out.println("Enter the first num:");
			int a = scanner.nextInt();
			System.out.println("Enter the second num:");
			int b = scanner.nextInt();
			System.out.println(x.substring(a,b));
	}

}
