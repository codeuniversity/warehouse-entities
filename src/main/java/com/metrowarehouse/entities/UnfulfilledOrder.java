package com.metrowarehouse.entities;

import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "UNFULFILLED_ORDERS")
public class UnfulfilledOrder {

    @Id
    @Column(name = "ORDER_ID", nullable = false)
    @Type(type="uuid-char")
    private UUID orderId;

    @OneToMany(fetch= FetchType.EAGER, mappedBy = "orderId", cascade = CascadeType.ALL)
    private List<UnfulfilledOrderArticle> articles;

    public UnfulfilledOrder () {}

    public UnfulfilledOrder(UUID orderId) {
        this.orderId = orderId;
        this.articles = new ArrayList<>();
    }

    public UUID getOrderId() {
        return orderId;
    }

    public List<UnfulfilledOrderArticle> getArticles() {
        return articles;
    }

}
