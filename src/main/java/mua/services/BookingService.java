package mua.services;

import mua.jpa.BookingRepository;
import mua.models.Booking;
import mua.models.responses.GetBookingsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public GetBookingsResponse getBookings() {
        List<Booking> bookings = bookingRepository.findAll();
        GetBookingsResponse response = new GetBookingsResponse();

//        response.setBookedTimes(bookings.);

    }
}
