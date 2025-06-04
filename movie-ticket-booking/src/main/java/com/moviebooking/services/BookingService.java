package com.moviebooking.services;

import com.moviebooking.models.Booking;
import com.moviebooking.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking bookTicket(Booking booking) {
        return bookingRepository.save(booking);
    }

    public Optional<Booking> retrieveBooking(Long id) {
        return bookingRepository.findById(id);
    }

    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}