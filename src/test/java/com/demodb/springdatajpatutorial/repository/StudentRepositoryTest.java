package com.demodb.springdatajpatutorial.repository;

import com.demodb.springdatajpatutorial.entity.Guardian;
import com.demodb.springdatajpatutorial.entity.Student;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.Guard;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @BeforeEach
    void init() {

        Guardian guardian2 = Guardian.builder()
                .name("Jaime")
                .email("jaime@prueba.com")
                .mobile("2341")
                .build();

        Student student = Student.builder()
                .emailId("nicolas@gmail.com")
                .firstName("Nicolas")
                .lastName("Munera")
                .guardian(guardian2)
                .build();

        Guardian guardian = Guardian.builder()
                .name("Sandra")
                .email("prueba@prueba.com")
                .mobile("1123434")
                .build();


        Student student2 = Student.builder()
                .emailId("prueba@gmail.com")
                .firstName("Nicole")
                .lastName("prueba")
                .guardian(guardian)
                .build();
        studentRepository.save(student);
        studentRepository.save(student2);
    }

    @AfterEach
    void end() {
        studentRepository.deleteAll();
    }

    @Test
    public void printStudentByFirstName(){
        List<Student> students = studentRepository.findByFirstName("prueba");
        System.out.println("students = " + students);
    }

    @Test
    public void printStudentByFirstNameContaining(){
        List<Student> students = studentRepository.findByFirstNameContaining("Nic");
        System.out.println("students = " + students);
    }

    @Test
    public void printStudentBasedOnGuardianName(){
        List<Student> students = studentRepository.findByGuardianName("Sandra");
        System.out.println("students = " + students);
    }

    @Test
    public void printGetStudentByEmailAddress(){
        Student students = studentRepository.getStudentByEmailAddress("prueba@gmail.com");
        System.out.println("students = " + students);
    }

    @Test
    public void printGetStudentByEmailAddressNativeNamedParam(){
        Student students = studentRepository.getStudentByEmailAddressNativeNamedParam("prueba@gmail.com");
        System.out.println("students = " + students);
    }

}