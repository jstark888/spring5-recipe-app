package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Jeff Stark on 2/7/2021
 */

@Data
@EqualsAndHashCode(exclude = {"recipe"})
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

}
