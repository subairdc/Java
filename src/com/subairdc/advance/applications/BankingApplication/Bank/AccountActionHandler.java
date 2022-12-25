package com.subairdc.advance.applications.BankingApplication.Bank;

import com.subairdc.advance.applications.BankingApplication.Customer.Customer;
import com.subairdc.advance.applications.BankingApplication.Transaction.Transaction;
import com.subairdc.advance.applications.BankingApplication.Transaction.TransactionHandler;

public class AccountActionHandler {
	
	public void deposit(int customerId, double amount) {
		
		Customer customer = Bank.customerMap.get(customerId);
		
		if(amount<0)
			return;
		
		double balance = customer.getBalance();
		balance += amount;
		
		customer.setBalance(balance);
		
		Bank.customerMap.put(customerId, customer);
		
		TransactionHandler transactionHandler = new TransactionHandler();
		int lastTransactionId = transactionHandler.getLastTransaction(customerId);
		
		Transaction transaction = new Transaction(++lastTransactionId, "Deposit", amount, balance);
		transactionHandler.writeTransaction(customerId, transaction);
		
	}
	
	public boolean withDrawl(int customerId, double amount) {
		
		Customer customer = Bank.customerMap.get(customerId);
		double balance = customer.getBalance();
		
		balance -= amount;
		
		if(balance>=1000) {
			customer.setBalance(balance);
			Bank.customerMap.put(customerId, customer);
			
			TransactionHandler transactionHandler = new TransactionHandler();
			int lastTransactionId = transactionHandler.getLastTransaction(customerId);
			
			Transaction transaction = new Transaction(++lastTransactionId, "withDraw", amount, balance);
			transactionHandler.writeTransaction(customerId, transaction);
			
			return true;
		}
		System.out.println("Insuficiant Balance");
		
		return false;
	}
	
	public void transferAmount(int fromCustomerId, int toCustomerId, double amount) {
		
		Customer toCustomer = Bank.customerMap.get(toCustomerId);
		
		if(toCustomer == null) {
			System.out.println("The Customer doesn't exist");
			return;
		}
		
		Customer fromCustomer = Bank.customerMap.get(fromCustomerId);
		
		boolean isSuccessWithdrawl = withDrawl(fromCustomerId, amount);
		
		if(isSuccessWithdrawl) {
			deposit(toCustomerId, amount);
		}
		
	}
	
	private void logTransaction(int customerId, Transaction transaction) {
		
	}

}
