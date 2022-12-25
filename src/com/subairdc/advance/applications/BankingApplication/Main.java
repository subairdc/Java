package com.subairdc.advance.applications.BankingApplication;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Handler;

import com.subairdc.advance.applications.BankingApplication.Bank.AccountActionHandler;
import com.subairdc.advance.applications.BankingApplication.Bank.Bank;
import com.subairdc.advance.applications.BankingApplication.Customer.Customer;
import com.subairdc.advance.applications.BankingApplication.Customer.CustomerFileHandler;
import com.subairdc.advance.applications.BankingApplication.Customer.CustomerHandler;

public class Main {
	
	static CustomerFileHandler fileHandler = new CustomerFileHandler();

	public static void main(String[] args) throws IOException {
		
		
		try {
			fileHandler.initilize(); //add customer details to the list from the text file
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		printMenu();
		
//		Print All Customer Details
		for(Customer customer:Bank.customersList) {
			System.out.println(customer.toString());
		}
	}
	
	public static void printMenu() {
		System.out.println("Please Select Below Option: "+
				"\n 1 - Create User \n 2 - Deposit \n 3 - With Drawl \n 4 - Fund Transfer");
		try {
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt(); 
			
			CustomerHandler customerHandler = new CustomerHandler();
			AccountActionHandler accountHandler = new AccountActionHandler();
			
			switch(option) {
				case 1:
					customerHandler.addCustomer();
					break;
				case 2:
					deposit();
					fileHandler.finalizeFile();
					break;
				case 3:
					withDrawl();
					fileHandler.finalizeFile();
					break;
				case 4:
					transferAmount();
					fileHandler.finalizeFile();
					break;
				default:
					System.out.println("Invalid Option");
					break;
			}
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}
		
	}

	private static void deposit() {
		
		CustomerHandler customerHandler = new CustomerHandler();
		AccountActionHandler accountHandler = new AccountActionHandler();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter CustomerId: ");
		int customerId = sc.nextInt();
		
		System.out.print("Enter Password: ");
		String password = sc.next();
		
		if(customerHandler.authenticateCustomer(customerId, password)) {
			System.out.print("Enter Deposit Amount: ");
			double amount = sc.nextDouble();
			
			accountHandler.deposit(customerId, amount);
		}

	}
	
	private static void withDrawl() {
			
			CustomerHandler customerHandler = new CustomerHandler();
			AccountActionHandler accountHandler = new AccountActionHandler();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter CustomerId: ");
			int customerId = sc.nextInt();
			
			System.out.print("Enter Password: ");
			String password = sc.next();
			
			if(customerHandler.authenticateCustomer(customerId, password)) {
				System.out.print("Enter withDrawl Amount: ");
				double amount = sc.nextDouble();
				
				accountHandler.withDrawl(customerId, amount);
			}
			
		}

	private static void transferAmount() {
		CustomerHandler customerHandler = new CustomerHandler();
		AccountActionHandler accountHandler = new AccountActionHandler();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter CustomerId: ");
		int customerId = sc.nextInt();
		
		System.out.print("Enter Password: ");
		String password = sc.next();
		
		if(customerHandler.authenticateCustomer(customerId, password)) {
			System.out.print("Enter CustomerId to Transfer: ");
			int toCustomerId = sc.nextInt();
			
			System.out.print("Enter Transfer Amount: ");
			double amount = sc.nextDouble();
			
			accountHandler.transferAmount(customerId, toCustomerId, amount);
		}
	
}
}
