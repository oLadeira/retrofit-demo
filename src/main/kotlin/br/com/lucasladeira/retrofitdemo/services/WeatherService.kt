package br.com.lucasladeira.retrofitdemo.services

import br.com.lucasladeira.retrofitdemo.config.RetrofitConfig
import br.com.lucasladeira.retrofitdemo.entities.Weather
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class WeatherService(
    private val retrofitConfig: RetrofitConfig
    ) {

    private val BASE_URL = "https://api.hgbrasil.com/weather/"
    private val logger = LoggerFactory.getLogger(WeatherService::class.java)

    fun getSaoPauloTemp(): Weather?{
        logger.info("Recuperando temperatura de São Paulo!")
        var apiService = retrofitConfig
            .retrofitBuilder(BASE_URL)
            .create(HgAPIService::class.java)

        var call = apiService.getSaoPauloTemp()
        return call.execute().body()
    }
}