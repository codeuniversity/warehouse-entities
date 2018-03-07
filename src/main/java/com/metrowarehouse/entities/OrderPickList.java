package com.metrowarehouse.entities;

import java.util.List;
import java.util.Objects;

public class OrderPickList {
    private String customerId;
    private String orderId;

    private List<OrderItem> chilledItems;
    private List<OrderItem> deepFrozenItems;
    private List<OrderItem> mainItems;
    private List<OrderItem> dangerousItems;

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

    public List<OrderItem> getChilledItems() {
        return chilledItems;
    }

    public void setChilledItems(List<OrderItem> chilledItems) {
        this.chilledItems = chilledItems;
    }

    public List<OrderItem> getDeepFrozenItems() {
        return deepFrozenItems;
    }

    public void setDeepFrozenItems(List<OrderItem> deepFrozenItems) {
        this.deepFrozenItems = deepFrozenItems;
    }

    public List<OrderItem> getMainItems() {
        return mainItems;
    }

    public void setMainItems(List<OrderItem> mainItems) {
        this.mainItems = mainItems;
    }

    public List<OrderItem> getDangerousItems() {
        return dangerousItems;
    }

    public void setDangerousItems(List<OrderItem> dangerousItems) {
        this.dangerousItems = dangerousItems;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if(obj == null ) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        OrderPickList orderPickList = (OrderPickList) obj;

        return Objects.equals(customerId,orderPickList.customerId) && Objects.equals(orderId,orderPickList.orderId) && Objects.equals(chilledItems,orderPickList.chilledItems)
                && Objects.equals(mainItems,orderPickList.mainItems) && Objects.equals(deepFrozenItems,orderPickList.deepFrozenItems) && Objects.equals(dangerousItems,orderPickList.dangerousItems);
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
                '}';
    }
}
