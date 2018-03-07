package com.metrowarehouse.entities;

import org.hibernate.annotations.Type;

import javax.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "STORAGE_LOCATIONS")
public class StorageLocation {

    @Id
    @Column(name = "STORAGE_LOCATION_ID", nullable = false)
    @Type(type="uuid-char")
    private UUID id;

    @Column(name = "ARTICLE_ID")
    @Type(type="uuid-char")
    private UUID articleId;

    @Enumerated(EnumType.STRING)
    @Column(name = "STORAGE_AREA", nullable = false)
    private StorageArea storageArea;

    @Column(name = "QUANTITY", nullable = false)
    private int quantity;

    public StorageLocation () {}

    public StorageLocation(UUID id, StorageArea storageArea) {
        this.id = id;
        this.storageArea = storageArea;
        quantity = 0;
    }

    public UUID getId() {
        return id;
    }

    public UUID getArticleId() {
        return articleId;
    }

    public void setArticleId(UUID articleId) {
        this.articleId = articleId;
    }

    public StorageArea getStorageArea() {
        return storageArea;
    }

    public int getQuantity() {
        return quantity;
    }

}
