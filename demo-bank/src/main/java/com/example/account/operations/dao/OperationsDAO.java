package com.example.account.operations.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.wf.customer.AccountInformation;
import com.example.wf.customer.CustomerInformation;

@Repository
public class OperationsDAO {
	
	Map<String, CustomerInformation> customerInformations = new HashMap<>();
	
	public void openAccount(CustomerInformation customerInformation) {
		
		customerInformations.put(customerInformation.getCustomerId(), customerInformation);
	}

	public void addMoney(String customerId, double amount) {
		
		customerInformations.get(customerId).getAccountInformation().updateBalance(amount);
		System.out.println(this.getClass().getName() + " - Money Added");
	}

	public void deductMoney(String customerId, double amount) {

		customerInformations.get(customerId).getAccountInformation().updateBalance(-amount);
	}

	public AccountInformation fetchAccountDetails(String customerId) {
		
		return customerInformations.get(customerId).getAccountInformation();
	}

	public double getBalance(String customerId) {
		
		return customerInformations.get(customerId).getAccountInformation().getAccountBalance();
	}
}
