package com.marketingapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
