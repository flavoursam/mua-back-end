package mua.models.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@NoArgsConstructor
@Getter
@Setter
public class ScheduleBookingResponse extends BaseResponse {

    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String bookingDate;

    private LocalTime start;
    private LocalTime end;

    private String bookingId;
    private String result;

}
