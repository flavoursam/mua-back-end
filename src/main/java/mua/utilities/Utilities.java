package mua.utilities;

import mua.models.Booking;
import mua.models.requests.ScheduleBookingRequest;
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

    public static Booking scheduleBookingHelper(ScheduleBookingRequest request, float start, float finish, int year, String month, int day) {
        Booking booking = new Booking();
        // convert start/finish to string
        // map month string to int
        // convert bookingDate to long
        booking.setStart(Float.toString(start));
        booking.setFinish(Float.toString(finish));

        // month and day formatters
        String m = Utilities.monthMapper(month);
        String d = Utilities.dayPadder(day);

        String date = "" + year + m + d;
        booking.setBookingDate(Long.parseLong(date));

        // set booking properties from request properties
        booking.setFirstName(request.getFirstName());
        booking.setLastName(request.getLastName());
        booking.setEmail(request.getEmail());
        booking.setMobile(request.getMobile());

        return booking;
    }

    public static String dayPadder(int day) {
        if (day < 10) {
            return "0" + day;
        }
        return Integer.toString(day);
    }

    public static String monthMapper(String month) {
        String result;
        switch (month) {
            case "jan":
                result = "01";
                break;
            case "feb":
                result = "02";
                break;
            case "march":
                result = "03";
                break;
            case "april":
                result = "04";
                break;
            case "may":
                result = "05";
                break;
            case "june":
                result = "06";
                break;
            case "july":
                result = "07";
                break;
            case "aug":
                result = "08";
                break;
            case "sep":
                result = "09";
                break;
            case "oct":
                result = "10";
                break;
            case "nov":
                result = "11";
                break;
            case "dec":
                result = "12";
                break;
            default:
                result = "Default case.";
                break;
        }
        return result;
    }
}
