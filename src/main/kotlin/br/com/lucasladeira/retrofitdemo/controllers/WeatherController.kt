package br.com.lucasladeira.retrofitdemo.controllers

import br.com.lucasladeira.retrofitdemo.entities.Weather
import br.com.lucasladeira.retrofitdemo.services.WeatherService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/weather")
class WeatherController {

    @Autowired
    private lateinit var weatherService: WeatherService


    @GetMapping("/{woeid}")
    fun getSaoPauloTemp(): Weather?{
        return weatherService.getSaoPauloTemp()
    }

}