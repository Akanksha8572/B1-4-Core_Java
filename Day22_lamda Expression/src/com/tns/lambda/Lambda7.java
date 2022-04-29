package com.tns.lambda;

public class Lambda7 {

	public static void main(String[] args) {
		// thread example without Lambda Expression
		/*Runnable R1=new Runnable()
		{

			@Override
			public void run()
			{
				System.out.println("Class name is Lambda 7");
			}
						
						
		};*/
		//thread example using lambda expression
		Runnable r1=()->
		{
			System.out.println("class name is lambda 7");
		};
		Thread t=new Thread(r1);
		t.start();
		
	}
}
			
				

		
