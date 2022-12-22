package com.subairdc.advance.applications.BankingApplication.Customer;

public class Customer {
	
	private int cutomerId;
	private long accountNo;
	private String name;
	private String password;
	private double balance;
	
	public static final String SPACE =" ";
	
	public Customer(int cutomerId, long accountNo, String name, String password, double balance) {
		super();
		this.cutomerId = cutomerId;
		this.accountNo = accountNo;
		this.name = name;
		this.password = password;
		this.balance = balance;
	}

	public int getCutomerId() {
		return cutomerId;
	}

	public void setCutomerId(int cutomerId) {
		this.cutomerId = cutomerId;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString() {
		String res = cutomerId + SPACE + accountNo+ SPACE + 
				name + SPACE + password + SPACE +balance;
		return res;
	}
}
