package mua.repo;

import mua.model.BridalBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BridalRepo extends JpaRepository<BridalBooking, UUID> {
}
