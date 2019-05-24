package com.codeclan.bookingsystem.BookingSystem.repositories.customerRespositories;

import com.codeclan.bookingsystem.BookingSystem.models.Course;
import com.codeclan.bookingsystem.BookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Course> getAllCoursesForCustomer(Long customerId);
}
