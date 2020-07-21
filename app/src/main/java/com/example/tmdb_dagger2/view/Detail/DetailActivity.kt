package com.example.tmdb_dagger2.view.Detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tmdb_dagger2.R
import com.example.tmdb_dagger2.databinding.ActivityDetailBinding
import com.example.tmdb_dagger2.model.DetailInfo
import com.example.tmdb_dagger2.model.SimilarInfo
import com.example.tmdb_dagger2.view.Home.MovieFragment
import com.example.tmdb_dagger2.view.adapter.MovieListAdapter
import com.example.tmdb_dagger2.view.adapter.SimilarListAdapter
import com.example.tmdb_dagger2.viewmodel.MovieViewModelFactory
import kotlinx.android.synthetic.main.activity_detail.view.*
import kotlinx.android.synthetic.main.fragment_movie.view.*

class DetailActivity : AppCompatActivity() {
    private var movie_id : Int = 0

    companion object{
        lateinit var detailViewModel: DetailViewModel
        lateinit var activityView : View
        lateinit var activityDetailBinding : ActivityDetailBinding
        lateinit var similarListAdapter : SimilarListAdapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        activityDetailBinding = DataBindingUtil.setContentView<ActivityDetailBinding>(this,R.layout.activity_detail)
        activityView = activityDetailBinding.root

        initAdapter()
        setAdapter()
        initViewModel()

        getInit()
        getData()
        fetchData()
    }

    private fun initViewModel(){
        val movieViewModelFactory = MovieViewModelFactory()
        detailViewModel = ViewModelProviders.of(this,movieViewModelFactory).get(DetailViewModel::class.java)
    }

    private fun getInit(){
        intent.extras?.let {
            movie_id = it.getInt("id")
        }
    }

    private fun initAdapter(){
        similarListAdapter = SimilarListAdapter(this@DetailActivity)
    }

    private fun setAdapter(){
        activityView.rv_similar.apply {
            layoutManager = GridLayoutManager(context,3).apply {
                orientation = GridLayoutManager.VERTICAL
            }
            setHasFixedSize(true)
            adapter = similarListAdapter
        }
    }

    private fun getData(){
        detailViewModel.fetchDetailInfoFromRepository(movie_id)
        detailViewModel.fetchSimilarInfoFromRepository(movie_id)
    }

    private fun fetchData(){
        detailViewModel.postDetailInfoLiveData.observe(this, Observer<DetailInfo> { data ->
            activityDetailBinding.detailInfo = data
        })

        detailViewModel.postSimilarInfoLiveData.observe(this, Observer<SimilarInfo> {it ->
            it.results.forEach {
                similarListAdapter.setAdapterList(it.id,it.poster_path,it.title)
            }
        })
    }

}