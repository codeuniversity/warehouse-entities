package com.metrowarehouse.entities;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class ReplenishmentArticle extends OrderArticle {
    private String storageLocation;
    private String futurePickingLocation;

    @JsonCreator
    public ReplenishmentArticle(@JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("storageArea")StorageArea storageArea, @JsonProperty("ean") String ean, @JsonProperty("quantity") int quantity) {
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
