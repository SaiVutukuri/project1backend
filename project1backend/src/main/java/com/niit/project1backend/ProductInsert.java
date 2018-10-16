package com.niit.project1backend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.DBConfiguration;
import com.niit.daoimpl.ProductDaoImpl;
import com.niit.models.Product;
import com.niit.services.ProductService;
import com.niit.servicesimpl.ProductServiceImpl;



public class ProductInsert {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(DBConfiguration.class,ProductDaoImpl.class,ProductServiceImpl.class);
		ProductService pds=(ProductService)ac.getBean("productServiceImpl");
		Product p=new Product();
		/*p.setProductname("CAR");
		p.setProductdesc("BENZ WHITE");
		p.setQuantity(5);
		p.setPrice(750000);*/
		/*p.setProductname("Phone");
		p.setProductdesc("Mi Note5 Pro");
		p.setQuantity(5);
		p.setPrice(15000);*/
		p.setProductname("	Banana");
		p.setProductdesc("Apple");
		p.setQuantity(2);
		p.setPrice(1500);
		//p.setId(5);
		pds.addProduct(p);
		System.out.println("PRODUCT INSERTED SUCCESSFULLY");
	}

}
