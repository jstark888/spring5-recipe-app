package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jeff Stark on 2/7/2021
 */

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
