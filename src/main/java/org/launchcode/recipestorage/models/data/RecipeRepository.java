package org.launchcode.recipestorage.models.data;

import org.launchcode.recipestorage.models.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
    Recipe findByName(String name);

}
