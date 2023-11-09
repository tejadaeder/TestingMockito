package com.mockitospring.javatesting.controllers;


import com.mockitospring.javatesting.models.Weather;
import com.mockitospring.javatesting.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService service;

    @GetMapping("/api/weather")
    public Weather getWeather(){
        return service.getWeather();
    }

}
