package com.project.courseregistrationsystem.service;

import com.project.courseregistrationsystem.entity.Course;
import com.project.courseregistrationsystem.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

        @Autowired
        private CourseRepository courseRepo;

        public Course addCourse(Course course) {
                return courseRepo.save(course);
        }

        public List<Course> getAllCourses() {
                return courseRepo.findAll();
        }
}
