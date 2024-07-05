package org.scaler.bookmyshow.repository;

import org.scaler.bookmyshow.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    City findByName(String name);
}
