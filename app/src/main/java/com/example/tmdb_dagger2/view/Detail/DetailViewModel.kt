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
package com.example.tmdb_dagger2.view.Detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tmdb_dagger2.model.DetailInfo
import com.example.tmdb_dagger2.model.MovieInfo
import com.example.tmdb_dagger2.model.SimilarInfo
import com.example.tmdb_dagger2.repository.RetrofitRepository

class DetailViewModel(var retrofitRepository: RetrofitRepository): ViewModel() {

    var postDetailInfoLiveData : LiveData<DetailInfo> = MutableLiveData()
    var postSimilarInfoLiveData : LiveData<SimilarInfo> = MutableLiveData()

    fun fetchDetailInfoFromRepository(id : Int){
        postDetailInfoLiveData = retrofitRepository.fetchDetailInfoList(id)
    }

    fun fetchSimilarInfoFromRepository(id : Int){
        postSimilarInfoLiveData = retrofitRepository.fetchSimilarInfoList(id)
    }

}