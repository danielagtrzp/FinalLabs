package org.example;

import java.util.List;
import java.util.Objects;

public class Cart {
    private Integer userId;
    private List<OrderItem> orderItems;

    public Cart(Integer userId) {
        this.userId = userId;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    //Add order item to cart
    public void add(OrderItem orderItem){
        orderItems.add(orderItem);
    }

    //delete order Item by Id
    //todo

    //clean cart
    public void cleanCart(){
        orderItems.clear();
    }
}
