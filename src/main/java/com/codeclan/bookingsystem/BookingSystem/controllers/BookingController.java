package com.codeclan.bookingsystem.BookingSystem.controllers;


import com.codeclan.bookingsystem.BookingSystem.models.Booking;
import com.codeclan.bookingsystem.BookingSystem.models.Course;
import com.codeclan.bookingsystem.BookingSystem.models.Customer;
import com.codeclan.bookingsystem.BookingSystem.repositories.bookingRepositories.BookingRepository;
import com.codeclan.bookingsystem.BookingSystem.repositories.customerRespositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public List<Booking> getAllbookings(){
        return bookingRepository.findAll();
    }
    @GetMapping(value ="/id/{id}")
    public List<Booking>findBookingsByCourse(@PathVariable Long id){
        return bookingRepository.findBookingsByCourseId(id);
    }
//    @GetMapping(value ="/name/{name}")
//    public List<Booking>findCustomersByCourseId(@PathVariable Long id){
//        return bookingRepository.findCustomersByCourseId(id);
//    }

    @GetMapping(value ="/date/{date}")
    public List<Booking>findBookingsByDate(@PathVariable String date){
        return bookingRepository.findBookingsByDate(date);
    }

}
