package com.ecommerce.project.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.Repository.OrderRepository;
import com.ecommerce.project.Service.OrderService;
import com.ecommerce.project.model.Order;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepository orderrepository;

	public void CreateOrderData(Order order) {
		orderrepository.save(order);
	}

	public List<Order> getAllOrderData() {
		return orderrepository.findAll();

	}

	public void EditOrderData(String orderId, Order neworder) {
		Optional<Order> data = orderrepository.findById(orderId);
		Order order = data.get();
		order.setOrderId(neworder.getOrderId());
		order.setProductDetails(neworder.getProductDetails());
		order.setUserId(neworder.getUserId());
		order.setEmail(neworder.getEmail());
		order.setName(neworder.getName());
		order.setAddress(neworder.getAddress());
		order.setCity(neworder.getCity());
		order.setPhone(neworder.getPhone());

		orderrepository.save(order);
	}

	public void deleteOrderData(String orderId) {
		orderrepository.deleteById(orderId);
	}
}
