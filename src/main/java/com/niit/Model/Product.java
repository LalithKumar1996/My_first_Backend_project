package com.niit.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductDetail")
public class Product
{
@Id
 private int productId;
@Column(nullable=false)
private String productName;
@Column(nullable=false)
private String productPrice;
@Column(nullable=false)
private String productQuality;
@Column(nullable=false)
private String productDescription;

@Column(nullable=false)
private String productColor;
public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public String getProductPrice() {
	return productPrice;
}

public void setProductPrice(String productPrice) {
	this.productPrice = productPrice;
}

public String getProductQuality() {
	return productQuality;
}

public void setProductQuality(String productQuality) {
	this.productQuality = productQuality;
}

public String getProductDescription() {
	return productDescription;
}

public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}

public String getProductColor() {
	return productColor;
}

public void setProductColor(String productColor) {
	this.productColor = productColor;
}




}



