package com.example.material3weatherapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "weathers")
data class Weather(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @SerializedName("current")
    val current: Current? = Current(),
    @SerializedName("forecast")
    val forecast: Forecast? = Forecast(),
    @SerializedName("location")
    val location: Location? = Location()
)

