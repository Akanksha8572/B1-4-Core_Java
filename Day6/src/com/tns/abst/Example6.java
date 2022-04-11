package com.tns.abst;

class AK
{ 
	String str="satish";
}
class BK extends AK 
{
	String str="chhoti";
	void print()
	{
		System.out.println("Hello,I am"+" "+str);
		System.out.println("Hello,I am"+" "+super.str);//to print parent classstring we have to use super keyword
	}
}
public class Example6 {

	public static void main(String[] args)
	{
		BK bk= new BK();
		bk.print();

	}

}
