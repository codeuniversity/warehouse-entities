package com.metrowarehouse.entities;

import java.util.Objects;

public class PickingArticle extends OrderArticle {
    private String pickingLocation;

    public PickingArticle(String id, String name, StorageArea storageArea, String ean, int quantity) {
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
