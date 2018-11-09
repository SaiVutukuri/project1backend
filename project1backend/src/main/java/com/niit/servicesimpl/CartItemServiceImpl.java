package com.niit.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CartItemDao;
import com.niit.models.CartItem;
import com.niit.services.CartItemService;
@Service
@Transactional
public class CartItemServiceImpl implements CartItemService{
 @Autowired
	private CartItemDao cartItemDao;
	public void addToCart(CartItem cartItem) {
		cartItemDao.addToCart(cartItem);
		
	}
	public void deleteFromCart(int id) {
		cartItemDao.deleteFromCart(id);
		
	}
	public void removeAllCartItem() {
		cartItemDao.removeAllCartItem();
		
	}
	public double getTotalPrice() {
		return cartItemDao.getTotalPrice();
	}
	public long getCount() {
		return cartItemDao.getCount();
	}

}
