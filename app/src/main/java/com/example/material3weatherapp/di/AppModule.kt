package com.example.material3weatherapp.di

import android.content.Context
import androidx.room.Room
import com.example.material3weatherapp.data.api.WeatherApi
import com.example.material3weatherapp.data.room.WeatherDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(WeatherApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun provideWeatherApi(retrofit: Retrofit): WeatherApi =
        retrofit.create(WeatherApi::class.java)

    @Provides
    @Singleton
    fun provideWeatherDatabase(@ApplicationContext context: Context) : WeatherDatabase =
        Room.databaseBuilder(context,WeatherDatabase::class.java,"weather_database")
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    @Singleton
    fun provideWeatherDao(database: WeatherDatabase) =
        database.weatherDao()
}