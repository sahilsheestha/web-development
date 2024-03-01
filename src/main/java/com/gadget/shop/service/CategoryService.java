package com.gadget.shop.service;

import com.gadget.shop.domain.Category;

import java.util.List;


public interface CategoryService {

    void save(Category category);
    List<Category> findAll();
}
