package com.rewe.digital.applicantchallenge.controller;

import com.rewe.digital.applicantchallenge.models.Category;
import com.rewe.digital.applicantchallenge.services.CategoryService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class CategoryControllerTest {

    @Test
    public void shouldReturnCategoryById() {
        var serviceMock = Mockito.mock(CategoryService.class);
        var category = new Category("1234", "Category1", 1, "category1", null, false);

        when (serviceMock.getById(category.getId())).thenReturn(Optional.of(category));

        var controller = new CategoryController(serviceMock);

        var responseEntity = controller.getCategory(category.getId());
        assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
        assertEquals(responseEntity.getBody(), category);
    }

}
