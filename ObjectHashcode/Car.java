package com.jsp.ObjectHashcode;

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
public int hashCode() {
	return Objects.hash (brand,name,price,color);
}

	}


