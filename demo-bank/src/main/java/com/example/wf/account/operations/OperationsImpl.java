/**
 * 
 */
package com.example.wf.account.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.account.operations.dao.OperationsDAO;
import com.example.wf.account.exception.AccountExistException;
import com.example.wf.account.exception.OperationsException;
import com.example.wf.customer.AccountInformation;
import com.example.wf.customer.CustomerInformation;

/**
 * @author Administrator
 *
 */
@Service
@Qualifier("operations")
public class OperationsImpl implements Operations {
	
	private OperationsDAO operationsDAO;
	
	@Autowired
	public OperationsImpl(OperationsDAO operationsDAO) {
		
		this.operationsDAO = operationsDAO;
	}

	@Override
	public void openAccount(CustomerInformation customerInformation) throws AccountExistException, OperationsException {
		
		operationsDAO.openAccount(customerInformation);
	}

	@Override
	public void addMoney(String customerId, double amount) throws OperationsException {

		operationsDAO.addMoney(customerId, amount);
		System.out.println(this.getClass().getName() + " - Money Added");
	}

	@Override
	public void deductMoney(String customerId, double amount) throws OperationsException {

		operationsDAO.deductMoney(customerId, amount);
	}

	@Override
	public AccountInformation fetchAccountDetails(String customerId) throws OperationsException {

		return operationsDAO.fetchAccountDetails(customerId);
	}
	
	@Override
	public double getBalance(String customerId) throws OperationsException {
		
		return operationsDAO.getBalance(customerId);
	}
}