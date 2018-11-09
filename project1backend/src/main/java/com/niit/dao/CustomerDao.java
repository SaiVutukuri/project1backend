package com.niit.dao;

import java.util.List;

import com.niit.models.CartItem;
import com.niit.models.Customer;
import com.niit.models.User;

public interface CustomerDao {
	public void registerCustomer(Customer customer);

	public boolean isEmailUnique(String email);

	public User getUser(String email);
}
