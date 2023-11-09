package com.mockitospring.javatesting.services;

import com.mockitospring.javatesting.models.Weather;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public Weather getWeather(){
        Weather weather = new Weather();
        weather.setMaxTemp(10);
        weather.setMinTemp(9);
        weather.setStatus("cloudy");
        return weather;
    }
}
