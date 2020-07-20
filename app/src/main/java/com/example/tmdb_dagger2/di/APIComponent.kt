package com.example.tmdb_dagger2.di

import com.example.tmdb_dagger2.AppModule
import com.example.tmdb_dagger2.repository.RetrofitRepository
import com.example.tmdb_dagger2.view.MovieFragment
import com.example.tmdb_dagger2.viewmodel.MovieViewModel
import com.example.tmdb_dagger2.viewmodel.MovieViewModelFactory
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class,APIModule::class])
interface APIComponent {
    fun inject(retrofitRepository: RetrofitRepository)
    fun inject(movieViewModel: MovieViewModel)
    fun inject(movieFragment: MovieFragment)
    fun inject(movieViewModelFactory: MovieViewModelFactory)
}