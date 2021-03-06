package org.launchcode.recipestorage.models.data;

import org.launchcode.recipestorage.models.Unit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends CrudRepository<Unit, Integer> {
}
