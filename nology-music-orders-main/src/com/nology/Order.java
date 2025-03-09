package com.nology;

import java.util.List;

public class Order {

    protected int id;
    protected Customer customer;
    protected OrderStatus status;
    protected Address billingAddress;
    protected List<OrderItem> items;

}
