package org.scaler.bookmyshow.model;

import jakarta.persistence.Column;
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
    @Column(name = "SEAT_ROW")
    private int row;
    @Column(name = "SEAT_COL")
    private int column;
    @Column(name = "SEAT_NUMBER")
    private String seatNumber;
    @Column(name = "SEAT_TYPE")
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    @Column(name = "SEAT_STATUS")
    private SeatStatus seatStatus;
}
