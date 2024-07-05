package org.scaler.bookmyshow.service;

import org.scaler.bookmyshow.model.City;
import org.scaler.bookmyshow.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public City saveCity(String cityName) {
        LocalDateTime now = LocalDateTime.now();
        City city = new City();
        city.setName(cityName);
        city.setCreatedAt(now);
        city.setUpdatedAt(now);
        city.setCreatedBy("ADMIN");
        city.setUpdatedBy("ADMIN");
        return cityRepository.save(city);
    }
    public City saveCity(City city) {
        return cityRepository.save(city);
    }
    public boolean deleteCityById(long id){
        cityRepository.deleteById(id);
        return true;
    }
    public City getCityByName(String cityName){
        return cityRepository.findByName(cityName);
    }

    public City getCityById(long id){
        return cityRepository.findById(id).orElse(null);
    }
}
