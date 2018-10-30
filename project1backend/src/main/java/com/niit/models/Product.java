package com.niit.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="PRODUCT")
public class Product {
	@Id  //unique and not null
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@NotEmpty(message="Productname is mandatory") private String productname;
@NotEmpty(message="productname is required") private String productdesc;
@Min(value=0,message="Minimum quantity must be 0")
private int quantity;
@Min(value=1,message="minimum price must be 1")
private double price;
@ManyToOne
private Category category;//FK category_id 
@Transient //non persistent
private MultipartFile image;//no column for image in product table
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getProductdesc() {
	return productdesc;
}
public void setProductdesc(String productdesc) {
	this.productdesc = productdesc;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	System.out.println("Setter method for category property in Product");
	this.category = category;
}
public MultipartFile getImage() {
	return image;
}
public void setImage(MultipartFile image) {
	this.image = image;
}

}