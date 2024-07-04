package org.scaler.bookmyshow.model;

import jakarta.persistence.Entity;
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
public class User extends BaseModel {
    private String name;
    private String email;
    private List<Ticket> tickets;
}
