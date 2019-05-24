package com.codeclan.bookingsystem.BookingSystem.controllers;

import com.codeclan.bookingsystem.BookingSystem.models.Course;
import com.codeclan.bookingsystem.BookingSystem.models.Customer;
import com.codeclan.bookingsystem.BookingSystem.repositories.courseRespositories.CourseRepository;
import com.codeclan.bookingsystem.BookingSystem.repositories.customerRespositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController{

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    List<Customer> getAllCustomers(){
        return customerRepository.findAll(); }


    @GetMapping(value = "/{customerId}/courses")
    public List<Course> getCoursesForCustomer(@PathVariable Long customerId) {
        return customerRepository.getAllCoursesForCustomer(customerId);
    }


}
