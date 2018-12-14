package mua.jpa;

import mua.models.Bridal;
import org.springframework.data.repository.CrudRepository;


public interface BridalRepository extends CrudRepository<Bridal, Integer> {

    // List<Bridal> findByFirstName(String firstName);

}
