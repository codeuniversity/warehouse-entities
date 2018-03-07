package com.metrowarehouse.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StockServiceMessage {
    private OrderStockStatus orderStockStatus;
    private OrderItem[] orderItems;


    @JsonCreator
    public StockServiceMessage(@JsonProperty("orderItems") OrderItem[] orderItems, @JsonProperty("orderStockStatus") OrderStockStatus orderStockStatus) {
        this.orderStockStatus = orderStockStatus;
        this.orderItems = orderItems;
    }

    public OrderStockStatus getOrderStockStatus() {
        return orderStockStatus;
    }

    public void setOrderStockStatus(OrderStockStatus orderStockStatus) {
        this.orderStockStatus = orderStockStatus;
    }


    public StockServiceMessage(OrderItem[] orderItems) {
        this.orderItems = orderItems;
    }



    public OrderItem[] getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(OrderItem[] orderItems) {
        this.orderItems = orderItems;
    }


}
