package com.akshit.servcies.controllers;

import com.akshit.servcies.entities.City;
import com.akshit.servcies.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Optional;


@RestController
public class LocationController {
    @Autowired
    LocationService locationService;

    @GetMapping(value = "/state")
    public ResponseEntity<String> getState(@PathParam("city") String city) {
        Optional<City> cityInfo = locationService.getCityInfo(city);
        if (cityInfo.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cityInfo.get().getState());
    }
}
