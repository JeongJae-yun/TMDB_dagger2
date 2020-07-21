package com.example.tmdb_dagger2.view.Search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tmdb_dagger2.model.DetailInfo
import com.example.tmdb_dagger2.model.SearchInfo
import com.example.tmdb_dagger2.model.SimilarInfo
import com.example.tmdb_dagger2.repository.RetrofitRepository


class SearchViewModel(private val retrofitRepository: RetrofitRepository) :ViewModel(){

    var postSearchInfoLiveData : LiveData<SearchInfo> = MutableLiveData()

    fun fetchSearchInfoFromRepository(query : String){
        postSearchInfoLiveData = retrofitRepository.fetchSearchInfoList(query)
    }
}