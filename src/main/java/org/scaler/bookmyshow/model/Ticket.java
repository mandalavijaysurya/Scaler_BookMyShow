package org.scaler.bookmyshow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.scaler.bookmyshow.model.constants.TicketStatus;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
@Entity
@Getter
@Setter
public class Ticket extends BaseModel {
    private LocalDateTime timeOfBooking;
    private double totalAmount;
    @OneToMany
    private List<ShowSeat> showSeats;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
}
