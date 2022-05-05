package com.tns.lambda;


	interface Z{
		public String print();
	}
	public class Example1 {

	public static void main(String[] args) {
		Z s=()->{
			return"i have nothing to say ";
		};
		System.out.println(s.print());
		

	}

}
