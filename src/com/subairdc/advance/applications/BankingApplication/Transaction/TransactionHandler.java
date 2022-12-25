package com.subairdc.advance.applications.BankingApplication.Transaction;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TransactionHandler {
	
	public void writeTransaction(int customerId, Transaction transaction) {
		
		String fileName = "src/com/subairdc/advance/applications/BankingApplication/Transaction/"+customerId+".txt";

		try {
			File file = new File(fileName);
			
			boolean isNewFile = false;
			if(!file.exists()) {
				file.createNewFile();
				isNewFile = true;
			}
			
			PrintWriter writer = new PrintWriter(new FileWriter(file,true));
			
			if(!isNewFile) {
				writer.write("\n");
			}
			writer.append(transaction.toString());
			writer.close();
		} catch (Exception e) {
			System.out.println("Exception: "+ e);
		}
	}
	
	public int getLastTransaction(int customerId) {
		String fileName = "src/com/subairdc/advance/applications/BankingApplication/Transaction/"+customerId+".txt";

		try {
			File file = new File(fileName);
			if(!file.exists()) {
				return 0;
			}
			Scanner sc = new Scanner(file);
			
			String transaction = "";
			while(sc.hasNext()) {
				transaction = sc.nextLine();
			}
			sc.close();
			Transaction trans = castString(transaction);
			
			return trans.getTransactionId();
			
		} catch (Exception e) {
			System.out.println("Exception: "+ e);
		}
		return 0;
		
	}
	
	private Transaction castString(String transaction) {
		String[] arr = transaction.split("\t");
		return new Transaction(
				Integer.parseInt(arr[0]),
				arr[1],
				Double.parseDouble(arr[2]),
				Double.parseDouble(arr[3])
		);
	}
	
	public void printTransaction(int customerId) {
		String fileName = "src/com/subairdc/advance/applications/BankingApplication/Transaction/"+customerId+".txt";

		try {
			File file = new File(fileName);
			if(!file.exists()) {
				return;
			}
			Scanner sc = new Scanner(file);
			System.out.println("Id \tType \tAmount \tBalance");
			String transaction = "";
			while(sc.hasNext()) {
				transaction = sc.nextLine();
				System.out.println(transaction);
			}
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Exception: "+ e);
		}
	
	}
}
