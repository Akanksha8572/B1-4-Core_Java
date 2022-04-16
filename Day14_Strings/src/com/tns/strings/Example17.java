package com.tns.strings;

public class Example17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buff = new StringBuffer("Internet of things");
		System.out.println(buff.capacity());
		buff=new StringBuffer(" ");
		System.out.println(buff.capacity());
	}

}
