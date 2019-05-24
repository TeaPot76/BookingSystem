package com.codeclan.bookingsystem.BookingSystem.repositories.bookingRepositories;

import com.codeclan.bookingsystem.BookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findBookingsByCourseId(Long id);
//    List<Booking> findBookingsByCourseId(Long id);
    List<Booking> findBookingsByDate(String date);
}
