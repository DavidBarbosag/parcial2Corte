package com.edu.eci.ARSW.Clima.service;

import com.edu.eci.ARSW.Clima.controller.WeatherController;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WeatherService {
    private final WeatherController weatherController;

    public WeatherService (WeatherController weatherController){
        this.weatherController = weatherController;
    }

    public String generateResponse(String input) throws IOException {
        return weatherController.consult(input);
    }
}
