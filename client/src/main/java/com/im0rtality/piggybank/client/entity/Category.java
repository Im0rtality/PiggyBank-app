package com.im0rtality.piggybank.client.entity;

import android.graphics.Color;

import java.security.SecureRandom;
import java.util.Random;

public class Category {
    private Category parent;

    private String title;

    private Integer color;

    public Category(String title, Category parent, Integer color) {
        this.parent = parent;
        this.title = title;
        this.color = color;
    }

    public Category(String title, Category parent) {
        this(title, parent, null);

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

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return title;
    }
}
