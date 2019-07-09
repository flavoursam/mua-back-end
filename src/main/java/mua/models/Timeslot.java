package mua.models;

import lombok.Getter;
import lombok.Setter;
import mua.models.responses.Interval;

import java.time.LocalTime;
import java.util.Stack;

@Getter
@Setter
public class Timeslot {

    private Stack<Interval> timeslots = new Stack<>();

    public Timeslot() {
        timeslots.push(new Interval(LocalTime.of(18,30,00), LocalTime.of(20,30,00)));
        timeslots.push(new Interval(LocalTime.of(18,00,00), LocalTime.of(20,00,00)));
        timeslots.push(new Interval(LocalTime.of(17,30,00), LocalTime.of(19,30,00)));
        timeslots.push(new Interval(LocalTime.of(17,00,00), LocalTime.of(19,00,00)));
        timeslots.push(new Interval(LocalTime.of(16,30,00), LocalTime.of(18,30,00)));
        timeslots.push(new Interval(LocalTime.of(16,00,00), LocalTime.of(18,00,00)));
        timeslots.push(new Interval(LocalTime.of(15,30,00), LocalTime.of(17,30,00)));
        timeslots.push(new Interval(LocalTime.of(15,00,00), LocalTime.of(17,00,00)));
        timeslots.push(new Interval(LocalTime.of(14,30,00), LocalTime.of(16,30,00)));
        timeslots.push(new Interval(LocalTime.of(14,00,00), LocalTime.of(16,00,00)));
        timeslots.push(new Interval(LocalTime.of(13,30,00), LocalTime.of(15,30,00)));
        timeslots.push(new Interval(LocalTime.of(13,00,00), LocalTime.of(15,00,00)));
        timeslots.push(new Interval(LocalTime.of(12,30,00), LocalTime.of(14,30,00)));
        timeslots.push(new Interval(LocalTime.of(12,00,00), LocalTime.of(14,00,00)));
        timeslots.push(new Interval(LocalTime.of(11,30,00), LocalTime.of(13,30,00)));
        timeslots.push(new Interval(LocalTime.of(11,00,00), LocalTime.of(13,00,00)));
        timeslots.push(new Interval(LocalTime.of(10,30,00), LocalTime.of(12,30,00)));
        timeslots.push(new Interval(LocalTime.of(10,00,00), LocalTime.of(12,00,00)));
        timeslots.push(new Interval(LocalTime.of(9,30,00), LocalTime.of(11,30,00)));
        timeslots.push(new Interval(LocalTime.of(9,00,00), LocalTime.of(11,00,00)));
        timeslots.push(new Interval(LocalTime.of(8,30,00), LocalTime.of(10,30,00)));
        timeslots.push(new Interval(LocalTime.of(8,00,00), LocalTime.of(10,00,00)));
        timeslots.push(new Interval(LocalTime.of(7,30,00), LocalTime.of(9,30,00)));
        timeslots.push(new Interval(LocalTime.of(7,00,00), LocalTime.of(9,00,00)));
        timeslots.push(new Interval(LocalTime.of(6,30,00), LocalTime.of(8,30,00)));
        timeslots.push(new Interval(LocalTime.of(6,0,00), LocalTime.of(8,00,00)));

    }


}
