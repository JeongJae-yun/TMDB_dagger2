package com.example.tmdb_dagger2.di

import com.example.tmdb_dagger2.repository.RetrofitRepository
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
class APIModule constructor(private val baseURL:String) {

    @Singleton
    @Provides
    fun provideOKHttpClient(): OkHttpClient {
        return  OkHttpClient.Builder()
            .readTimeout(1200, TimeUnit.SECONDS)
            .connectTimeout(1200, TimeUnit.SECONDS)
            .build()
    }

    @Singleton
    @Provides
    fun provideGSON(): GsonConverterFactory {
        return  GsonConverterFactory.create()
    }

    @Singleton
    @Provides
    fun provideRetrofit(gsonConverterFactory: GsonConverterFactory, okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(gsonConverterFactory)
            .client(okHttpClient)
            .build()
    }

    @Provides
    fun provideRetroRepository(): RetrofitRepository {
        return RetrofitRepository()
    }

}