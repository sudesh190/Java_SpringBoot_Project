package com.project.courseregistrationsystem.service;

import com.project.courseregistrationsystem.entity.Course;
import com.project.courseregistrationsystem.entity.Enrollment;
import com.project.courseregistrationsystem.entity.Student;
import com.project.courseregistrationsystem.repository.CourseRepository;
import com.project.courseregistrationsystem.repository.EnrollmentRepository;
import com.project.courseregistrationsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepo;

    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private CourseRepository courseRepo;

    //  Enroll a student to a course
    public Enrollment enroll(Long studentId, Long courseId) {
        Student student = studentRepo.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        Course course = courseRepo.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        Enrollment enrollment = new Enrollment();
        enrollment.setStudent(student);
        enrollment.setCourse(course);

        return enrollmentRepo.save(enrollment);
    }

    //  Get all enrollments
    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepo.findAll();
    }
}

