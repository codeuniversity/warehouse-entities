package com.metrowarehouse.entities;

import org.hibernate.annotations.Type;

import java.util.UUID;
import javax.persistence.*;

@Entity
@Table(name = "UNFULFILLED_ORDER_ARTICLES")
public class UnfulfilledOrderArticle {

    @Id
    @Column(name = "ID", nullable = false)
    @Type(type="uuid-char")
    private UUID id;

    @Column(name = "ORDER_ID", nullable = false)
    @Type(type="uuid-char")
    private UUID orderId;

    @Column(name = "ARTICLE_ID", nullable = false)
    @Type(type="uuid-char")
    private UUID articleId;

    @Column(name = "ARTICLE_NAME", nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "STORAGE_AREA", nullable = false)
    private StorageArea storageArea;

    @Column(name = "EAN", nullable = false)
    private String ean;

    public UnfulfilledOrderArticle () {}

    public UnfulfilledOrderArticle(UUID orderId, UUID articleId, String name, StorageArea storageArea, String ean) {
        id = UUID.randomUUID();
        this.orderId = orderId;
        this.articleId = articleId;
        this.name = name;
        this.storageArea = storageArea;
        this.ean = ean;
    }

    public UUID getId() {
        return id;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public UUID getArticleId() {
        return articleId;
    }

    public String getName() {
        return name;
    }

    public StorageArea getStorageArea() {
        return storageArea;
    }

    public String getEan() {
        return ean;
    }

}
