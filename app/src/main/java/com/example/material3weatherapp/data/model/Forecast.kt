package com.example.material3weatherapp.data.model

import com.google.gson.annotations.SerializedName

data class Forecast(
    @SerializedName("forecastday") val forecastDay: List<Forecastday?>? = listOf()
) {
    data class Forecastday(
        @SerializedName("astro") val astro: Astro? = Astro(),
        @SerializedName("date") val date: String? = "",
        @SerializedName("date_epoch") val dateEpoch: Int? = 0,
        @SerializedName("day") val day: Day? = Day(),
        @SerializedName("hour") val hour: List<Hour?>? = listOf()
    ) {
        data class Astro(
            @SerializedName("is_moon_up") val isMoonUp: Int? = 0,
            @SerializedName("is_sun_up") val isSunUp: Int? = 0,
            @SerializedName("moon_illumination") val moonIllumination: String? = "",
            @SerializedName("moon_phase") val moonPhase: String? = "",
            @SerializedName("moonrise") val moonrise: String? = "",
            @SerializedName("moonset") val moonset: String? = "",
            @SerializedName("sunrise") val sunrise: String? = "",
            @SerializedName("sunset") val sunset: String? = ""
        )

        data class Day(
            @SerializedName("avghumidity") val avgHumidity: Double? = 0.0,
            @SerializedName("avgtemp_c") val avgTempC: Double? = 0.0,
            @SerializedName("avgtemp_f") val avgTempF: Double? = 0.0,
            @SerializedName("avgvis_km") val avgVisKm: Double? = 0.0,
            @SerializedName("avgvis_miles") val avgVisMiles: Double? = 0.0, val condition: Condition? = Condition(),
            @SerializedName("daily_chance_of_rain") val dailyChanceOfRain: Int? = 0,
            @SerializedName("daily_chance_of_snow") val dailyChanceOfSnow: Int? = 0,
            @SerializedName("daily_will_it_rain") val dailyWillItRain: Int? = 0,
            @SerializedName("daily_will_it_snow") val dailyWillItSnow: Int? = 0,
            @SerializedName("maxtemp_c") val maxTempC: Double? = 0.0,
            @SerializedName("maxtemp_f") val maxTempF: Double? = 0.0,
            @SerializedName("maxwind_kph") val maxWindKph: Double? = 0.0,
            @SerializedName("maxwind_mph") val maxWindMph: Double? = 0.0,
            @SerializedName("mintemp_c") val minTempC: Double? = 0.0,
            @SerializedName("mintemp_f") val minTempF: Double? = 0.0,
            @SerializedName("totalprecip_in") val totalPrecipIn: Double? = 0.0,
            @SerializedName("totalprecip_mm") val totalPrecipMm: Double? = 0.0,
            @SerializedName("totalsnow_cm") val totalSnowCm: Double? = 0.0, val uv: Double? = 0.0
        ) {
            data class Condition(
                @SerializedName("code") val code: Int? = 0,
                @SerializedName("icon") val icon: String? = "",
                @SerializedName("text") val text: String? = ""
            )
        }

        data class Hour(
            @SerializedName("chance_of_rain") val chanceOfRain: Int? = 0,
            @SerializedName("chance_of_snow") val chanceOfSnow: Int? = 0,
            @SerializedName("cloud") val cloud: Int? = 0,
            @SerializedName("condition") val condition: Condition? = Condition(),
            @SerializedName("dewpoint_c") val dewpointC: Double? = 0.0,
            @SerializedName("dewpoint_f") val dewpointF: Double? = 0.0,
            @SerializedName("feelslike_c") val feelsLikeC: Double? = 0.0,
            @SerializedName("feelslike_f") val feelsLikeF: Double? = 0.0,
            @SerializedName("gust_kph") val gustKph: Double? = 0.0,
            @SerializedName("gust_mph") val gustMph: Double? = 0.0,
            @SerializedName("heatindex_c") val heatIndexC: Double? = 0.0,
            @SerializedName("heatindex_f") val heatIndexF: Double? = 0.0,
            @SerializedName("humidity") val humidity: Int? = 0,
            @SerializedName("is_day") val isDay: Int? = 0,
            @SerializedName("precip_in") val precipIn: Double? = 0.0,
            @SerializedName("precip_mm") val precipMm: Double? = 0.0,
            @SerializedName("pressure_in") val pressureIn: Double? = 0.0,
            @SerializedName("pressure_mb") val pressureMb: Double? = 0.0,
            @SerializedName("temp_c") val tempC: Double? = 0.0,
            @SerializedName("temp_f") val tempF: Double? = 0.0,
            @SerializedName("time") val time: String? = "",
            @SerializedName("time_epoch") val timeEpoch: Int? = 0,
            @SerializedName("uv") val uv: Double? = 0.0,
            @SerializedName("vis_km") val visKm: Double? = 0.0,
            @SerializedName("vis_miles") val visMiles: Double? = 0.0,
            @SerializedName("will_it_rain") val willItRain: Int? = 0,
            @SerializedName("will_it_snow") val willItSnow: Int? = 0,
            @SerializedName("wind_degree") val windDegree: Int? = 0,
            @SerializedName("wind_dir") val windDir: String? = "",
            @SerializedName("wind_kph") val windKph: Double? = 0.0,
            @SerializedName("wind_mph") val windMph: Double? = 0.0,
            @SerializedName("windchill_c") val windChillC: Double? = 0.0,
            @SerializedName("windchill_f") val windChillF: Double? = 0.0
        ) {
            data class Condition(
                @SerializedName("code") val code: Int? = 0,
                @SerializedName("icon") val icon: String? = "",
                @SerializedName("text") val text: String? = ""
            )
        }
    }
}