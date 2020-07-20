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
package com.example.tmdb_dagger2.repository


import com.example.tmdb_dagger2.model.MovieInfo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {

    @GET("movie/now_playing")
    fun getNowMovie(
        @Query("api_key") api_key:String,
        @Query("language") language:String,
        @Query("page") page:Int
    ): Call<MovieInfo>

    //https://api.themoviedb.org/3/movie/now_playing?api_key=dd3529cb48a78d9d2e775be63596398a&language=ko-KR&page=1
    //fun getMovieData(api_key : String, language : String, page : Int,  region:String) : Call<MovieInfo>


}