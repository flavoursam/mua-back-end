package mua.services;

import mua.jpa.BookingRepository;
import mua.models.Booking;
import mua.models.requests.ScheduleBookingRequest;
import mua.models.responses.GetBookingsResponse;
import mua.models.responses.ScheduleBookingResponse;
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

    public ScheduleBookingResponse scheduleBooking(ScheduleBookingRequest request, float start, float finish, int year, String month, int day) {
        // create booking object, schedule booking, save to db
        Booking booking = Utilities.scheduleBookingHelper(request, start, finish, year, month, day);
        bookingRepository.save(booking);

        // return booking response to user
        ScheduleBookingResponse response = new ScheduleBookingResponse();
        response.setBookingId(booking.getBookingId());
        response.setResult("Your booking was successful.");

        return response;
    }
}
