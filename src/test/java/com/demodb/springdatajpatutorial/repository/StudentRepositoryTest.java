package com.demodb.springdatajpatutorial.repository;

import com.demodb.springdatajpatutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("nicolas@gmail.com")
                .firstName("Nicolas")
                .lastName("Munera")
                .guardianEmail("paic@gmail.com")
                .guardianName("pauli")
                .guardianMobile("123123")
                .build();
        studentRepository.save(student);
    }
    
}