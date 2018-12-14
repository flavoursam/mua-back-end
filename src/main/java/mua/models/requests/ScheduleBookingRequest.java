package mua.models.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ScheduleBookingRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String mobile;

}
