package com.codeclan.bookingsystem.BookingSystem.repositories.courseRespositories;

import com.codeclan.bookingsystem.BookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
