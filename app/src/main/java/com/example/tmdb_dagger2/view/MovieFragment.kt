package com.example.tmdb_dagger2.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import com.example.tmdb_dagger2.R
import com.example.tmdb_dagger2.databinding.FragmentMovieBinding
import com.example.tmdb_dagger2.model.MovieInfo
import com.example.tmdb_dagger2.viewmodel.MovieViewModel
import com.example.tmdb_dagger2.viewmodel.MovieViewModelFactory
import kotlinx.android.synthetic.main.fragment_movie.view.*

class MovieFragment : Fragment() {

    companion object{
        lateinit var movieViewModel: MovieViewModel
        lateinit var fragmentView:View
        lateinit var listAdapter:MovieListAdapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val fragmentMovieBinding : FragmentMovieBinding
                = DataBindingUtil.inflate(inflater,R.layout.fragment_movie,container,false)
        fragmentView = fragmentMovieBinding.root
        initAdapter()
        setAdapter()
        fetchRetroInfo()

        return  fragmentView
    }

    fun  initViewModel(){
        val movieViewModelFactory = MovieViewModelFactory()
        movieViewModel = ViewModelProviders.of(this,movieViewModelFactory).get(MovieViewModel::class.java)
    }

    fun fetchRetroInfo(){
        movieViewModel.postInfoLiveData.observe(this, Observer<MovieInfo> { t ->
            t.apply {
                t.results.forEach {it ->
                    listAdapter.setAdapterList(it.id,it.adult, it.backdrop_path, it.original_language, it.original_title,
                        it.overview, it.poster_path, it.release_date, it.title)
                }

            }
        })
    }

//    fun fetchRetroInfo(){
//        retroViewModel.postInfoLiveData.observe(this, Observer<List<PostInfo>> { t ->
//            t.apply {
//                listAdapter?.setAdapterList(t)
//            }
//        })
//    }

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


//        fragmentView?.post_list?.apply {
//
//            layoutManager = GridLayoutManager(context,2).apply {
//                orientation = GridLayoutManager.VERTICAL
//            }
//            setHasFixedSize(true)
//            //addItemDecoration(DividerItemDecoration(activity, DividerItemDecoration.VERTICAL))
//            adapter = listAdapter
//        }

        fragmentView.rv_nowPlaying.apply {
            layoutManager = LinearLayoutManager(activity).apply {
                orientation = LinearLayoutManager.HORIZONTAL
            }
            setHasFixedSize(true)
            adapter = listAdapter
        }
    }

    private fun initAdapter(){
        listAdapter = MovieListAdapter(this@MovieFragment.requireActivity())
    }

}