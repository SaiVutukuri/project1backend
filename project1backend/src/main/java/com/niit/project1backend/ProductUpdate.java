package com.niit.project1backend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.DBConfiguration;
import com.niit.daoimpl.ProductDaoImpl;
import com.niit.models.Product;
import com.niit.services.ProductService;
import com.niit.servicesimpl.ProductServiceImpl;

public class ProductUpdate {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(DBConfiguration.class,ProductDaoImpl.class,ProductServiceImpl.class);
		ProductService pds=(ProductService)ac.getBean("productServiceImpl");
		Product p=new Product();
		p.setProductname("BIKE");
		p.setProductdesc("ROYAL ENFIELD");
		p.setQuantity(1);
		p.setPrice(150000);
		p.setId(1);
		pds.updateProduct(p);
		System.out.println("PRODUCT UPDATED SUCCESSFULLY");
	}

}
