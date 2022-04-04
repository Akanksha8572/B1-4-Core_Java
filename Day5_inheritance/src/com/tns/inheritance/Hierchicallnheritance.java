package com.tns.inheritance;

class CellPhone
{
	void message()
	{
		System.out.println(" Hii Akanksha");
	}
	void call()
	{
		System.out.println(" I am calling Ankita");
	}
}
class Samsung extends CellPhone
{
	void Facelock()
	{
		System.out.println("Modern Facelock");
	}
}
class oneplus extends CellPhone
{
	void Game()
	{
		System.out.println("PUB-G");
	}
}
public class Hierchicallnheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung t = new Samsung();
		oneplus p = new oneplus();
		p.message();
		t.message();
		p.call();
		p.Game();
		
	}

}
