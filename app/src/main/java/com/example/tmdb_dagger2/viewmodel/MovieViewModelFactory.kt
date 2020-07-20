/*
 * Designed and developed by 2020 jaeyun (JeongJae-yun)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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