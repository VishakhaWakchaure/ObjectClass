package com.jsp.ObjectHashcode;

public class CarD {
public static void main(String[] args) {
	Car c1 =new Car("BMW", "X1", "White", 700000000);
	Car c2 =new Car("BMW", "X1", "White", 700000000);
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
}
}
