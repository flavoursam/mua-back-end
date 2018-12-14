package mua.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "booking")
@Setter
@Getter
public class Booking {

    @Id
    private String bookingId;

    private long bookingDate;

    private String start;

    private String finish;

    private String email;

    public Booking(){
        this.bookingId = UUID.randomUUID().toString();
    }

}
