package org.scaler.bookmyshow.controller;

import org.scaler.bookmyshow.dto.BookTicketRequestDTO;
import org.scaler.bookmyshow.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/ticket")
    public ResponseEntity<?> bookTicket(@RequestBody BookTicketRequestDTO bookTicketRequestDTO) throws Exception {
        return ResponseEntity.ok(ticketService.bookTicket(
                bookTicketRequestDTO.getShowSeatIds(),
                bookTicketRequestDTO.getUserId()
        ));
    }

}
