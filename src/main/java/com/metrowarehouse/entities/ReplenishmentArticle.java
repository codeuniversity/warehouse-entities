package com.metrowarehouse.entities;

public class ReplenishmentArticle extends OrderArticle {
    private String storageLocation;
    private String futurePickingLocation;

    public ReplenishmentArticle(String id, String name, String storageArea, String ean, int quantity) {
        super(id, name, storageArea, ean, quantity);
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public String getFuturePickingLocation() {
        return futurePickingLocation;
    }

    public void setFuturePickingLocation(String futurePickingLocation) {
        this.futurePickingLocation = futurePickingLocation;
    }
}
