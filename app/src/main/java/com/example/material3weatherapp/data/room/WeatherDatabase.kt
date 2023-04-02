package com.example.material3weatherapp.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.material3weatherapp.data.model.Weather

@Database(entities = [Weather::class], version = 1)
@TypeConverters(TypeConverter::class)
abstract class WeatherDatabase : RoomDatabase() {

    abstract fun weatherDao(): WeatherDao
}