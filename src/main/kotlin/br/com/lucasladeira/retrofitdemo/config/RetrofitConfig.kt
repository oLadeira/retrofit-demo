package br.com.lucasladeira.retrofitdemo.config

import org.springframework.context.annotation.Configuration
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Configuration
class RetrofitConfig {

    fun retrofitBuilder(path: String): Retrofit{
        return Retrofit.Builder()
            .baseUrl(path)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}