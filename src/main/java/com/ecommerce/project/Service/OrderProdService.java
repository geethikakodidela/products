package com.ecommerce.project.Service;

import java.util.List;

import com.ecommerce.project.model.OrderproductModel;

public interface OrderProdService {
	public void CreateOrderProdData(OrderproductModel orderproductmodel);

	public List<OrderproductModel>getAllOrderData();
	
}
