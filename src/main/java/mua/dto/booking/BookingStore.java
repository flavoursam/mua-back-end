package mua.dto.booking;


import mua.models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingStore {

    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }


    public void save(Booking booking) {
        bookingRepository.save(booking);
    }

}
