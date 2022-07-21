package com.demodb.springdatajpatutorial.repository;


import com.demodb.springdatajpatutorial.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long> {


}
