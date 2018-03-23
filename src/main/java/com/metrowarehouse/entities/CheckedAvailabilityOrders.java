package com.metrowarehouse.entities;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CheckedAvailabilityOrders {
    private OrderStockStatus orderStockStatus;
    private List<OrderArticle> orderArticles;


    @JsonCreator
    public CheckedAvailabilityOrders(@JsonProperty("orderArticles") List<OrderArticle> orderarticles, @JsonProperty("orderStockStatus") OrderStockStatus orderStockStatus) {
        this.orderStockStatus = orderStockStatus;
        this.orderArticles = orderarticles;
    }

    public OrderStockStatus getOrderStockStatus() {
        return orderStockStatus;
    }

    public void setOrderStockStatus(OrderStockStatus orderStockStatus) {
        this.orderStockStatus = orderStockStatus;
    }


    public CheckedAvailabilityOrders(List<OrderArticle> orderArticles) {
        this.orderArticles = orderArticles;
    }


    public List<OrderArticle> getOrderArticles() {
        return orderArticles;
    }

    public void setOrderArticles(List<OrderArticle> orderArticles) {
        this.orderArticles = orderArticles;
    }
}