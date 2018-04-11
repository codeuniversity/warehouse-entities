package com.metrowarehouse.entities;

import java.util.List;
import java.util.Objects;

public class OrderPickList {
    private String customerId;
    private String orderId;

    private List<OrderArticle> chilledItems;
    private List<OrderArticle> deepFrozenItems;
    private List<OrderArticle> mainItems;
    private List<OrderArticle> dangerousItems;
    private List<OrderArticle> replenishmentArticles;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<OrderArticle> getChilledItems() {
        return chilledItems;
    }

    public void setChilledItems(List<OrderArticle> chilledItems) {
        this.chilledItems = chilledItems;
    }

    public List<OrderArticle> getDeepFrozenItems() {
        return deepFrozenItems;
    }

    public void setDeepFrozenItems(List<OrderArticle> deepFrozenItems) {
        this.deepFrozenItems = deepFrozenItems;
    }

    public List<OrderArticle> getMainItems() {
        return mainItems;
    }

    public void setMainItems(List<OrderArticle> mainItems) {
        this.mainItems = mainItems;
    }

    public List<OrderArticle> getDangerousItems() {
        return dangerousItems;
    }

    public void setDangerousItems(List<OrderArticle> dangerousItems) {
        this.dangerousItems = dangerousItems;
    }

    public List<OrderArticle> getReplenishmentArticles() {
        return replenishmentArticles;
    }

    public void setReplenishmentArticles(List<OrderArticle> replenishmentArticles) {
        this.replenishmentArticles = replenishmentArticles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderPickList that = (OrderPickList) o;
        return Objects.equals(customerId, that.customerId) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(chilledItems, that.chilledItems) &&
                Objects.equals(deepFrozenItems, that.deepFrozenItems) &&
                Objects.equals(mainItems, that.mainItems) &&
                Objects.equals(dangerousItems, that.dangerousItems) &&
                Objects.equals(replenishmentArticles, that.replenishmentArticles);
    }

    @Override
    public String toString() {
        return "OrderPickList{" +
                "customerId='" + customerId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", chilledItems=" + chilledItems +
                ", deepFrozenItems=" + deepFrozenItems +
                ", mainItems=" + mainItems +
                ", dangerousItems=" + dangerousItems +
                ", replenishmentArticles=" + replenishmentArticles +
                '}';
    }
}
