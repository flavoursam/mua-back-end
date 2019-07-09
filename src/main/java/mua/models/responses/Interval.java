package mua.models.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@NoArgsConstructor
@Getter
@Setter
public class Interval {

    private LocalTime start;
    private LocalTime end;
    private boolean available = false;

    public Interval(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    public void isAvailable(boolean available) {
        this.available = available;
    }
}
