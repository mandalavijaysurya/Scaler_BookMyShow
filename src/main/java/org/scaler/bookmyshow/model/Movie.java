package org.scaler.bookmyshow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.scaler.bookmyshow.model.constants.MovieFeature;

import java.util.List;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String name;
    private String description;
    @ManyToMany
    private List<Actor> actors;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> movieFeatures;
}
