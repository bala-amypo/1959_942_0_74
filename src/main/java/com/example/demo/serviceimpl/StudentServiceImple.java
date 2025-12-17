package com.example.demo.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Stuentity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImple implements StudentService {
    // private final StudentRepository studentRepository;

    // public StudentServiceImple(StudentRepository studentrepository){
    //     this.studentRepository = studentRepository;
    // }
    @Autowired
    StudentRepository studentRepository;
   public Stuentity saveStudent(Stuentity student){
     return studentRepository.save(student);
   }
}
