
package com.ecommerce.project.ServiceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.Repository.CartRepository;
import com.ecommerce.project.Service.CartService;

import com.ecommerce.project.model.Cart;

@Service
public class CartServiceImplementation implements CartService {
	@Autowired
	CartRepository cartrepository;

	public void createcart(Cart cart) {
		cartrepository.save(cart);
	}

	public List<Cart> getallcartData() {
		return cartrepository.findAll();
	}

	public void EditCart(int userId, Cart newcart) {
		Optional<Cart> data = cartrepository.findById(userId);
		Cart cart = data.get();
		cart.setUserId(newcart.getUserId());
		cart.setQuantity(newcart.getQuantity());
		cart.setProducts(newcart.getProducts());
		cart.setTotalPrice(newcart.getTotalPrice());
		cartrepository.save(newcart);
	}

	public void deleteCartData(int userId) {
		cartrepository.deleteById(userId);
	}
}
