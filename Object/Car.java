package com.jsp.Object;

public class Car {
String name;
String brand;
double price;

Car(String name,String brand,double price){
	this.name=name;
	this.brand=brand;
	this.price=price;
}


@Override
public String toString() {
	return "["+name+" "+brand+" "+price+" ]";
}
}
