package com.demodocker2.repository;

import com.demodocker2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer> {
@Query(value = "select * from student",nativeQuery = true)
public List<Student> findall();

}
