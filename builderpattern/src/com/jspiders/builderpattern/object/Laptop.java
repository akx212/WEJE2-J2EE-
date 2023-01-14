package com.jspiders.builderpattern.object;

public class Laptop {
    String brand;
    String model;
    String os;
    String color;
    double price;
    double weight;
    int ram;
    int memory;
    int camera;
    int battery;
    
	public Laptop(String brand, String model, String os, String color, double price, double weight,
			int ram, int memory,int camera, int battery) {
		
		super();
		this.brand = brand;
		this.model = model;
		this.os = os;
		this.color = color;
		this.price = price;
		this.weight = weight;
		this.ram = ram;
		this.memory = memory;
		this.camera = camera;
		this.battery = battery;
	}

  @Override
  public String toString() {
	return "Laptop [brand=" + brand + ", model=" + model + ", os=" + os + ", color=" + color + ","
		+ " price=" + price+ ", weight=" + weight + ", ram=" + ram + ", memory=" + memory + ","
		+ " camera=" + camera + ", battery="	+ battery + "]";
	}   
}
