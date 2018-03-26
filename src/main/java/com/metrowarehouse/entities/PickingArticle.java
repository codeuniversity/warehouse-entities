package com.metrowarehouse.entities;

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


}
