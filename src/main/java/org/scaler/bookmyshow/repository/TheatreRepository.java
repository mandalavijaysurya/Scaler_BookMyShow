package org.scaler.bookmyshow.repository;

import org.scaler.bookmyshow.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Long> {
}
