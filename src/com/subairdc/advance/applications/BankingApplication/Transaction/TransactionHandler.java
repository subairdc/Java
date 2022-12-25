package com.subairdc.advance.applications.BankingApplication.Transaction;

import java.io.File;
import java.io.PrintWriter;

public class TransactionHandler {
	
	public void writeTransaction(int customerId, Transaction transaction) {
		
		String fileName = "src/com/subairdc/advance/applications/BankingApplication/Transaction/"+customerId+".txt";

		try {
			File file = new File(fileName);
			if(!file.exists()) {
				file.createNewFile();
			}
			PrintWriter writer = new PrintWriter(fileName);
			writer.append(transaction.toString());
			writer.close();
		} catch (Exception e) {
			System.out.println("Exception: "+ e);
		}
		
		
	}
}
