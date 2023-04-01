package com.example.material3weatherapp.data.model

import com.google.gson.annotations.SerializedName

data class Weather(
    @SerializedName("current")
    val current: Current? = Current(),
    @SerializedName("forecast")
    val forecast: Forecast? = Forecast(),
    @SerializedName("location")
    val location: Location? = Location()
)

