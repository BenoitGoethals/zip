package be.mil.zip.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Long> {

    List<City> getCitiesByZipCode(String zip);
    List<City> getCityByCity(String city);
    List<City> getCitiesByCityStartingWith(String start);
}
