package org.scaler.bookmyshow.controller;

import org.scaler.bookmyshow.dto.TheatreRequestDTO;
import org.scaler.bookmyshow.model.Theatre;
import org.scaler.bookmyshow.service.TheatreService;
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
public class TheatreController {
    @Autowired
    private TheatreService theatreService;

    @PostMapping("/theatre")
    public ResponseEntity<?> addTheatre(@RequestBody TheatreRequestDTO theatreRequestDTO){
        Theatre theatre = theatreService.saveTheatre(theatreRequestDTO.getName(), theatreRequestDTO.getAddress(), theatreRequestDTO.getCityId());
        return ResponseEntity.ok(theatre);
    }
}
