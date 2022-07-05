package br.com.lucasladeira.retrofitdemo.entities

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("temp")
    var temperatura: Double,
    @SerializedName("city_name")
    var nomeCidade: String,
    @SerializedName("description")
    var descricao: String,
    @SerializedName("humidity")
    var humidade: String,
    @SerializedName("city")
    var estado: String
)
