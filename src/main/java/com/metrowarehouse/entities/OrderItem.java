package com.metrowarehouse.entities;

import java.util.Objects;

public  class OrderItem {
    private Article article;
    private long quantity;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
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

        OrderItem orderItem = (OrderItem) obj;

        return Objects.equals(article,orderItem.article) && Objects.equals(quantity,orderItem.quantity);
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "article=" + article +
                ", quantity=" + quantity +
                '}';
    }
}
