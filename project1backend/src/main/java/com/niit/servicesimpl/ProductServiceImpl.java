package com.niit.servicesimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.models.Category;
import com.niit.models.Customer;
import com.niit.models.Product;
import com.niit.services.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao pdao;
	public ProductServiceImpl() {         
		System.out.println("ProductServiceImplementation Bean Has Been Created");
	}
	
	public void deleteProducts(int id) {
		pdao.deleteProducts(id);
	}
	public Product selectProducts(int id) {
		return pdao.selectProducts(id);
	}
	public List<Product> getAllProducts()
	{
		return pdao.getAllProducts();
	}


	public void addProduct(Product p) {
	
		 pdao.addProduct(p);
	}


	public void updateProduct(Product p) {
	
		pdao.updateProduct(p);
		
		
	}


	public List<Category> getAllCategories() {
		return pdao.getAllCategories();
		
	}

	public boolean isEmailUnique(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	public void registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}


	
}
