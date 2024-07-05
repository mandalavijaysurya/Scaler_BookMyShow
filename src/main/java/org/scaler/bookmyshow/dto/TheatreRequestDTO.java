package org.scaler.bookmyshow.dto;

import lombok.Getter;
import lombok.Setter;
import org.scaler.bookmyshow.repository.TheatreRepository;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
@Getter
@Setter
public class TheatreRequestDTO {
    private String name;
    private String address;
    private long cityId;
}
