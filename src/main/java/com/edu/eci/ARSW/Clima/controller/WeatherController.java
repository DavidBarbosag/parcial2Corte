package com.edu.eci.ARSW.Clima.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/weather")
@CrossOrigin(origins = "*")
public class WeatherController {

    private final WebClient webClient;
    private final ObjectMapper objectMapper;


    private String apiKey = "83ec500b1d684130b61144058252207";

    private static final String USER_AGENT = "Mozilla/5.0";
    private String GET_URL = "http://api.weatherapi.com/v1/current.json?";

    public WeatherController(WebClient.Builder webClientBuilder, ObjectMapper objectMapper) {
        this.webClient = webClientBuilder.build();
        this.objectMapper = objectMapper;
    }


    @PostMapping("/consult")
    public String consult(@RequestBody String city) throws IOException {
        GET_URL = GET_URL + "key=" + apiKey + "&q=" + city + "&aqi=no";
        URL obj = new URL(GET_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();
        } else {
            System.out.println("GET request not worked");
        }
        return "error";
    }

}
