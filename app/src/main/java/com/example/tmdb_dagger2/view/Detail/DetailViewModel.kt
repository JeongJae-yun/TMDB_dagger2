package com.example.tmdb_dagger2.view.Detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tmdb_dagger2.model.DetailInfo
import com.example.tmdb_dagger2.model.MovieInfo
import com.example.tmdb_dagger2.model.SimilarInfo
import com.example.tmdb_dagger2.repository.RetrofitRepository

class DetailViewModel(var retrofitRepository: RetrofitRepository): ViewModel() {

    var postDetailInfoLiveData : LiveData<DetailInfo> = MutableLiveData()
    var postSimilarInfoLiveData : LiveData<SimilarInfo> = MutableLiveData()

    fun fetchDetailInfoFromRepository(id : Int){
        postDetailInfoLiveData = retrofitRepository.fetchDetailInfoList(id)
    }

    fun fetchSimilarInfoFromRepository(id : Int){
        postSimilarInfoLiveData = retrofitRepository.fetchSimilarInfoList(id)
    }

}