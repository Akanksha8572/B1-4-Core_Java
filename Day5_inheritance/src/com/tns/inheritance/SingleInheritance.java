package com.tns.inheritance;



class Parent {
			void print()
			{
				System.out.println("Hello, This is Akanksha");
			}
		}
class Child extends Parent
		{	
			void display()
			{
				System.out.println("Single Inheritence");
			}
			
		}
class SingleInheritance
		{
			public static void main(String[] args) {
			Child c = new Child();
			c.display();
			c.print();
			}

		

	}


