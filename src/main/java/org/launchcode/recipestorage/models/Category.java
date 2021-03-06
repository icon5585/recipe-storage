package org.launchcode.recipestorage.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category extends AbstractEntity{

    @ManyToMany(mappedBy = "categories")
    private List<Recipe> recipes = new ArrayList<>();

    public Category () {}

}
