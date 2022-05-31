package com.ecommerce.project.ServiceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.Repository.OrderProdRepository;
import com.ecommerce.project.Service.OrderProdService;
import com.ecommerce.project.model.OrderproductModel;
@Service
public class OrderProdServiceImpl implements OrderProdService {
	@Autowired
	OrderProdRepository orderprodrepository;

	public void CreateOrderProdData(OrderproductModel orderproductmodel) {
		orderprodrepository.save(orderproductmodel);
			}

	public List<OrderproductModel>getAllOrderData() {
		return orderprodrepository.findAll();
	}

}