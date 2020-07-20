package com.example.tmdb_dagger2.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.tmdb_dagger2.MyRetroApplication
import com.example.tmdb_dagger2.di.APIComponent
import com.example.tmdb_dagger2.model.MovieInfo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

class RetrofitRepository {
    var postInfoMutableList: MutableLiveData<MovieInfo> = MutableLiveData()


    @Inject
    lateinit var retrofit: Retrofit

    init {
        val apiComponent : APIComponent =  MyRetroApplication.apiComponent
        apiComponent.inject(this)
    }


    fun fetchPostInfoList(): LiveData<MovieInfo> {

        val apiService:APIService = retrofit.create(APIService::class.java)
//        val postListInfo : Call<List<RepoInfo>> =  apiService.makeRequest()

        val apikey = "dd3529cb48a78d9d2e775be63596398a"
        val postListInfo : Call<MovieInfo> =  apiService.getNowMovie(apikey,"ko-KR",1)
        Log.d("RetroRepository call","apiService 부른 Repository")

        postListInfo.enqueue(object :Callback<MovieInfo>{
            override fun onFailure(call: Call<MovieInfo>, t: Throwable) {
                Log.d("RetroRepository","Failed:::"+t.message)
            }

            override fun onResponse(call: Call<MovieInfo>, response: Response<MovieInfo>) {
                val postInfoList = response.body()

                Log.d("RetroRepository call","${postInfoList?.total_pages?.toString()}")
                postInfoMutableList.value = postInfoList
                postInfoList?.run {
                    this.results.forEach {it ->
                        Log.d("RetroRepository call","${it.id}")
                    }
                }

            }
        })
        return  postInfoMutableList


    }

}
