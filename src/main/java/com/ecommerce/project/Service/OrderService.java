package com.ecommerce.project.Service;

import java.util.List;

import com.ecommerce.project.model.Order;

public interface OrderService {
	public void CreateOrderData(Order order);

	public List<Order> getAllOrderData();

	public void EditOrderData(String orderId, Order neworder);

	public void deleteOrderData(String orderId);
}
