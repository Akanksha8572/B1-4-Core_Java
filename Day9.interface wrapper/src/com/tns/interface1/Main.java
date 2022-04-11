package com.tns.interface1;

class Main implements Example1
{
		public void display()
		{
			System.out.println("Hey Guys,What's going on");
		}
		/*public void print()
		{
			System.out.println("Everything is going well and good ");
		}*/
		 
		public static void main(String args[])
		{
			Main m=new Main();
			m.display();
			//m.print
		}
	

}