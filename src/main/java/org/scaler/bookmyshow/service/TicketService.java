package org.scaler.bookmyshow.service;

import org.scaler.bookmyshow.model.ShowSeat;
import org.scaler.bookmyshow.model.Ticket;
import org.scaler.bookmyshow.model.constants.ShowSeatStatus;
import org.scaler.bookmyshow.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
@Service
public class TicketService {

    private final TicketRepository ticketRepository;
    private final ShowSeatService showSeatService;

    @Autowired
    public TicketService(TicketRepository ticketRepository, ShowSeatService showSeatService) {
        this.ticketRepository = ticketRepository;
        this.showSeatService = showSeatService;
    }
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket bookTicket(List<Integer> showSeatIds, Integer userId) throws Exception {
        for(int showSeatId : showSeatIds) {
            ShowSeat seat = showSeatService.getShowSeat(showSeatId);
            if(!seat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE))
                throw new Exception("Seat is not available");
            for(Integer seatId : showSeatIds) {
                ShowSeat showSeat = showSeatService.getShowSeat(seatId);
                showSeat.setShowSeatStatus(ShowSeatStatus.LOCKED);
                showSeatService.saveShowSeat(seat);
            }
        }
        startPayment(showSeatIds);
        // write payment flow logic
        return new Ticket();
    }
    public boolean startPayment(List<Integer> showSeatIds) {
        return true;
    }
}
