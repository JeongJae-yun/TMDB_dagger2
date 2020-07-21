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

package com.example.tmdb_dagger2.di

import com.example.tmdb_dagger2.AppModule
import com.example.tmdb_dagger2.repository.RetrofitRepository
import com.example.tmdb_dagger2.view.Detail.DetailActivity
import com.example.tmdb_dagger2.view.Home.MovieFragment
import com.example.tmdb_dagger2.view.Detail.DetailViewModel
import com.example.tmdb_dagger2.view.Home.MovieViewModel
import com.example.tmdb_dagger2.view.Search.SearchActivity
import com.example.tmdb_dagger2.view.Search.SearchViewModel
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
    fun inject(detailActivity: DetailActivity)
    fun inject(detailViewModel: DetailViewModel)
    fun inject(searchActivity: SearchActivity)
    fun inject(searchViewModel: SearchViewModel)
}