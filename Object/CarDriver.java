package com.jsp.Object;

public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c1=new Car("thar", "mahindra", 455555555);
//case1: with out override toString()
//o/p=com.jsp.Object.Car@626b2d4a

//case2: with override toString
//o/p=[thar mahindra 4.55555555E8 ]
System.out.println(c1);
	}

}
