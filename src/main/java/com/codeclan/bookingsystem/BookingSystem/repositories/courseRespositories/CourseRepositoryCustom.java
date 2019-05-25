package com.codeclan.bookingsystem.BookingSystem.repositories.courseRespositories;

import com.codeclan.bookingsystem.BookingSystem.models.Customer;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Customer> getAllCustomersForCourse(Long id);
    List<Customer> getAllCustomersFromTownForCourse(Long id, String town);
}
