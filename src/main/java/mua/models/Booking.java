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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String bookingId;

    private long bookingDate;

    private String start;

    private String finish;

    private String email;

    public Booking(){
        bookingId = UUID.randomUUID().toString();
    }

}
