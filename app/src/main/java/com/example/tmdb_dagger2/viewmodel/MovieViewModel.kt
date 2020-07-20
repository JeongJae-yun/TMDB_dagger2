package com.example.tmdb_dagger2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tmdb_dagger2.model.MovieInfo
import com.example.tmdb_dagger2.repository.RetrofitRepository

class MovieViewModel(retrofitRepository: RetrofitRepository): ViewModel() {

    var retrofitRepository:RetrofitRepository = retrofitRepository

    var postInfoLiveData: LiveData<MovieInfo> = MutableLiveData()

    init {
        fetchPostInfoFromRepository()
    }

    private fun fetchPostInfoFromRepository(){
        postInfoLiveData =  retrofitRepository.fetchPostInfoList()
    }


}