package com.codeclan.bookingsystem.BookingSystem.controllers;

import com.codeclan.bookingsystem.BookingSystem.models.Course;
import com.codeclan.bookingsystem.BookingSystem.models.Customer;
import com.codeclan.bookingsystem.BookingSystem.repositories.courseRespositories.CourseRepository;
import com.codeclan.bookingsystem.BookingSystem.repositories.customerRespositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
    @GetMapping (value ="/rating/{rating}")
    List<Course> findCourseByRating(@PathVariable int rating){
        return courseRepository.findCourseByRating(rating);
    }

    @GetMapping(value = "/{id}/customers")
    public List<Customer> customersForCourse(@PathVariable Long id){
        return courseRepository.getAllCustomersForCourse(id);
    }


}
