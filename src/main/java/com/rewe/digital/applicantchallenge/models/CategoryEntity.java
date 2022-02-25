package com.rewe.digital.applicantchallenge.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class CategoryEntity {
    @Id
    private String id;
    private String name;
    private Integer version;
    private String slug;
    private String parentId;
    private Boolean deleted;

    public CategoryEntity() {
    }

    public CategoryEntity(String id, String name, Integer version, String slug, String parentId, Boolean deleted) {
        this.id = id;
        this.name = name;
        this.version = version;
        this.slug = slug;
        this.parentId = parentId;
        this.deleted = deleted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
