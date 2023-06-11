package com.jsp.ObjectEquals;

import java.util.Objects;

public class Car {
String name;
String brand;
String color;
double price;
public Car(String name, String brand, String color, double price) {
	super();
	this.name = name;
	this.brand = brand;
	this.color = color;
	this.price = price;
}
@Override
public boolean equals(Object obj) {
	Car c=(Car)obj;
	if(c.brand==this.brand && c.color==this.color && c.name==this.name && c.price==this.price) {
		return true;
	}else {
		return false;
	}
	
}

}
