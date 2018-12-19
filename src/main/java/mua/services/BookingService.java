package mua.services;

import mua.jpa.BookingRepository;
import mua.models.Booking;
import mua.models.responses.GetBookingsResponse;
import mua.utilities.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<GetBookingsResponse> getBookings() {
        List<Booking> bookings = bookingRepository.findAll();

        return Utilities.getBookingsHelper(bookings);
    }



}
