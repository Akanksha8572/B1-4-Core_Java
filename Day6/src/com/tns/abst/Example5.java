package com.tns.abst;

class Person
{
		void message()
		{
			System.out.println("This is person class");
		}
	}
class Student extends Person
{
	void message()
	{
		System.out.println("This is Student class");
	}
	void display()
	{
		message();
		super.message();
	}
}
class Main
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.display();
	}

}