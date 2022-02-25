package com.rewe.digital.applicantchallenge.services;

import com.rewe.digital.applicantchallenge.models.Category;
import com.rewe.digital.applicantchallenge.models.CategoryEntity;
import com.rewe.digital.applicantchallenge.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Optional<Category> getById(String id) {
        return categoryRepository.findById(id).map(this::map);
    }

    private Category map(CategoryEntity categoryEntity) {
        return new Category(
                categoryEntity.getId(),
                categoryEntity.getName(),
                categoryEntity.getVersion(),
                categoryEntity.getSlug(),
                categoryEntity.getParentId(),
                categoryEntity.getDeleted()
        );
    }
}
