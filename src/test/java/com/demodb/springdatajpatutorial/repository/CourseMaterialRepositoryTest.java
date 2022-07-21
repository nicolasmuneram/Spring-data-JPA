package com.demodb.springdatajpatutorial.repository;

import com.demodb.springdatajpatutorial.entity.Course;
import com.demodb.springdatajpatutorial.entity.CourseMaterial;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository repository;

    @BeforeEach
    void setUp() {

        Course course = Course.builder()
                .title("Data")
                .credit(3)
                .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.google.com")
                .course(course)
                .build();

        repository.save(courseMaterial);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void saveCourseMaterial(){

    }

}