package mua.services;

import mua.assemblers.AssemblerUtil;
import mua.dto.booking.BookingStore;
import mua.models.Booking;
import mua.models.responses.GetBookingsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingService {

    @Autowired
    private BookingStore bookingStore;

    public List<GetBookingsResponse> getBookings() {
        return bookingStore.getBookings()
                .stream()
                .map(AssemblerUtil::convertToGetBookingsResponse)
                .collect(Collectors.toList());
    }

    public Booking scheduleBooking(Booking booking) {
        bookingStore.save(booking);
        return booking;
    }

//    public List<Booking> getDailyAvailableTimes(String date) {
//        return bookingRepository.findByDate(date);
//    }




}
