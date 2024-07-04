package org.scaler.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import org.scaler.bookmyshow.model.constants.SeatStatus;
import org.scaler.bookmyshow.model.constants.SeatType;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private int row;
    private int column;
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
}
