package com.jsp.ObjectEquals;

public class CarD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car car =new Car("BMW", "x1", "White", 2000000);
Car car1 =new Car("BMW", "x1", "White", 2000000);
System.out.println(car==car1);
System.out.println(car.equals(car1));
	}

}
