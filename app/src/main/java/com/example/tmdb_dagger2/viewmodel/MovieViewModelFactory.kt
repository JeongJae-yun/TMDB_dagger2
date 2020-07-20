package com.example.tmdb_dagger2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.tmdb_dagger2.MyRetroApplication
import com.example.tmdb_dagger2.di.APIComponent
import com.example.tmdb_dagger2.di.APIModule
import com.example.tmdb_dagger2.di.DaggerAPIComponent
import com.example.tmdb_dagger2.repository.APIURL
import com.example.tmdb_dagger2.repository.RetrofitRepository
import javax.inject.Inject

class MovieViewModelFactory : ViewModelProvider.Factory {

    lateinit var apiComponent: APIComponent
    @Inject
    lateinit var retrofitRepository: RetrofitRepository

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        //   initDaggerComponent()
        val apiComponent :APIComponent =  MyRetroApplication.apiComponent

        apiComponent.inject(this)
        if (modelClass.isAssignableFrom(MovieViewModel::class.java)) {
            return MovieViewModel(retrofitRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

    fun initDaggerComponent(){
        apiComponent =   DaggerAPIComponent
            .builder()
            .aPIModule(APIModule(APIURL.BASE_URL))
            .build()
        apiComponent.inject(this)
    }
}