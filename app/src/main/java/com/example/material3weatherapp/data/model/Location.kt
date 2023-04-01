package com.example.material3weatherapp.data.model

import com.google.gson.annotations.SerializedName


data class Location(
    @SerializedName("country") val country: String? = "",
    @SerializedName("lat") val latitude: Double? = 0.0,
    @SerializedName("localtime") val localTime: String? = "",
    @SerializedName("localtime_epoch") val localTimeEpoch: Int? = 0,
    @SerializedName("lon") val longitude: Double? = 0.0,
    @SerializedName("name") val name: String? = "",
    @SerializedName("region") val region: String? = "",
    @SerializedName("tz_id") val timezoneId: String? = ""
)