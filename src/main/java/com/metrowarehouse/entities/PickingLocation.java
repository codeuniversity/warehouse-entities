package com.metrowarehouse.entities;

import org.hibernate.annotations.Type;

import java.util.UUID;
import javax.persistence.*;

@Entity
@Table(name = "PICKING_LOCATIONS")
public class PickingLocation {

    @Id
    @Column(name = "PICKING_LOCATION_ID", nullable = false)
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

    @Column(name = "ORDER_TRIGGERING_REPLENISHMENT")
    private UUID orderID;

    public PickingLocation () {}

    public PickingLocation(UUID articleId, StorageArea storageArea, int quantity) {
        this.id = UUID.randomUUID();
        this.articleId = articleId;
        this.storageArea = storageArea;
        this.quantity = quantity;
    }

    public UUID getId() {
        return id;
    }

    public UUID getArticleId() {
        return articleId;
    }

    public StorageArea getStorageArea() {
        return storageArea;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setOrderID(UUID orderID) {
        this.orderID = orderID;
    }

    public UUID getOrderID() {
        return orderID;
    }

}

