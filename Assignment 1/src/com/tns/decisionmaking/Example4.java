package com.tns.decisionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		//switch
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		switch(a)
		{
		case 'a':
			System.out.println("Shrivalli");
			break;
		case 'b':
			System.out.println("Hello");
			break;	
		case 'c':
			System.out.println("Rita");
			break;
		default:
			System.out.println("Invalid input");
			sc.close();
		}

	}

}