package com.model;

public class Laptop {

	private int laptopId;
	private String laptopName;
	
	private HarDisk hardisk;
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Laptop(int laptopId, String laptopName, HarDisk hardisk) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.hardisk = hardisk;
	}

	public HarDisk getHardisk() {
		return hardisk;
	}

	public void setHardisk(HarDisk hardisk) {
		this.hardisk = hardisk;
	}

	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", hardisk=" + hardisk + "]";
	}
	
	
	
}
