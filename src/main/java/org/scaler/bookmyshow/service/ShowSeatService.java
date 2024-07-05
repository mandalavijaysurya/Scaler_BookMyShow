package org.scaler.bookmyshow.service;

import org.scaler.bookmyshow.model.ShowSeat;
import org.scaler.bookmyshow.repository.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
@Service
public class ShowSeatService {

    @Autowired
    private ShowSeatRepository showSeatRepository;

    public ShowSeat getShowSeat(long showId) {
        return showSeatRepository.findById(showId).get();
    }
    public ShowSeat saveShowSeat(ShowSeat showSeat) {
        return showSeatRepository.save(showSeat);
    }
}
