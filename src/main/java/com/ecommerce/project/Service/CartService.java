
package com.ecommerce.project.Service;

import java.util.List;

import com.ecommerce.project.model.Cart;

public interface CartService {
	public void createcart(Cart cart);

	public List<Cart> getallcartData();

	public void EditCart(int userId,Cart  newcart );
	public void deleteCartData(int userId);
}
