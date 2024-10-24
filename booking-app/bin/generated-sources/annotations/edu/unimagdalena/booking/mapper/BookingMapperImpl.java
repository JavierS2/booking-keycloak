package edu.unimagdalena.booking.mapper;

import edu.unimagdalena.booking.dto.BookingDTO;
import edu.unimagdalena.booking.entities.Booking;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-23T19:47:55-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
public class BookingMapperImpl implements BookingMapper {

    @Override
    public BookingDTO bookingToBookingDto(Booking booking) {
        if ( booking == null ) {
            return null;
        }

        BookingDTO bookingDTO = new BookingDTO();

        bookingDTO.setFlightNumber( booking.getFlightNumber() );
        bookingDTO.setId( booking.getId() );
        bookingDTO.setPassengerName( booking.getPassengerName() );

        return bookingDTO;
    }

    @Override
    public Booking bookingDtoToBooking(BookingDTO bookingDto) {
        if ( bookingDto == null ) {
            return null;
        }

        Booking booking = new Booking();

        booking.setFlightNumber( bookingDto.getFlightNumber() );
        booking.setId( bookingDto.getId() );
        booking.setPassengerName( bookingDto.getPassengerName() );

        return booking;
    }
}
