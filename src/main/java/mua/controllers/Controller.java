package mua.controllers;

import mua.models.requests.ScheduleBookingRequest;
import mua.models.responses.GetBookingsResponse;
import mua.models.responses.Interval;
import mua.models.responses.ScheduleBookingResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public abstract class Controller {

    public abstract List<GetBookingsResponse> getBookings();

    public abstract ScheduleBookingResponse scheduleBooking(ScheduleBookingRequest scheduleBookingRequest);

//    public abstract List<Interval> getDailyBookedTimes(String date);

//    public abstract List<Interval> getDailyAvailableTimes(String date);


}
