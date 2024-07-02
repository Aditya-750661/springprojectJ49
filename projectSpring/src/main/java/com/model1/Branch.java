package com.model1;

public class Branch {

	private String branchAddress;
	private String ifscCode;
	
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Branch(String branchAddress, String ifscCode) {
		super();
		this.branchAddress = branchAddress;
		this.ifscCode = ifscCode;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	@Override
	public String toString() {
		return "Branch [branchAddress=" + branchAddress + ", ifscCode=" + ifscCode + "]";
	}
	
	
	
}
