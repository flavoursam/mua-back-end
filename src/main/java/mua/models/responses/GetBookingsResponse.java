package mua.models.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class GetBookingsResponse {

    private int year;
    private int month;
    private int day;
    private List<BookedTime> bookedTimes;

}
