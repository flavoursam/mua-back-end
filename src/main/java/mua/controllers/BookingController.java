package mua.controllers;

import mua.models.requests.ScheduleBookingRequest;
import mua.models.responses.GetBookingsResponse;
import mua.models.responses.ScheduleBookingResponse;
import mua.services.BookingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(BookingController.BOOKING)
public class BookingController {

    public final static String BOOKING = "/booking";

    private BookingService bookingService;

    @GetMapping
    public GetBookingsResponse getBookings() {
        return bookingService.getBookings();
    }


    @PostMapping
    public ScheduleBookingResponse scheduleBooking(@RequestBody ScheduleBookingRequest request,
                                                   @RequestParam float start,
                                                   @RequestParam float finish,
                                                   @RequestParam int year,
                                                   @RequestParam String month,
                                                   @RequestParam int day) {
        ScheduleBookingResponse response = new ScheduleBookingResponse();
        response.setBookingId("<abc123>");
        response.setResult("success.");

        return response;
    }

}



