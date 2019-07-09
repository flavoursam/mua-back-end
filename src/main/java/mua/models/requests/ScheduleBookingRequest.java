package mua.models.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
public class ScheduleBookingRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String mobile;

    private String bookingDate;
    private LocalTime start;
    private LocalTime end;

}
