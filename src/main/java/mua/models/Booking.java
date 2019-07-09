package mua.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "booking")
@Setter
@Getter
public class Booking {

    @Id
    private String bookingId;
    private String firstName;
    private String lastName;
    private String bookingDate;
    private LocalTime start;
    @Column(name="`end`")
    private LocalTime end;
    private String email;
    private String mobile;

    public Booking(){
        bookingId = UUID.randomUUID().toString();
    }

}
