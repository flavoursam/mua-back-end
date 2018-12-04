package mua.repositories;

import mua.models.Bridal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface BridalRepository extends CrudRepository<Bridal, Integer> {

    List<Bridal> findByFirstName(String firstName);

}
