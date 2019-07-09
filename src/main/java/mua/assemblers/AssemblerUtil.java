package mua.assemblers;

import mua.models.responses.Interval;
import mua.models.Booking;
import mua.models.requests.ScheduleBookingRequest;
import mua.models.responses.GetBookingsResponse;
import mua.models.responses.ScheduleBookingResponse;
import mua.utilities.Utilities;
import org.modelmapper.ModelMapper;


import java.util.ArrayList;
import java.util.List;

public class AssemblerUtil {

    private static ModelMapper modelMapper = new ModelMapper();

    public static GetBookingsResponse convertToGetBookingsResponse(Booking booking) {
        GetBookingsResponse getBookingsResponse = modelMapper.map(booking, GetBookingsResponse.class);

        List<Interval> intervals = new ArrayList<>();   // ??
        intervals.add(new Interval(booking.getStart(), booking.getEnd()));
        getBookingsResponse.setBookedTimes(intervals);

        return getBookingsResponse;
    }

    public static Booking convertToBooking(ScheduleBookingRequest scheduleBookingRequest) {
        Booking booking = modelMapper.map(scheduleBookingRequest, Booking.class);

        booking.setFirstName(scheduleBookingRequest.getFirstName());
        booking.setLastName(scheduleBookingRequest.getLastName());
        booking.setEmail(scheduleBookingRequest.getEmail());
        booking.setMobile(scheduleBookingRequest.getMobile());
        booking.setBookingDate(scheduleBookingRequest.getBookingDate());
        booking.setStart(scheduleBookingRequest.getStart());
        booking.setEnd(scheduleBookingRequest.getEnd());

        return booking;
    }

    public static ScheduleBookingResponse convertToScheduleBookingResponse(Booking booking) {
        ScheduleBookingResponse scheduleBookingResponse = modelMapper.map(booking, ScheduleBookingResponse.class);

        scheduleBookingResponse.setBookingId(booking.getBookingId());
        scheduleBookingResponse.setResult("Success!!!");    // TODO
        scheduleBookingResponse.setFirstName(booking.getFirstName());
        scheduleBookingResponse.setLastName(booking.getLastName());
        scheduleBookingResponse.setEmail(booking.getEmail());
        scheduleBookingResponse.setMobile(booking.getMobile());
        scheduleBookingResponse.setBookingDate(booking.getBookingDate());
        scheduleBookingResponse.setStart(booking.getStart());
        scheduleBookingResponse.setEnd(booking.getEnd());

        return scheduleBookingResponse;
    }

    public static Interval convertToTimeSlot(Booking booking, String date) {
        Interval interval = modelMapper.map(booking, Interval.class);

        if (booking.getBookingDate().equals(date)) {
            interval.setStart(booking.getStart());
            interval.setEnd(booking.getEnd());

            return interval;
        }

        return null;
    }

    public static List<Interval> convertToAvailableTimes(List<Interval> dailyBookedTimes, String date) {
        return Utilities.checkAvailableTimeSlots(dailyBookedTimes);
    }


}
