package com.tns.generics;

public class Example2<T> {

	
		T val;
		public void print()
		{
			System.out.println(val.getClass().getName());
		}

		public static void main(String[] args) {
			
			Example2<Character>obj=new Example2<>();
			obj.val='z';
			obj.print();
			
		}

	}