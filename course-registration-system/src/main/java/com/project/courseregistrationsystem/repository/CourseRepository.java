package com.project.courseregistrationsystem.repository;

import com.project.courseregistrationsystem.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>
{

}
