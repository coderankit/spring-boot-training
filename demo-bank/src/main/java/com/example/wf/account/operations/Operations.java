/**
 * 
 */
package com.example.wf.account.operations;

import com.example.wf.account.exception.AccountExistException;
import com.example.wf.account.exception.OperationsException;
import com.example.wf.customer.AccountInformation;
import com.example.wf.customer.CustomerInformation;

/**
 * @author Administrator
 *
 */
public interface Operations {

	public void openAccount(CustomerInformation customerInformation) throws AccountExistException, OperationsException;
	
	public void addMoney(String customerId, double amount) throws OperationsException;
	
	public void deductMoney(String customerId, double amount) throws OperationsException;
	
	public AccountInformation fetchAccountDetails(String customerId) throws OperationsException;
	
	public double getBalance(String customerId) throws OperationsException;
}