package com.subairdc.advance.applications.BankingApplication.Bank;

import java.util.ArrayList;
import java.util.List;

import com.subairdc.advance.applications.BankingApplication.Customer.Customer;

public class Bank {
	
	public static List<Customer> customersList = new ArrayList<>();
	
	public static int refCustomerId;
	public static long refAccountNo;
	public static double INITIAL_BAL = 10000;
	
	Bank(List<Customer> customersList) {
		this.customersList = customersList;
	}
	
	public String toString(Customer customer) {
		String res = customer.getCutomerId() + " " + customer.getAccountNo()+ " " + 
				customer.getName() + " " + customer.getPassword() + " " + customer.getBalance();
		return res;
	}
	
}
