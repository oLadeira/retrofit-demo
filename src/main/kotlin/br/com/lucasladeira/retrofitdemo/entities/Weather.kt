package br.com.lucasladeira.retrofitdemo.entities

import com.google.gson.annotations.SerializedName

data class Weather(
    //estado, temperatura, previsao minima, previsao maxima
    @SerializedName("results")
    var resultado: Result
)