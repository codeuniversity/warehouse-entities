package com.metrowarehouse.entities;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class PickingArticle extends OrderArticle {
    private String pickingLocation;

    @JsonCreator
    public PickingArticle(@JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("storageArea")StorageArea storageArea, @JsonProperty("ean") String ean, @JsonProperty("quantity") int quantity) {
        super(id, name, storageArea, ean, quantity);
    }

    public String getPickingLocation() {
        return pickingLocation;
    }

    public void setPickingLocation(String pickingLocation) {
        this.pickingLocation = pickingLocation;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        final PickingArticle other = (PickingArticle) obj;
        return Objects.equals(this.pickingLocation, other.pickingLocation);
    }
}
