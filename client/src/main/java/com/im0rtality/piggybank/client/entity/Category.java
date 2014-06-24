package com.im0rtality.piggybank.client.entity;

public class Category {
    private Category parent;

    private String title;

    public Category(String title, Category parent) {
        this.parent = parent;
        this.title = title;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
