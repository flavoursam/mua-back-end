package mua.utilities;

import mua.models.Booking;
import mua.models.responses.BookedTime;
import mua.models.responses.GetBookingsResponse;

import java.util.ArrayList;
import java.util.List;


public class Utilities {

    // gets all bookings and maps appropriate properties to response object
    public static List<GetBookingsResponse> getBookingsHelper(List<Booking> bookings) {
        List<GetBookingsResponse> responses = new ArrayList<>();
        for (int i = 0; i < bookings.size(); i++) {
            GetBookingsResponse response = new GetBookingsResponse();
            String bookingDate = Long.toString(bookings.get(i).getBookingDate());

            int year = Integer.parseInt(bookingDate.substring(0, 4));
            int month = Integer.parseInt(bookingDate.substring(4, 6));
            int day = Integer.parseInt(bookingDate.substring(6));
            float start = Float.parseFloat(bookings.get(i).getStart());
            float finish = Float.parseFloat(bookings.get(i).getFinish());

            List<BookedTime> bookedTimes = new ArrayList<>();
            BookedTime bookedTime = new BookedTime(start, finish);
            bookedTimes.add(bookedTime);

            response.setDay(day);
            response.setMonth(month);
            response.setYear(year);
            response.setBookedTimes(bookedTimes);

            responses.add(i, response);
        }

        return responses;
    }

}
