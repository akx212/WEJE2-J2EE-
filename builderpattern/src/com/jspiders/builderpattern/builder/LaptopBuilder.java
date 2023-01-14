package com.jspiders.builderpattern.builder;

import com.jspiders.builderpattern.object.Laptop;

public class LaptopBuilder {
    
	   private String brand;
	   private  String model;
	   private String os;
	   private String color;
	   private double price;
	   private  double weight;
	   private int ram;
	   private int memory;
	   private int camera;
	   private int battery;
	   
	   public LaptopBuilder brand(String brand) {
		   this.brand=brand;
		   return this;
	   }
	   public LaptopBuilder model(String model) {
		   this.model=model;
		   return this;
	   }
	   public LaptopBuilder os(String os) {
		   this.os=os;
		   return this;
	   }
	   public LaptopBuilder color(String color) {
		   this.color=color;
		   return this;
	   }
	   public LaptopBuilder price(double price) {
		   this.price=price;
		   return this;
	   }
	   public LaptopBuilder weight(double weight) {
		   this.weight=weight;
		   return this;
	   }
	   public LaptopBuilder ram(int ram) {
		   this.ram=ram;
		   return this;
	   }
	   public LaptopBuilder memory(int memory) {
		   this.memory=memory;
		   return this;
	   }
	   public LaptopBuilder camera(int camera) {
		   this.camera=camera;
		   return this;
	   }
	   public LaptopBuilder battery(int battery) {
		   this.battery=battery;
		   return this;
	   }
	   
	   public Laptop getLaptop() {
		   Laptop laptop = new Laptop(this.brand,this.model,this.os,this.color,
				   this.price,this.weight,this.ram,this.memory,this.camera,this.battery);
		   return laptop;
	   }
}
