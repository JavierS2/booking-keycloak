package edu.unimagdalena.booking.service;

import edu.unimagdalena.booking.dto.BookingDTO;

import java.util.List;

public interface BookingService {
    BookingDTO getBooking(Long id);
    BookingDTO saveBooking(BookingDTO bookingSave);
    BookingDTO updateBooking(Long id, BookingDTO bookingUpdate);
    void deleteBookingById(Long id);

    List<BookingDTO> getAll();


}