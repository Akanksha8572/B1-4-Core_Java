package com.tns.recursion;

import java.util.Scanner;

public class Example2 {

	 static int p(int M, int N)
	    {
	        if (M == 1 || N == 1)
	            return 1;
	        else
	        	return p(M - 1, N) + p(M, N - 1);
	        	
	        
	    }
	    public static void main(String args[])
	    {
	    	Scanner s= new Scanner(System.in);
			int N= s.nextInt();
			int M=s.nextInt();
			int A=p(N,M);
			System.out.print(A);
			s.close();

	    }
}
