package com.example.material3weatherapp.data.repo

import com.example.material3weatherapp.data.api.WeatherApi
import javax.inject.Inject

class WeatherRepository @Inject constructor(
    private val weatherApi: WeatherApi
) {

}