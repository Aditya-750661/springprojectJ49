package com.model;

public class HarDisk {

	private int hardDiskId;
	private String hardDiskName;
	
	
	public HarDisk() {
		super();
		// TODO Auto-generated constructor stub
	}


	public HarDisk(int hardDiskId, String hardDiskName) {
		super();
		this.hardDiskId = hardDiskId;
		this.hardDiskName = hardDiskName;
	}


	public int getHardDiskId() {
		return hardDiskId;
	}


	public void setHardDiskId(int hardDiskId) {
		this.hardDiskId = hardDiskId;
	}


	public String getHardDiskName() {
		return hardDiskName;
	}


	public void setHardDiskName(String hardDiskName) {
		this.hardDiskName = hardDiskName;
	}
}
