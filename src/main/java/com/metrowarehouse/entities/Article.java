package com.metrowarehouse.entities;

import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "ARTICLES")
public class Article {

    @Id
    @Column(name = "ARTICLE_ID", nullable = false)
    @Type(type="uuid-char")
    private UUID id;

    @Column(name = "ARTICLE_NAME", nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "STORAGE_AREA", nullable = false)
    private StorageArea storageArea;

    @Column(name = "EAN", nullable = false)
    private String ean;

    @OneToMany(fetch= FetchType.LAZY, mappedBy = "articleId", cascade = CascadeType.ALL)
    private List<StorageLocation> storageLocations;

    @OneToMany(fetch= FetchType.LAZY, mappedBy = "articleId", cascade = CascadeType.ALL)
    private List<PickingLocation> pickingLocations;
    
    public Article() {}

    public Article(UUID id, String name, StorageArea storageArea, String ean) {
        this.id = id;
        this.name = name;
        this.storageArea = storageArea;
        this.ean = ean;
        storageLocations = new ArrayList<>();
        pickingLocations = new ArrayList<>();
    }

    public UUID getId() {
        return id;
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
