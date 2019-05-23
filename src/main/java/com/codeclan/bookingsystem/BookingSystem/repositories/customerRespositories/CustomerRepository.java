package com.codeclan.bookingsystem.BookingSystem.repositories.customerRespositories;

import com.codeclan.bookingsystem.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
