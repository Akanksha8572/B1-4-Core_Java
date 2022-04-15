package com.tns.multithreading;

class thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread interruption");
	}
}
public class Example13 {

	public static void main(String[] args) {
		
		thread1 t=new thread1();
		t.start();
		t.interrupt();
	}

}