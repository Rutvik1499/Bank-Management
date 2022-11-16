package com.project.bankapp;

import java.util.Scanner;

public class BankApplication {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BankService bank = new BankService();
		
		while(sc.hasNext()) {
			
			System.out.println("Choose any option:");
			System.out.println("1.Create Account");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Account Info");
			System.out.println("5.Transfer");
			
			int command = sc.nextInt();
			
			switch(command) {
			
			case 1: 
				String name = sc.next();
				long phoneNo = sc.nextLong();
				bank.createAccount(name,phoneNo);
				break;
				
			case 2:
				bank.deposit(sc.nextLong(),sc.nextLong());
				break;
				
			case 3:
				bank.withdraw(sc.nextLong(),sc.nextLong());
				break;
				
			case 4:
				bank.giveAccInfo(sc.nextLong());
				break;
				
			case 5:
				bank.transfer(sc.nextLong(),sc.nextLong(),sc.nextLong());
				break;
				
			default:
				System.out.println("Invalid Command");
				sc.nextLine();
			}
			
		}
		sc.close();
	}

}
