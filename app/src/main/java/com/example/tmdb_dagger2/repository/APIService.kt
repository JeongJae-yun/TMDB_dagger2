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