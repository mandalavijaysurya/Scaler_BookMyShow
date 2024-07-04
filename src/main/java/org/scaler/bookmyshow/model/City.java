package org.scaler.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */

@Getter
@Setter
@Entity
public class City extends BaseModel {
    private String name;
    @OneToMany
    private List<Theatre> theatres;
}
