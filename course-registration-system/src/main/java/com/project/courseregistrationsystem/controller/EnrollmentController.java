package com.project.courseregistrationsystem.controller;

import com.project.courseregistrationsystem.entity.Enrollment;
import com.project.courseregistrationsystem.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping
    public Enrollment enroll(@RequestParam Long studentId, @RequestParam Long courseId) {
        return enrollmentService.enroll(studentId, courseId);
    }

    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return enrollmentService.getAllEnrollments();
    }
}

