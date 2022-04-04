package com.tns.inheritance;


	class bike
	{
		void print() {
			System.out.println(" I like R3 bike");
		}
	}
	class evbike extends bike
	{
		void display()
		{
			System.out.println(" I like R15 bike");
		}
	}
	class hybbike extends evbike
	{
		void assigne()
		{
			System.out.println(" I like R6 bikes");
		}
	}


	public class MultilevelInheritance {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			hybbike h = new hybbike();
			h.display();
			h.print();
			h.assigne();
		}

	}


	