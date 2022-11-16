package com.project.bankapp;

public class Account {

	private String name;

	private long phoneNo;

	private long accNo;

	private long balance;

	public Account(String name, long phoneNo, long accNo, long balance) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.accNo = accNo;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

}
