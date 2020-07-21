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
package com.example.tmdb_dagger2.view.Home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import com.example.tmdb_dagger2.R
import com.example.tmdb_dagger2.databinding.FragmentMovieBinding
import com.example.tmdb_dagger2.model.MovieInfo
import com.example.tmdb_dagger2.view.Detail.DetailActivity
import com.example.tmdb_dagger2.view.Search.SearchActivity
import com.example.tmdb_dagger2.view.adapter.MovieListAdapter
import com.example.tmdb_dagger2.view.adapter.PopularListAdapter
import com.example.tmdb_dagger2.view.adapter.TopRatedListAdapter
import com.example.tmdb_dagger2.view.adapter.UpcomingListAdapter
import com.example.tmdb_dagger2.viewmodel.MovieViewModelFactory
import kotlinx.android.synthetic.main.fragment_movie.view.*

class MovieFragment : Fragment() {

    companion object{
        lateinit var movieViewModel: MovieViewModel
        lateinit var fragmentView:View
        lateinit var listAdapter: MovieListAdapter
        lateinit var upcomgingAdapter : UpcomingListAdapter
        lateinit var popularAdapter: PopularListAdapter
        lateinit var topRateddapter: TopRatedListAdapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val fragmentMovieBinding : FragmentMovieBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_movie,container,false)
        fragmentView = fragmentMovieBinding.root

        initAdapter()
        setAdapter()
        loadData()

        fragmentView.cv_search.setOnClickListener {
            val intent = Intent(requireContext(), SearchActivity::class.java)
            requireContext().startActivity(intent)
        }

        return fragmentView
    }

    private fun  initViewModel(){
        val movieViewModelFactory = MovieViewModelFactory()
        movieViewModel = ViewModelProviders.of(this,movieViewModelFactory).get(MovieViewModel::class.java)
    }

    private fun loadData(){
        fetchNowPlayInfo()
        fetchUpcomingInfo()
        fetchPopularInfo()
        fetchTopRatedInfo()
    }

    private fun fetchNowPlayInfo(){
        movieViewModel.postNowPlayInfoLiveData.observe(this, Observer<MovieInfo> { t ->
            t.apply {
                t.results.forEach {it ->
                    listAdapter.setAdapterList(it.id,it.adult, it.backdrop_path, it.original_language, it.original_title,
                        it.overview, it.poster_path, it.release_date, it.title)
                }
            }
        })
    }

    private fun fetchUpcomingInfo(){
        movieViewModel.postUpComingInfoLiveData.observe(this, Observer<MovieInfo> { t ->
            t.apply {
                t.results.forEach {it->
                    upcomgingAdapter.setAdapterList(it.id,it.adult, it.backdrop_path, it.original_language, it.original_title,
                        it.overview, it.poster_path, it.release_date, it.title)
                }
            }
        })
    }

    private fun fetchPopularInfo(){
        movieViewModel.postPopularInfoLiveData.observe(this, Observer<MovieInfo> { t ->
            t.apply {
                t.results.forEach {it->
                    popularAdapter.setAdapterList(it.id,it.adult, it.backdrop_path, it.original_language, it.original_title,
                        it.overview, it.poster_path, it.release_date, it.title)
                }
            }
        })
    }

    private fun fetchTopRatedInfo(){
        movieViewModel.postTopRatedInfoLiveData.observe(this, Observer<MovieInfo> { t ->
            t.apply {
                t.results.forEach {it->
                    topRateddapter.setAdapterList(it.id,it.adult, it.backdrop_path, it.original_language, it.original_title,
                        it.overview, it.poster_path, it.release_date, it.title)
                }
            }
        })
    }

    private fun setAdapter(){
        val compositePageTransformer : CompositePageTransformer = CompositePageTransformer()
        val marginPageTransformer : MarginPageTransformer = MarginPageTransformer(40)
        compositePageTransformer.addTransformer(marginPageTransformer)

//        compositePageTransformer.addTransformer(ViewPager2.PageTransformer { page, position ->
//            val r : Float = 1 - abs(position)
//            page.scaleY = 0.85f + r * 0.15f
//        })

//        fragmentView?.vp_movie_poster?.apply {
//            adapter = listAdapter
//            clipToPadding = false
//            clipChildren = false
//            offscreenPageLimit = 4
//            setCurrentItem(5, true)
//            getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
//            setPageTransformer(compositePageTransformer)
//        }

        fragmentView.rv_nowPlaying.apply {
            layoutManager = LinearLayoutManager(activity).apply {
                orientation = LinearLayoutManager.HORIZONTAL
            }
            setHasFixedSize(true)
            adapter =
                listAdapter
        }

        fragmentView.rv_upComing.apply {
            layoutManager = LinearLayoutManager(activity).apply { orientation = LinearLayoutManager.HORIZONTAL }
            setHasFixedSize(true)
            adapter =
                upcomgingAdapter
        }

        fragmentView.rv_popular.apply {
            layoutManager = LinearLayoutManager(activity).apply { orientation = LinearLayoutManager.HORIZONTAL }
            setHasFixedSize(true)
            adapter =
                popularAdapter
        }

        fragmentView.rv_topRated.apply {
            layoutManager = GridLayoutManager(context,2).apply {
                orientation = GridLayoutManager.HORIZONTAL
            }
            //layoutManager = LinearLayoutManager(activity).apply { orientation = LinearLayoutManager.HORIZONTAL }
            setHasFixedSize(true)
            adapter =
                topRateddapter
        }


    }

    private fun initAdapter(){
        listAdapter = MovieListAdapter(this@MovieFragment.requireActivity())
        upcomgingAdapter = UpcomingListAdapter(this@MovieFragment.requireActivity())
        popularAdapter = PopularListAdapter(this@MovieFragment.requireActivity())
        topRateddapter = TopRatedListAdapter(this@MovieFragment.requireActivity())
    }

}