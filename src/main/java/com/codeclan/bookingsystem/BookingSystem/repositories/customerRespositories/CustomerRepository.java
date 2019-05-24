package com.codeclan.bookingsystem.BookingSystem.repositories.customerRespositories;

import com.codeclan.bookingsystem.BookingSystem.models.Course;
import com.codeclan.bookingsystem.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Course> getAllCoursesForCustomer(Long customerId);
}
