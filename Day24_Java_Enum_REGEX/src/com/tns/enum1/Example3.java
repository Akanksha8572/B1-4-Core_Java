package com.tns.enum1;
enum bike 
{
	Pulser, R15, KPM, R3, Hero
}

public class Example3 {

	public static void main(String[] args) {
		bike b= bike.Hero;
			switch(b)
			{
			case Pulser:
				System.out.println("YOU choose pulser");
				break;
			case R15:
				System.out.println("YOU choose R15");
				break;
			case KPM:
				System.out.println("YOU choose KPMr");
				break;
			case R3:
				System.out.println("YOU choose R3");
				break;
				default:
					System.out.println("invaid name");
					
			}

	}

}
