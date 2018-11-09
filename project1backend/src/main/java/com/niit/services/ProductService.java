package com.niit.services;

import java.util.List;

import com.niit.models.Category;
import com.niit.models.Customer;
import com.niit.models.Product;



public interface ProductService {
public void addProduct(Product p);
public void updateProduct(Product p);
public void deleteProducts(int id);
public Product selectProducts(int id);
public List<Product> getAllProducts();
public List<Category> getAllCategories();
public boolean isEmailUnique(String email);
public void registerCustomer(Customer customer);
}
