package org.scaler.bookmyshow.service;

import org.scaler.bookmyshow.model.City;
import org.scaler.bookmyshow.model.Theatre;
import org.scaler.bookmyshow.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
@Service
public class TheatreService {
    private final TheatreRepository theatreRepository;
    private final CityService cityService;

    @Autowired
    public TheatreService(TheatreRepository theatreRepository, CityService cityService) {
        this.theatreRepository = theatreRepository;
        this.cityService = cityService;
    }
    public Theatre saveTheatre(String name, String address, long cityId){
        Theatre savedTheatre = new Theatre();
        savedTheatre.setName(name);
        savedTheatre.setAddress(address);
        City city = cityService.getCityById(cityId);
        List<Theatre> theatres = city.getTheatres();
        theatres.add(savedTheatre);
        city.setTheatres(theatres);
        cityService.saveCity(city);
        return theatreRepository.save(savedTheatre);

    }
}
