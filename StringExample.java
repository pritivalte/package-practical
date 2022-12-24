package StringExample;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		String str1,str2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First String");
		str1 =scanner.nextLine();
		
		System.out.println("Enter Second String");
		str2 =scanner.nextLine();
		
		if(str1.equals(str2));
		{
			System.out.print("Equal Strings");
			
		}
		else
		{
			System.out.print("NotEqual Strings");
		}
		
	}
	

