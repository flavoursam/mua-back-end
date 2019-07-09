package mua.controllers;

import mua.assemblers.AssemblerUtil;
import mua.models.Booking;
import mua.models.requests.ScheduleBookingRequest;
import mua.models.responses.BaseResponse;
import mua.models.responses.GetBookingsResponse;
import mua.models.responses.Interval;
import mua.models.responses.ScheduleBookingResponse;
import mua.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping(BookingController.BOOKING)
public class BookingController extends Controller implements Assembler {

    public final static String BOOKING = "/booking";

    @Autowired
    private BookingService bookingService;

    @GetMapping
    @ResponseBody
    public List<GetBookingsResponse> getBookings() {
        return bookingService.getBookings();
    }

    @PostMapping
    @ResponseBody
    public ScheduleBookingResponse scheduleBooking(@RequestBody ScheduleBookingRequest scheduleBookingRequest) {

        Booking booking = AssemblerUtil.convertToBooking(scheduleBookingRequest);
        Booking assembledBooking = bookingService.scheduleBooking(booking);

        return AssemblerUtil.convertToScheduleBookingResponse(assembledBooking);
    }

    @GetMapping("/booked/{date}")
    @ResponseBody
    public List<Interval> getDailyBookedTimes(@PathVariable("date") String date) {
        List<Booking> bookings = bookingService.getBookings();
        List<Interval> result = new ArrayList<>();

        for (Booking booking : bookings) {
            Interval bookedTimes = AssemblerUtil.convertToTimeSlot(booking, date);
            if (bookedTimes != null) {
                result.add(bookedTimes);
            }
        }

        return result;
    }

    @GetMapping("/available/{date}")
    @ResponseBody
    public List<Interval> getDailyAvailableTimes(@PathVariable("date") String date) {
        List<Interval> dailyBookedTimes = getDailyBookedTimes(date);

        return AssemblerUtil.convertToAvailableTimes(dailyBookedTimes, date);
    }

}



