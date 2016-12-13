/**
 * 
 */
package com.example.wf.account.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.wf.account.operations.Operations;
import com.example.wf.customer.AccountInformation;
import com.example.wf.customer.CustomerInformation;

public class ClientOperation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		CustomerInformation customerInformation = getCustomerInformation();
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("accounts.xml");
		
		Operations operations = (Operations) applicationContext.getBean(Operations.class);
		
		operations.openAccount(customerInformation);
		
		operations.addMoney(customerInformation.getCustomerId(), 20000.00);
		System.out.println(operations.getBalance(customerInformation.getCustomerId()));
		
		operations.deductMoney(customerInformation.getCustomerId(), 20000.00);
		System.out.println(operations.getBalance(customerInformation.getCustomerId()));
	}

	private static CustomerInformation getCustomerInformation() {

		CustomerInformation customerInformation = new CustomerInformation("Ankit", 27, "8106057152", "ankit@wells.com");
		AccountInformation accountInformation = new AccountInformation(10000.00, "Savings");
		customerInformation.setAccountInformation(accountInformation);
		return customerInformation;
	}
}
