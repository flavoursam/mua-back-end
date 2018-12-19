package mua.controllers;

import mua.models.requests.ScheduleBookingRequest;
import mua.models.responses.GetBookingsResponse;
import mua.models.responses.ScheduleBookingResponse;
import mua.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(BookingController.BOOKING)
public class BookingController {

    public final static String BOOKING = "/booking";

    @Autowired
    private BookingService bookingService;

    @GetMapping
    public List<GetBookingsResponse> getBookings() {
        return bookingService.getBookings();
    }

    @PostMapping
    public ScheduleBookingResponse scheduleBooking(@RequestBody ScheduleBookingRequest request,
                                                   @RequestParam float start,
                                                   @RequestParam float finish,
                                                   @RequestParam int year,
                                                   @RequestParam String month,
                                                   @RequestParam int day) {
//        ScheduleBookingResponse response = new ScheduleBookingResponse();
        return bookingService.scheduleBooking(request, start, finish, year, month, day);
    }

}



