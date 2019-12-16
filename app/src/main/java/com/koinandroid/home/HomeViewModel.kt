package com.koinandroid.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class HomeViewModel(private val homeRepo: HomeRepo) : ViewModel() {

    fun fetchPopularMovies() {

        viewModelScope.launch {
            val response = homeRepo.getPopularMovies()
           // Log.i("KOIN ANDROID", response.toString())
            if (response.isSuccessful) {
                //TODO: fill this
            }
        }
    }
}
