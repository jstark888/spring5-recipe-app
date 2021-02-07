package guru.springframework.domain;

import javax.persistence.*;

/**
 * Created by Jeff Stark on 2/7/2021
 */

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //since Recipe owns Notes we don't set the cascade here,
    // because we don't want to delete a recipe if its notes are deleted
    @OneToOne
    private Recipe recipe;

    //tells JPA to store this String as a CLOB field in the database
    @Lob
    private String recipeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
