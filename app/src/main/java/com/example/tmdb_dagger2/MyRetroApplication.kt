package com.example.tmdb_dagger2

import android.app.Application
import android.content.Context
import com.example.tmdb_dagger2.di.APIComponent
import com.example.tmdb_dagger2.di.APIModule
import com.example.tmdb_dagger2.di.DaggerAPIComponent
import com.example.tmdb_dagger2.repository.APIURL

class MyRetroApplication : Application() {
    companion object {
        var ctx: Context? = null
        lateinit var apiComponent: APIComponent
    }
    override fun onCreate() {
        super.onCreate()
        ctx = applicationContext
        apiComponent = initDaggerComponent()
    }

    fun getMyComponent(): APIComponent {
        return apiComponent
    }

    private fun initDaggerComponent():APIComponent{
        apiComponent = DaggerAPIComponent
            .builder()
            .aPIModule(APIModule(APIURL.BASE_URL))
            .build()
        return  apiComponent

    }
}