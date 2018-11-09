package com.niit.services;

import com.niit.models.CartItem;

public interface CartItemService {
public void addToCart(CartItem cartItem);

public void deleteFromCart(int id);

public void removeAllCartItem();

public double getTotalPrice();

public long getCount();
}
