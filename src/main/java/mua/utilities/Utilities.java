package mua.utilities;

import mua.models.Timeslot;
import mua.models.responses.Interval;

import java.time.LocalTime;
import java.util.*;


public class Utilities {

    public static List<Interval> checkAvailableTimeSlots(List<Interval> dailyBookedTimes) {
        Stack<Interval> stack = createAllTimeSlots();
        List<Interval> result = new ArrayList<>();


        return null;
    }


    public static Stack<Interval> createAllTimeSlots() {
        Timeslot t = new Timeslot();

        return t.getTimeslots();
    }


    public static boolean overlap(LocalTime bookedStart, LocalTime bookedFinish, LocalTime availStart, LocalTime availFinish) {
        if ((!bookedStart.isAfter(availStart)) && (availStart.isBefore(bookedFinish))) {
            return true;
        }
        if ((bookedStart.isBefore(availFinish)) && (!availFinish.isAfter(bookedFinish))) {
            return true;
        }
        if ((availStart.isBefore(bookedStart)) && (bookedFinish.isBefore(availFinish))) {
            return true;
        }
        return false;
    }



}
