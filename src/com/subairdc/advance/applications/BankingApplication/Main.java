package com.subairdc.advance.applications.BankingApplication;

import java.io.IOException;

import com.subairdc.advance.applications.BankingApplication.Bank.Bank;
import com.subairdc.advance.applications.BankingApplication.Customer.Customer;
import com.subairdc.advance.applications.BankingApplication.Customer.CustomerFileHandler;
import com.subairdc.advance.applications.BankingApplication.Customer.CustomerHandler;

public class Main {

	public static void main(String[] args) {
		
		CustomerFileHandler fileHandler = new CustomerFileHandler();
		try {
			fileHandler.initilize(); //add customer details to the list from the text file
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		CustomerHandler customerHandler = new CustomerHandler();
		customerHandler.addCustomer(); 
		
		//Print All Customer Details
		for(Customer customer:Bank.customersList) {
			System.out.println(customer.toString());
		}
	}

}
