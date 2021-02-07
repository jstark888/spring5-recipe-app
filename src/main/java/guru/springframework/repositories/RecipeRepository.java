package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jeff Stark on 2/7/2021
 */

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
