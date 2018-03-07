package com.metrowarehouse.entities;

import java.util.*;

public class Article {
    private String id;
    private String name;
    private String storageArea;
    private String ean;
    private String pickingLocation;
    private String replenishmentLocation;

    public String getPickingLocation() {
        return pickingLocation;
    }

    public void setPickingLocation(String pickingLocation) {
        this.pickingLocation = pickingLocation;
    }

    public String getReplenishmentLocation() {
        return replenishmentLocation;
    }

    public void setReplenishmentLocation(String replenishmentLocation) {
        this.replenishmentLocation = replenishmentLocation;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStorageArea() {
        return storageArea;
    }

    public String getEan() {
        return ean;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStorageArea(String storageArea) {
        this.storageArea = storageArea;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }


    @Override
    public boolean equals(Object articleObj) {
        if (articleObj == this) {
            return true;
        }

        if(articleObj == null ) {
            return false;
        }

        if (getClass() != articleObj.getClass()) {
            return false;
        }
        Article article = (Article) articleObj;

        return Objects.equals(id,article.id) && Objects.equals(name,article.name) && Objects.equals(storageArea,article.storageArea) && Objects.equals(ean,article.ean) && Objects.equals(replenishmentLocation,article.replenishmentLocation) && Objects.equals(pickingLocation,article.pickingLocation);
    }

    @Override
    public String toString() {
        return "Article{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", storageArea='" + storageArea + '\'' +
                ", ean='" + ean + '\'' +
                ", pickingLocation='" + pickingLocation + '\'' +
                ", replenishmentLocation='" + replenishmentLocation + '\'' +
                '}';
    }
}
