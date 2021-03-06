package org.launchcode.recipestorage.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Recipe extends AbstractEntity{

    @Size(max = 250, message = "Description must be less than 250 characters.")
    private String description;

    @ManyToMany
    @NotNull(message = "Select at least one category.")
    private List<Category> categories;

    @OneToMany(mappedBy = "recipe")
    private List<Ingredient> ingredients = new ArrayList<>();

    @OneToMany(mappedBy = "recipe")
    private List<Directions> directions = new ArrayList<>();

    public Recipe() {}

    public Recipe(String description, String directions) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Directions> getDirections() {
        return directions;
    }

    public void setDirections(List<Directions> directions) {
        this.directions = directions;
    }
}
