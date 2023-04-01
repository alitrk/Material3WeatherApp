package com.example.material3weatherapp.data.repo

import com.example.material3weatherapp.data.api.WeatherApi
import com.example.material3weatherapp.data.model.Weather

import com.example.material3weatherapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class WeatherRepository @Inject constructor(
    private val weatherApi: WeatherApi
) {

    fun getWeather(): Flow<Resource<Weather>> {
        return flow {
            emit(Resource.Loading(null))
            val weather = weatherApi.getWeatherData(WeatherApi.API_KEY,"london",7,"no","no")
            emit(Resource.Success(weather))
        }
    }


}