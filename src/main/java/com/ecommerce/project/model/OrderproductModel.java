package com.ecommerce.project.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Orderproduct")
public class OrderproductModel {
   private int orderId;
   private int orderProdId;
   private int productId;
   private int quantity;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public int getOrderProdId() {
	return orderProdId;
}
public void setOrderProdId(int orderProdId) {
	this.orderProdId = orderProdId;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}
