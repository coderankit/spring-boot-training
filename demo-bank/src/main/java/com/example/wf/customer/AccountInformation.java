/**
 * 
 */
package com.example.wf.customer;

import java.util.UUID;

/**
 * @author Administrator
 *
 */
public class AccountInformation {

	private String accountNumber;
	
	private double accountBalance;
	
	private String accountType;

	public AccountInformation(double accountBalance, String accountType) {
		
		this.accountNumber = UUID.randomUUID().toString();
		this.accountBalance = accountBalance;
		this.accountType = accountType;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void updateBalance(double amount) {
		
		accountBalance += amount;
	}
}