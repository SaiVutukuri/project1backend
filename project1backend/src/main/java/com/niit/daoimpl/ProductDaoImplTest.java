package com.niit.daoimpl;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.DBConfiguration;
import com.niit.dao.ProductDao;
import com.niit.models.Product;


public class ProductDaoImplTest extends TestCase{
ApplicationContext ac=new AnnotationConfigApplicationContext(DBConfiguration.class,ProductDaoImpl.class);
ProductDao productDao=(ProductDao)ac.getBean("productDaoImpl");
@Ignore
@Test
public void testAddProducts() {
Product p=new Product();
p.setProductname("BIKE");
p.setProductdesc("ROYAL ENFIELD");
p.setQuantity(5);
p.setPrice(750000);
//p.setId(5);
productDao.addProduct(p);
assertTrue(p.getId()>0);
}

@Test
public void testUpdateProducts() {
Product p= productDao.selectProducts(4);
p.setPrice(70000);
p.setProductdesc("NIIT");
p.setProductname("DTEJA");
p.setQuantity(1);
productDao.updateProduct(p);
p=productDao.selectProducts(4);
assertTrue(p.getPrice() == 70000 && p.getProductdesc()=="NIIT" && p.getProductname()=="DTEJA" && p.getQuantity()==1);
}
@Ignore
@Test
public void testDeleteProducts() {
productDao.deleteProducts(2);
Product p=productDao.selectProducts(2);
assertNull(p);
}
@Ignore
@Test
public void testSelectProducts() {
Product actualproduct1=productDao.selectProducts(1);
Product actualproduct2=productDao.selectProducts(45);
assertNotNull(actualproduct1);
assertNull(actualproduct2);
}
@Ignore
@Test
public void testGetAllProducts() {
List<Product> p=productDao.getAllProducts();
assertFalse(p.isEmpty());
assertTrue(p.size()==9);
}

}