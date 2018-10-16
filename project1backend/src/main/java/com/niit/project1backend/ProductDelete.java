package com.niit.project1backend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.DBConfiguration;
import com.niit.models.Product;
import com.niit.services.ProductService;


public class ProductDelete {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(DBConfiguration.class,com.niit.daoimpl.ProductDaoImpl.class,com.niit.servicesimpl.ProductServiceImpl.class);
		ProductService pds=(ProductService)ac.getBean("productServiceImpl");
		Product p=new Product();
		/*p.setProductname("Car");
		p.setProductdesc("BENZ GRAY");
		p.setQuantity(1);
		p.setPrice(1500000);*/
		
		pds.deleteProducts(3);
	}

}
