package com.project.courseregistrationsystem.service;

import com.project.courseregistrationsystem.entity.Student;
import com.project.courseregistrationsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    //  Register new student (Encrypt password)
    public void register(Student student) {
        student.setPassword(passwordEncoder.encode(student.getPassword()));
        studentRepo.save(student);
    }
}

