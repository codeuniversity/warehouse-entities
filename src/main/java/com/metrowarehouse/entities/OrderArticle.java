package com.metrowarehouse.entities;

import java.util.Objects;

public class OrderArticle {
    private String id;
    private String name;
    private String storageArea;
    private String ean;
    private int quantity;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStorageArea() {
        return storageArea;
    }

    public String getEan() {
        return ean;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStorageArea(String storageArea) {
        this.storageArea = storageArea;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final OrderArticle other = (OrderArticle) obj;
        return Objects.equals(this.id, other.id)
                && Objects.equals(this.name, other.name)
                && Objects.equals(this.storageArea, other.storageArea)
                && Objects.equals(this.ean, other.ean)
                && Objects.equals(this.quantity, other.quantity);
    }

    @Override
    public String toString() {
        return "Article{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", storageArea='" + storageArea + '\'' +
                ", ean='" + ean + '\'' +
                '}';
    }
}
