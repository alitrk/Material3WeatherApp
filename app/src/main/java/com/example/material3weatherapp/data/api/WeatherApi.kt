package com.example.material3weatherapp.data.api

import com.example.material3weatherapp.BuildConfig
import com.example.material3weatherapp.data.model.Weather
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    companion object{
        const val BASE_URL = "https://api.weatherapi.com/v1/"
        const val API_KEY = BuildConfig.WEATHER_API_KEY

    }

    @GET("forecast.json")
    suspend fun getWeatherData(
        @Query("key") apiKey: String,
        @Query("q") location: String,
        @Query("days") days: Int,
        @Query("aqi") aqi: String,
        @Query("alerts") alerts: String
    ): Weather
}