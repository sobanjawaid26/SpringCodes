package org.jspiders;

import java.util.List;

public class Computer {

	private String brand;
	private String model;
	
	List<String> listOfComponents;
	
	private Screen screen;

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

	public List<String> getListOfComponents() {
		return listOfComponents;
	}

	public void setListOfComponents(List<String> listOfComponents) {
		this.listOfComponents = listOfComponents;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Computer() {
		super();
		System.out.println("Constructor was called");
	}

	public Computer(String brand, String model, List<String> listOfComponents, Screen screen) {
		super();
		this.brand = brand;
		this.model = model;
		this.listOfComponents = listOfComponents;
		this.screen = screen;
	}

	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", model=" + model + ", listOfComponents=" + listOfComponents + ", screen="
				+ screen + "]";
	}
	
	void initComp() {
		System.out.println("Initialized");
	}
	
	void destroyComp() {
		System.out.println("Destroyed");
	}
	
	

}
