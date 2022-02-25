package com.rewe.digital.applicantchallenge.repositories;

import com.rewe.digital.applicantchallenge.models.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, String> {
}
