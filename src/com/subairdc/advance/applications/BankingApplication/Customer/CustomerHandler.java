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
		
		if(!isValidPassword(password)) {
			System.out.println("Add customer failed: Invalid Password");
			return;
		}
		
		password = getEncryptedPassword(password);
		
		Bank.refCustomerId++;
		Bank.refAccountNo++;
		
		//create object for new customer and add to the list
		Customer customer = new Customer(
				Bank.refCustomerId,
				Bank.refAccountNo, 
				name, password, 
				Bank.INITIAL_BAL
		);
		Bank.customersList.add(customer);
		
		System.out.println(customer.toString()); //print new Customer Details
		
		//add customer details to the text file
		try {
			CustomerFileHandler.getInstance().addCustomerToFile(customer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

	private boolean isValidPassword(String password) {
		
		char[] passwordChar = password.toCharArray();
		
		for(char ch : passwordChar) {
			if((ch>=97 && ch <= 122) || (ch>=65 && ch<=90) || (ch>='0' && ch<='9' )) {
				continue;
			}else
				return false;
		}
		return true;
	}
	
	
	private String getEncryptedPassword(String password) {
		
		char[] passwordChar = password.toCharArray();
		
		for(int i=0; i< passwordChar.length; i++) {
			if(passwordChar[i] == 'Z' || passwordChar[i] == 'z' || passwordChar[i] == '9') {
				switch (passwordChar[i]) {
					case 'z':
						passwordChar[i] = 'a';
						break;
					case 'Z':
						passwordChar[i] = 'A';
						break;
					case '9':
						passwordChar[i] = '0';
						break;
				}
			}else {
				passwordChar[i] = (char) (passwordChar[i]+1);
			}
		}
		return String.valueOf(passwordChar);
	}
	
	public void authenticateCustomer(int customerId, String Password) {
		String encrpted = getEncryptedPassword(Password);
		
		Customer customer = Bank.customerMap.get(customerId);
		
		if(customer == null) {
			System.out.println("Invalid CustomerId");
			return;
		}
		
		if(encrpted.equals(customer.getPassword())){
			System.out.println("Valid Password");
		}else {
			System.out.println("Invalid Password");
		}
	}

}
