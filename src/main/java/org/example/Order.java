package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Order {
    private Integer id;
    private Integer userId;
    private List<OrderItem> ordersItems;
    private Status status;
    private Double totalAmount;

    private static int count = 0;


    public Order( Integer userId, List<OrderItem> ordersItems) {
        this.id = count++;
        this.userId = userId;
        this.ordersItems = ordersItems;
        this.status = Status.received;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<OrderItem> getOrdersItems() {
        return ordersItems;
    }

    public void setOrdersItems(List<OrderItem> ordersItems) {
        this.ordersItems = ordersItems;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
