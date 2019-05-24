package com.codeclan.bookingsystem.BookingSystem.repositories.courseRespositories;

import com.codeclan.bookingsystem.BookingSystem.models.Course;
import com.codeclan.bookingsystem.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findCourseByRating(int rating);
    List<Customer> getAllCustomersForCourse(Long id);
}
