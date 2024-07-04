package org.scaler.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.servlet.ModelAndView;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
@Getter
@Setter
@Entity
public class Show extends BaseModel {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Auditorium  auditorium;
    @OneToMany
    private List<ShowSeat> showSeats;

}
