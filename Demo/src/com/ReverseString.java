package com;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String args[])
	{
		String initial;
		char rev=' ';
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		initial=sc.nextLine();
		int length=initial.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=initial.charAt(i);
			System.out.print(rev);
			
		}
		
	}

}
