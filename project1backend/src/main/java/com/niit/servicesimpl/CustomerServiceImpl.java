package com.niit.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CustomerDao;
import com.niit.models.Customer;
import com.niit.models.User;
import com.niit.services.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	public void registerCustomer(Customer customer)
	{
		customerDao.registerCustomer(customer);
	}
	
	public boolean isEmailUnique(String email) {
		
		return customerDao.isEmailUnique(email);
	}
	
	public User getUser(String email) {
		
		return customerDao.getUser(email);
	}
}
