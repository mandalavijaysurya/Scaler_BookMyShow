package org.scaler.bookmyshow.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
@Getter
@Setter
public class BookTicketRequestDTO {
    private List<Integer> showSeatIds;
    private Integer userId;
}
