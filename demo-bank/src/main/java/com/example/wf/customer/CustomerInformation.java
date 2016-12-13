package com.example.wf.customer;

import java.util.UUID;

public class CustomerInformation {

	private String customerId;
	
	private String name;
	
	private int age;
	
	private String phoneNumber;
	
	private String email;
	
	private AccountInformation accountInformation;

	public CustomerInformation(String name, int age, String phoneNumber, String email) {

		this.customerId = UUID.randomUUID().toString();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setAccountInformation(AccountInformation accountInformation) {
		this.accountInformation = accountInformation;
	}
	
	public AccountInformation getAccountInformation() {
		return accountInformation;
	}
	
	public String getCustomerId() {
		return customerId;
	}
}
