package mua.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
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
    private long bookingDate;
    private String start;
    private String finish;
    private String email;
    private String mobile;

    public Booking(){
        bookingId = UUID.randomUUID().toString();
    }

}
