package mua.models.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class GetBookingsResponse {

    private String bookingDate;
    private List<Interval> bookedTimes;

}
