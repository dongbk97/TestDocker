package com.demodocker2.service;

import com.demodocker2.entity.Student;
import com.demodocker2.repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StService {


    private final StudentRepo studentRepo;


    public List<Student> saveAllStudent() {

        List<Student> studentList = Arrays.asList(
                new Student(1, "Dong 1"),
                new Student(2, "Dong 2"),
                new Student(3, "Dong 3"),
                new Student(4, "Dong 4"),
                new Student(5, "Dong 5"),
                new Student(6, "DOng 6")
        );


        return studentRepo.saveAll(studentList);
    }


    public List<Student> getAllStudent() {


        return studentRepo.findall();
    }


}
