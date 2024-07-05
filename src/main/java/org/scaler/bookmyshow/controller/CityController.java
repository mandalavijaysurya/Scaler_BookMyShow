package org.scaler.bookmyshow.controller;

import org.scaler.bookmyshow.dto.CityRequestDTO;
import org.scaler.bookmyshow.model.City;
import org.scaler.bookmyshow.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.channels.ScatteringByteChannel;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("/city")
    public ResponseEntity<?> addCity( @RequestBody CityRequestDTO city){
        try{
            String cityName = city.getCityName();
            if(cityName == null || cityName.isEmpty() || cityName.isBlank()){
                throw new Exception("City name is invalid");
            }
            City savedCity = cityService.saveCity(cityName);
            return ResponseEntity.ok(savedCity);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    @DeleteMapping("/city/{id}")
    public ResponseEntity<?> deleteCity(@PathVariable("id") Long id){
        return ResponseEntity.ok(cityService.deleteCityById(id));
    }
    @GetMapping("/city/{name}")
    public ResponseEntity<?> getCityByName(@PathVariable("name") String name){
        return ResponseEntity.ok(cityService.getCityByName(name));
    }
    @GetMapping("/city/{id}")
    public ResponseEntity<?> getCityById(@PathVariable("id") Long id){
        return ResponseEntity.ok(cityService.getCityById(id));
    }
}
