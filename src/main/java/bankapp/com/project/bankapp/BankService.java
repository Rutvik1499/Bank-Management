package com.project.bankapp;

import java.util.HashMap;
import java.util.Map;

public class BankService {

	private Map<Long, Account> accounts = new HashMap<>();

	public void createAccount(String name, long phoneNo) {

		long accNoId = System.currentTimeMillis();
		Account acc = new Account(name, phoneNo, accNoId, 0);
		accounts.put(accNoId, acc);
		System.out.println("Created");
		System.out.println("Account number is " + accNoId);

	}

	public void deposit(long accNo, long amount) {

		Account acc = accounts.get(accNo);

		if (acc == null) {
			System.out.println("Account number Invalid");
		} else if (amount < 0) {
			System.out.println("Amount is invalid");
		} else {
			acc.setBalance(acc.getBalance() + amount);
			System.out.println("Amount deposited ");
			System.out.println("Now your balance is " + acc.getBalance());
		}

	}

	public void withdraw(long accNo, long amount) {

		Account acc = accounts.get(accNo);

		if (acc == null) {
			System.out.println("Account number Invalid");
		} else if (amount < 0) {
			System.out.println("Amount is invalid");
		} else {
			acc.setBalance(acc.getBalance() - amount);
			System.out.println("Amount deposited ");
			System.out.println("Now your balance is " + acc.getBalance());
		}

	}

	public void giveAccInfo(long accNo) {

		Account acc = accounts.get(accNo);

		if (acc == null) {
			System.out.println("Invalid Account Number");
		} else {
			System.out.println("Account Details");
			System.out.println("Name- " + acc.getName());
			System.out.println("Phone number- " + acc.getPhoneNo());
			System.out.println("Balance- " + acc.getBalance());
		}

	}

	public void transfer(long sender, long receiver, long amount) {

		Account senderId = accounts.get(sender);
		Account receiverId = accounts.get(receiver);

		if (senderId == null || receiverId == null) {
			System.out.println("Account not found");
		} else if (amount < 0) {
			System.out.println("Invalid Amount");
		}else if(senderId.getBalance() < amount) {
			System.out.println("Insufficient Balance in your account");
		}else {
			senderId.setBalance(senderId.getBalance() - amount);
			receiverId.setBalance(receiverId.getBalance() + amount);
			System.out.println("Amount transfered Successfully");
		}
	}

}
