package com.model1;

public class Bank {

	private int bankId;
	private String bankName;
	
	private Branch branch;

	public Bank() {
		
		
	}

	public Bank(int bankId, String bankName, Branch branch) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.branch = branch;
		System.out.println("setting value by constructor");
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", branch=" + branch + "]";
	}	
}
