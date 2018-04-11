package com.metrowarehouse.entities;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class CheckingAvailabilityOrder {
    private OrderStockStatus orderStockStatus;
    private List<OrderArticle> orderArticles;


    @JsonCreator
    public CheckingAvailabilityOrder(@JsonProperty("orderArticles") List<OrderArticle> orderarticles, @JsonProperty("orderStockStatus") OrderStockStatus orderStockStatus) {
        this.orderStockStatus = orderStockStatus;
        this.orderArticles = orderarticles;
    }

    public OrderStockStatus getOrderStockStatus() {
        return orderStockStatus;
    }

    public void setOrderStockStatus(OrderStockStatus orderStockStatus) {
        this.orderStockStatus = orderStockStatus;
    }


    public CheckingAvailabilityOrder(List<OrderArticle> orderArticles) {
        this.orderArticles = orderArticles;
    }


    public List<OrderArticle> getOrderArticles() {
        return orderArticles;
    }

    public void setOrderArticles(List<OrderArticle> orderArticles) {
        this.orderArticles = orderArticles;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CheckingAvailabilityOrder other = (CheckingAvailabilityOrder) obj;
        return Objects.equals(this.orderStockStatus, other.orderStockStatus) &&
                (orderArticles.size() == other.getOrderArticles().size())
                && orderArticles.containsAll(other.getOrderArticles()) && other.getOrderArticles().containsAll(orderArticles);
    }
}
