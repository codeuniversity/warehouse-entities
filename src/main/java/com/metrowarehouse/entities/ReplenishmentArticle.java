package com.metrowarehouse.entities;

import java.util.Objects;

public class ReplenishmentArticle extends OrderArticle {
    private String storageLocation;
    private String futurePickingLocation;

    public ReplenishmentArticle(String id, String name, StorageArea storageArea, String ean, int quantity) {
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



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ReplenishmentArticle other = (ReplenishmentArticle) obj;
        return Objects.equals(this.storageLocation, other.storageLocation)
                && Objects.equals(this.futurePickingLocation, other.futurePickingLocation);
    }
}
