package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by Jeff Stark on 2/7/2021
 */


public interface RecipeService {

    Set<Recipe> getRecipes();
}
