package com.tns.recursion;

import java.util.Scanner;

public class sumofdigit {
	int sum = 0;
    public static void main(String[] args) 
    {
    	int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        sumofdigit d = new sumofdigit();
        int a = d.add(n);
        System.out.println("sum:"+a);
        s.close();
    }
    int add(int n)
    {
        sum = n % 10;
        if(n == 0)
        {
            return 0;
        }
        else
        {
             return sum+(n/10);
             
        }
        
    }
}