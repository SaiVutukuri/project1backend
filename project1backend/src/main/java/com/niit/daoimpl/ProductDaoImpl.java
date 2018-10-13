package com.niit.daoimpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.models.Product;
@Repository
@Transactional //commit and rollback
public class ProductDaoImpl implements ProductDao {
	@Autowired//Spring container auto wire bean of type SessionFactory
private SessionFactory sessionFactory;
	
	
	public ProductDaoImpl(){
		System.out.println("ProductDaoImpl bean is created");
	}
	
	public void addProduct(Product product) {//product is input
		//database operation -insert product details in product table
		Session session=sessionFactory.openSession();
		session.save(product);//permanently store the product object in database, session.save
		session.flush();
	}

	public void updateProduct(Product product) {//product.id=5
		Session session=sessionFactory.openSession();
		session.update(product);
		session.flush();
	}

}
