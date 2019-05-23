package com.codeclan.bookingsystem.BookingSystem.components;


import com.codeclan.bookingsystem.BookingSystem.models.Booking;
import com.codeclan.bookingsystem.BookingSystem.models.Course;
import com.codeclan.bookingsystem.BookingSystem.models.Customer;
import com.codeclan.bookingsystem.BookingSystem.repositories.bookingRepositories.BookingRepository;
import com.codeclan.bookingsystem.BookingSystem.repositories.courseRespositories.CourseRepository;
import com.codeclan.bookingsystem.BookingSystem.repositories.customerRespositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Customer john = new Customer("John", "Edinburgh", 22);
        customerRepository.save(john);

        Course java = new Course("java", "Edinburgh", 4, "10062019");
        courseRepository.save(java);

        Booking booking1 = new Booking("20052019", java, john);
        bookingRepository.save(booking1);

        Customer dan = new Customer("Dan", "Edinburgh", 29);
        customerRepository.save(dan);

        Course python = new Course("python", "Edinburgh", 3, "11062019");
        courseRepository.save(python);

        Booking booking2 = new Booking("20052019", python, dan);
        bookingRepository.save(booking2);

        Customer alan = new Customer("Alan", "Edinburgh", 24);
        customerRepository.save(alan);

        Course ruby = new Course("ruby", "Edinburgh", 4, "10062019");
        courseRepository.save(ruby);

        Booking booking3 = new Booking("20052019", ruby, alan);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("20052019", ruby, dan);
        bookingRepository.save(booking4);

        Booking booking5 = new Booking("20052019", java, alan);
        bookingRepository.save(booking5);


    }
}
