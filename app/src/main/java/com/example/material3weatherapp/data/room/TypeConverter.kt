package com.example.material3weatherapp.data.room

import androidx.room.TypeConverter
import com.example.material3weatherapp.data.model.Current
import com.example.material3weatherapp.data.model.Forecast
import com.example.material3weatherapp.data.model.Location
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TypeConverter {
    private val gson = Gson()

    @TypeConverter
    fun fromConditionToString(condition: Current.Condition?): String? {
        return condition?.let {
            gson.toJson(it)
        }
    }

    @TypeConverter
    fun fromStringToCondition(conditionString: String?): Current.Condition? {
        return conditionString?.let {
            gson.fromJson(it, Current.Condition::class.java)
        }
    }

    @TypeConverter
    fun fromCurrentToString(current: Current?): String? {
        return current?.let {
            gson.toJson(it)
        }
    }

    @TypeConverter
    fun fromStringToCurrent(currentString: String?): Current? {
        return currentString?.let {
            gson.fromJson(it, Current::class.java)
        }
    }


    ////////////////////////////////////////////////////////////////

    // Forecast
    @TypeConverter
    fun fromForecastString(value: String): Forecast {
        val type = object : TypeToken<Forecast>() {}.type
        return gson.fromJson(value, type)
    }

    @TypeConverter
    fun toForecastString(forecast: Forecast): String {
        return gson.toJson(forecast)
    }

    // Forecastday
    @TypeConverter
    fun fromForecastdayString(value: String): Forecast.Forecastday {
        val type = object : TypeToken<Forecast.Forecastday>() {}.type
        return gson.fromJson(value, type)
    }

    @TypeConverter
    fun toForecastdayString(forecastday: Forecast.Forecastday): String {
        return gson.toJson(forecastday)
    }

    // Astro
    @TypeConverter
    fun fromAstroString(value: String): Forecast.Forecastday.Astro {
        val type = object : TypeToken<Forecast.Forecastday.Astro>() {}.type
        return gson.fromJson(value, type)
    }

    @TypeConverter
    fun toAstroString(astro: Forecast.Forecastday.Astro): String {
        return gson.toJson(astro)
    }

    // Day
    @TypeConverter
    fun fromDayString(value: String): Forecast.Forecastday.Day {
        val type = object : TypeToken<Forecast.Forecastday.Day>() {}.type
        return gson.fromJson(value, type)
    }

    @TypeConverter
    fun toDayString(day: Forecast.Forecastday.Day): String {
        return gson.toJson(day)
    }

    // Condition
    @TypeConverter
    fun fromConditionString(value: String): Forecast.Forecastday.Day.Condition {
        val type = object : TypeToken<Forecast.Forecastday.Day.Condition>() {}.type
        return gson.fromJson(value, type)
    }

    @TypeConverter
    fun toConditionString(condition: Forecast.Forecastday.Day.Condition): String {
        return gson.toJson(condition)
    }

    // Hour
    @TypeConverter
    fun fromHourString(value: String): Forecast.Forecastday.Hour {
        val type = object : TypeToken<Forecast.Forecastday.Hour>() {}.type
        return gson.fromJson(value, type)
    }

    ////////////////////////////////////////////////////////////
    @TypeConverter
    fun toHourString(hour: Forecast.Forecastday.Hour): String {
        return gson.toJson(hour)
    }

    @TypeConverter
    fun fromLocation(location: Location?): String? {
        return location?.let {
            Gson().toJson(location)
        }
    }

    @TypeConverter
    fun toLocation(json: String?): Location? {
        return json?.let {
            Gson().fromJson(json, Location::class.java)
        }
    }

}