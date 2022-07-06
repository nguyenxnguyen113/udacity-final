package com.example.demo;

import com.example.demo.model.persistence.Cart;
import com.example.demo.model.persistence.Item;
import com.example.demo.model.persistence.User;
import com.example.demo.model.requests.ModifyCartRequest;
import java.math.BigDecimal;
import java.util.ArrayList;


public class TestObjectUtils {

  public static User getUser() {
    User user = new User();
    user.setId(1l);
    user.setUsername("nguyen4567");
    user.setPassword("nguyen123@1234");


    Cart cart = new Cart();
    cart.setId(22l);
    cart.setTotal(new BigDecimal(101));
    cart.setItems(new ArrayList<>());

    user.setCart(cart);

    Item item = new Item();
    item.setId(11l);
    item.setName("nguyen01");
    item.setDescription("nguyen-001");
    item.setPrice(new BigDecimal(101));


    return user;
  }

  public static Item getItem() {
    Item item = new Item();
    item.setId(11l);
    item.setName("phone");
    item.setPrice(new BigDecimal(101));
    item.setDescription("New flagship Phone.");
    return item;
  }

  public static ModifyCartRequest cgetCrtRequest() {
    ModifyCartRequest cartRequest = new ModifyCartRequest();
    cartRequest.setQuantity(1);
    cartRequest.setUsername("udacity");
    cartRequest.setItemId(11l);
    return cartRequest;
  }
}
