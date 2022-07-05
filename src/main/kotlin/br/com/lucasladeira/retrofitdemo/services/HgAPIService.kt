package br.com.lucasladeira.retrofitdemo.services

import br.com.lucasladeira.retrofitdemo.entities.Weather
import retrofit2.Call
import retrofit2.http.GET

interface HgAPIService {

    @GET("?woeid=455827") //parametro da URL
    fun getSaoPauloTemp(): Call<Weather>
}