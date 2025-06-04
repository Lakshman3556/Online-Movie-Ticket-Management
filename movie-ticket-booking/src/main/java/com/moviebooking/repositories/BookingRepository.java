package com.moviebooking.repositories;

import com.moviebooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    // Additional query methods can be defined here if needed
}