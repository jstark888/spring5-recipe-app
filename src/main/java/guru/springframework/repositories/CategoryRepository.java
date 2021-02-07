package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jeff Stark on 2/7/2021
 */

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
