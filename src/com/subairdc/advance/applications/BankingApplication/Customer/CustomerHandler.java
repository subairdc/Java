package com.subairdc.advance.applications.BankingApplication.Customer;

import java.io.IOException;
import java.util.Scanner;

import com.subairdc.advance.applications.BankingApplication.Bank.Bank;

public class CustomerHandler {
	
	public void addCustomer() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your password: ");
		String password = sc.nextLine();
		
		System.out.print("Re-Enter your password: ");
		String rePassword = sc.nextLine();
		
		if(!password.contentEquals(rePassword)) {
			System.out.println("Add customer failed: Password Missmatch");
			return;
		}
		
		Bank.refCustomerId++;
		Bank.refAccountNo++;
		
		//create object for new customer and add to the list
		Customer customer = new Customer(
				Bank.refCustomerId,
				Bank.refAccountNo, 
				name, password, 
				Bank.INITIAL_BAL);
		Bank.customersList.add(customer);
		
		System.out.println(customer.toString()); //print new Customer Details
		
		//add customer details to the text file
		try {
			CustomerFileHandler.getInstance().addCustomerToFile(customer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
