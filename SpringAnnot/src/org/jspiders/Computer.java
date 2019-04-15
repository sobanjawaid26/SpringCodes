package org.jspiders;

import java.util.List;

public class Computer {

	private String brand;
	private String model;
	
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", model=" + model + "]";
	}

	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Computer(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	void initComp() {
		System.out.println("Init method called");
	}
	
	void destroyComp() {
		System.out.println("Destroy method called");
	}
	
	

}
