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


import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.tmdb_dagger2.MyRetroApplication
import com.example.tmdb_dagger2.di.APIComponent
import com.example.tmdb_dagger2.model.DetailInfo
import com.example.tmdb_dagger2.model.MovieInfo
import com.example.tmdb_dagger2.model.SearchInfo
import com.example.tmdb_dagger2.model.SimilarInfo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

class RetrofitRepository {
    var postInfoMutableList: MutableLiveData<MovieInfo> = MutableLiveData()
    var postUpComingMutableList : MutableLiveData<MovieInfo> = MutableLiveData()
    var postPopularMutableList : MutableLiveData<MovieInfo> = MutableLiveData()
    var postTopRatedMutableList : MutableLiveData<MovieInfo> = MutableLiveData()

    var postDetailMutableList : MutableLiveData<DetailInfo> = MutableLiveData()

    var postSimilarMutableList : MutableLiveData<SimilarInfo> = MutableLiveData()

    var postSearchMutableList : MutableLiveData<SearchInfo> = MutableLiveData()


    @Inject
    lateinit var retrofit: Retrofit

    init {
        val apiComponent : APIComponent =  MyRetroApplication.apiComponent
        apiComponent.inject(this)
    }


    fun fetchNowPlayInfoList(): LiveData<MovieInfo> {
        val apiService:APIService = retrofit.create(APIService::class.java)
        val postListInfo : Call<MovieInfo> =  apiService.getNowMovie(apikey,"ko-KR",1)

        postListInfo.enqueue(object :Callback<MovieInfo>{
            override fun onFailure(call: Call<MovieInfo>, t: Throwable) {
                Log.d("RetroRepository","Failed:::"+t.message)
            }
            override fun onResponse(call: Call<MovieInfo>, response: Response<MovieInfo>) {
                val postInfoList = response.body()
                postInfoMutableList.value = postInfoList
            }
        })
        return  postInfoMutableList
    }

    fun fetchUpComingInfoList(): LiveData<MovieInfo> {
        val apiService:APIService = retrofit.create(APIService::class.java)
        val postListInfo : Call<MovieInfo> =  apiService.getUpComingMovie(apikey,"ko-KR",1)

        postListInfo.enqueue(object :Callback<MovieInfo>{
            override fun onFailure(call: Call<MovieInfo>, t: Throwable) {
                Log.d("RetroRepository","Failed:::"+t.message)
            }
            override fun onResponse(call: Call<MovieInfo>, response: Response<MovieInfo>) {
                val postInfoList = response.body()
                postUpComingMutableList.value = postInfoList
            }
        })
        return  postUpComingMutableList
    }

    fun fetchPopularInfoList(): LiveData<MovieInfo> {
        val apiService:APIService = retrofit.create(APIService::class.java)
        val postListInfo : Call<MovieInfo> =  apiService.getPopularMovie(apikey,"ko-KR",1,"kr")

        postListInfo.enqueue(object :Callback<MovieInfo>{
            override fun onFailure(call: Call<MovieInfo>, t: Throwable) {
                Log.d("RetroRepository","Failed:::"+t.message)
            }
            override fun onResponse(call: Call<MovieInfo>, response: Response<MovieInfo>) {
                val postInfoList = response.body()
                postPopularMutableList.value = postInfoList
            }
        })
        return  postPopularMutableList
    }

    fun fetchTopRatedInfoList(): LiveData<MovieInfo> {
        val apiService:APIService = retrofit.create(APIService::class.java)
        val postListInfo : Call<MovieInfo> =  apiService.getTopRatedMovie(apikey,"ko-KR",1,"kr")

        postListInfo.enqueue(object :Callback<MovieInfo>{
            override fun onFailure(call: Call<MovieInfo>, t: Throwable) {
                Log.d("RetroRepository","Failed:::"+t.message)
            }
            override fun onResponse(call: Call<MovieInfo>, response: Response<MovieInfo>) {
                val postInfoList = response.body()
                postTopRatedMutableList.value = postInfoList
            }
        })
        return  postTopRatedMutableList
    }

    fun fetchDetailInfoList(id : Int) : LiveData<DetailInfo>{
        val apiService:APIService = retrofit.create(APIService::class.java)
        val postDetailInfo : Call<DetailInfo> = apiService.getDetail(id, apikey,"ko-KR")

        postDetailInfo.enqueue(object : Callback<DetailInfo>{
            override fun onFailure(call: Call<DetailInfo>, t: Throwable) {
                Log.d("RetroRepository","Failed:::"+t.message)
            }
            override fun onResponse(call: Call<DetailInfo>, response: Response<DetailInfo>) {
                val postDetailList = response.body()
                postDetailMutableList.value = postDetailList
            }
        })
        return postDetailMutableList
    }

    fun fetchSimilarInfoList(id : Int) : LiveData<SimilarInfo>{
        val apiService:APIService = retrofit.create(APIService::class.java)
        val postSimilarInfo : Call<SimilarInfo> = apiService.getSimilar(id, apikey,"ko-KR",1)

        postSimilarInfo.enqueue(object : Callback<SimilarInfo>{
            override fun onFailure(call: Call<SimilarInfo>, t: Throwable) {
                Log.d("RetroRepository","Failed:::"+t.message)
            }
            override fun onResponse(call: Call<SimilarInfo>, response: Response<SimilarInfo>) {
                val postSimilarList = response.body()
                postSimilarMutableList.value = postSimilarList
            }
        })
        return postSimilarMutableList
    }

    fun fetchSearchInfoList(query : String) : LiveData<SearchInfo>{
        val apiService:APIService = retrofit.create(APIService::class.java)
        //val postSearchInfo : Call<SearchInfo> = apiService.getSearch(apikey,"ko-KR", query,1, true,"kr")
        val postSearchInfo : Call<SearchInfo> = apiService.getSearch(apikey,"ko-KR", query,1)

        postSearchInfo.enqueue(object : Callback<SearchInfo>{
            override fun onFailure(call: Call<SearchInfo>, t: Throwable) {
                Log.d("RetroRepository","Failed:::"+t.message)
            }
            override fun onResponse(call: Call<SearchInfo>, response: Response<SearchInfo>) {
                val postSearchList = response.body()
                postSearchMutableList.value = postSearchList
                postSearchList?.results?.forEach {
                    Log.d("RetroRepository", it.title)
                }
            }
        })
        return postSearchMutableList
    }


    companion object{
        private const val apikey = "dd3529cb48a78d9d2e775be63596398a"
    }

}
