package org.jspiders;

public class Screen {

	private int screeSize;
	private String brand;
	public int getScreeSize() {
		return screeSize;
	}
	public void setScreeSize(int screeSize) {
		this.screeSize = screeSize;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Screen(int screeSize, String brand) {
		super();
		this.screeSize = screeSize;
		this.brand = brand;
	}
	public Screen() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Screen [screeSize=" + screeSize + ", brand=" + brand + "]";
	}
	
	

}
