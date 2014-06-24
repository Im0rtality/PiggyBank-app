package com.im0rtality.piggybank.client.fixtures;

import com.im0rtality.piggybank.client.ColorGenerator;
import com.im0rtality.piggybank.client.entity.Category;

public class CategoryFixture {
    private ColorGenerator colorGenerator;
    private Integer i;

    public CategoryFixture(ColorGenerator colorGenerator) {
        this.colorGenerator = colorGenerator;
        i = 0;
    }

    public Category nextCategory() {
        return new Category(String.format("Category #%d", i++), null, colorGenerator.nextColor());
    }
}
