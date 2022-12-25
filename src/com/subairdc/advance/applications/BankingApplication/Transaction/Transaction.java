package com.subairdc.advance.applications.BankingApplication.Transaction;

public class Transaction {
	private int transactionId;
	private String type;
	double amonut;
	double balance;
	
	
	public Transaction(int transactionId, String type, double amonut, double balance) {
		super();
		this.transactionId = transactionId;
		this.type = type;
		this.amonut = amonut;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return transactionId + "\t" + type + "\t" + amonut + "\t"+ balance;
	}



	public int getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getAmonut() {
		return amonut;
	}


	public void setAmonut(double amonut) {
		this.amonut = amonut;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
