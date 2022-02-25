package com.rewe.digital.applicantchallenge.controller;

import com.rewe.digital.applicantchallenge.models.Category;
import com.rewe.digital.applicantchallenge.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("categories")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Category> getCategory(@PathVariable("id") String id) {
        var category = categoryService.getById(id);
        return category
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
