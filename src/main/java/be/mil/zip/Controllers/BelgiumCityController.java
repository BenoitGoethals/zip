package be.mil.zip.Controllers;

import be.mil.zip.repositories.City;
import be.mil.zip.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/api")
public class BelgiumCityController {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping("/all")
    public List<City> getAllCitys(){
        return cityRepository.findAll();
    }

    @GetMapping("/city/{city}")
    public List<City> gelCity(@PathVariable String city){
        return cityRepository.getCityByCity(city);
    }

    @GetMapping("/{zip}")
    public  List<City> getCity(@PathVariable String zip){
        return cityRepository.getCitiesByZipCode(zip);
    }
    @GetMapping("/start/{name}")
    public  List<City>  getCitys(@PathVariable String name){
        return cityRepository.getCitiesByCityStartingWith(name);
    }

}
