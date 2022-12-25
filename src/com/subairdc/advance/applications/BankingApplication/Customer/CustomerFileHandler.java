package com.subairdc.advance.applications.BankingApplication.Customer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import com.subairdc.advance.applications.BankingApplication.Bank.Bank;

public class CustomerFileHandler {
	
	private static final String fileName = "src/com/subairdc/advance/applications/BankingApplication/Bank/bank_db.txt";
	
	public static CustomerFileHandler handler;
	
	public static CustomerFileHandler getInstance() {
		
		if(handler == null) {
			handler = new CustomerFileHandler();
		}
		return handler;
	}
	
	public void initilize() throws IOException  {
		
		File file = new File(fileName);
		if(!file.exists()) {
			file.createNewFile();
		}
		
		//Buffer Reader can't communicate file directly so create fileReader
		FileReader fr = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(fr);
		
		String customerInfo = reader.readLine();
		
		while(customerInfo != null) {
			// add customer to list after the separate word in String
			
			Customer customerClass = castStringToCustomer(customerInfo);
			Bank.customersList.add(customerClass);
			Bank.customerMap.put(customerClass.getCutomerId(), customerClass);
			customerInfo = reader.readLine();
		}
		
		reader.close();
		
		int refPosition = Bank.customersList.size()-1;
		Bank.refCustomerId = Bank.customersList.get(refPosition).getCutomerId();
		Bank.refAccountNo = Bank.customersList.get(refPosition).getAccountNo();
		
		
	}
	
	private Customer castStringToCustomer(String customerInfo) {
		
		String[] trimedInfo = customerInfo.split(" ");
		Customer customer = new Customer(
				Integer.parseInt(trimedInfo[0]),
				Long.parseLong(trimedInfo[1]),
				trimedInfo[2],
				trimedInfo[3],
				Double.parseDouble(trimedInfo[4]) );
//		Bank.customersList.add(customer);
		
		return customer;	
	}
	
	public void addCustomerToFile(Customer customer) throws IOException {
		File file = new File(fileName);
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			writer.write(customer.toString()+"\n");
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void finalizeFile() throws IOException {
		File file = new File(fileName);

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			Set keySet = Bank.customerMap.keySet();
			Iterator iterator = keySet.iterator();
			
			while (iterator.hasNext()) {
				int customerId = (int) iterator.next();
				Customer customer = Bank.customerMap.get(customerId);
				writer.write(customer.toString()+"\n");
			}
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
