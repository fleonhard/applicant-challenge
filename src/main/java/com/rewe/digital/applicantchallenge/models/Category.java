package com.rewe.digital.applicantchallenge.models;

public class Category {
    private final String id;
    private final String name;
    private final Integer version;
    private final String slug;
    private final String parentId;
    private final Boolean deleted;

    public Category(String id, String name, Integer version, String slug, String parentId, Boolean deleted) {
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

    public String getName() {
        return name;
    }

    public Integer getVersion() {
        return version;
    }

    public String getSlug() {
        return slug;
    }

    public String getParentId() {
        return parentId;
    }

    public Boolean getDeleted() {
        return deleted;
    }
}
