package com.example.tmdb_dagger2

import dagger.Module
import dagger.Provides

@Module
class AppModule constructor(private var myRetroApplication: MyRetroApplication){

    @Provides
    fun provideMyRetroApplication():MyRetroApplication{
        return myRetroApplication
    }
}