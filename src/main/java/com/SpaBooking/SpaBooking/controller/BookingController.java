package com.SpaBooking.SpaBooking.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpaBooking.SpaBooking.model.Booking;
import com.SpaBooking.SpaBooking.service.BookingService;

@RestController
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public String getRoot() {
        return "{'Hello': 'Spa!'}";
    }

    @PostMapping("/booking")
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingService.addBooking(booking);
    }

    @GetMapping("/bookings")
    public List<Booking> getBookings() {
        return bookingService.getBookings();
    }

}
