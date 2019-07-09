package mua.dto.booking;

import mua.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookingRepository extends JpaRepository<Booking, String> {

}
