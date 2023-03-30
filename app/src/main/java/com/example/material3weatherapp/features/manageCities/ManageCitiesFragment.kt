package com.example.material3weatherapp.features.manageCities

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.material3weatherapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ManageCitiesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_manage_cities, container, false)
    }

}