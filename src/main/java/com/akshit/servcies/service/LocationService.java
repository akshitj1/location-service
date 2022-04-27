package com.akshit.servcies.service;

import com.akshit.servcies.entities.City;
import com.akshit.servcies.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    CityRepository cityRepository;

    @Cacheable(value = "city-cache")
    public Optional<City> getCityInfo(String city) {
        return cityRepository.findByCity(city);
    }

}
