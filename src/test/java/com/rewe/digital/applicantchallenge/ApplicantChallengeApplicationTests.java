package com.rewe.digital.applicantchallenge;

import com.rewe.digital.applicantchallenge.repositories.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicantChallengeApplicationTests {

    private final CategoryRepository repository;

    @Autowired
    public ApplicantChallengeApplicationTests(CategoryRepository repository) {
        this.repository = repository;
    }

    @Test
    void contextLoads() {
    }

}
