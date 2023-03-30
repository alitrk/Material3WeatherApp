package com.example.material3weatherapp.features.homeScreen

import androidx.lifecycle.ViewModel
import com.example.material3weatherapp.data.repo.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val repository: WeatherRepository
): ViewModel() {

}