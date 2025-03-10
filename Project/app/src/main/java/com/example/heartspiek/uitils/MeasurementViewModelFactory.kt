package com.example.heartspiek.uitils

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MeasurementViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
    override fun <VM : ViewModel> create(modelClass: Class<VM>): VM {
        if (modelClass.isAssignableFrom(MeasurementViewModel::class.java)) {
            return MeasurementViewModel(application) as VM
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}