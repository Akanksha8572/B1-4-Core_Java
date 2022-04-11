package com.tns.array;

public class Students_Marks {

	public String name;
	public String roll_no;
	
		

	public Students_Marks(int i, String string) {}
		
	


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students_Marks[] arr;
		arr = new Students_Marks[10];
		arr[0] = new Students_Marks(1,"akku");
		arr[1] = new Students_Marks(2,"ajay");
		arr[2] = new Students_Marks(3,"Sanjeev");
		arr[3] = new Students_Marks(4,"Parbha");
		arr[4] = new Students_Marks(5,"Akanksha");
		arr[5] = new Students_Marks(6,"Soni");
		arr[6] = new Students_Marks(7,"Anand");
		arr[7] = new Students_Marks(1,"amit");
		arr[8] = new Students_Marks(2,"ajit");
		arr[9] = new Students_Marks(3,"Akash");
		
		
		for (int i=0;i<arr.length;i++)
		{
		System.out.println("Element at "+i+":"+arr[i].roll_no+" "+arr[i].name);
		
		}
	}
	}
	
	


