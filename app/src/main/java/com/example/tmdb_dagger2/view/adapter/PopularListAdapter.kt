package com.example.tmdb_dagger2.view.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.tmdb_dagger2.BR
import com.example.tmdb_dagger2.R
import com.example.tmdb_dagger2.databinding.ItemPopularMovieBinding
import com.example.tmdb_dagger2.model.data.MovieItem
import com.example.tmdb_dagger2.view.Detail.DetailActivity


class PopularListAdapter(private var context: Context) : RecyclerView.Adapter<PopularListAdapter.ViewHolder>() {
    private var popularItemList = ArrayList<MovieItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemPopularMovieBinding
                = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_popular_movie, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(popularItemList[position], position)
        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("id",popularItemList[position].id)
            context.startActivity(intent)
            //Toast.makeText(context, nowplayItemList[position].title.toString() , Toast.LENGTH_SHORT).show()
            //retroFragment.iv_capture.visibility
        }
    }

    fun setAdapterList(
        id : Int,
        adult: Boolean,
        backdropPath: String?,
        originalLanguage: String,
        originalTitle: String,
        overview: String,
        posterPath: String?,
        releaseDate: String,
        title: String
    ){
        popularItemList.add(
            MovieItem(id=id,adult = adult,backdrop_path = backdropPath,original_language = originalLanguage,
                original_title = originalTitle, overview = overview, poster_path = posterPath, release_date = releaseDate, title = title)
        )

        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = popularItemList.size

    inner class ViewHolder(private val binding: ItemPopularMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Any, position: Int) {
            binding.tvRank.text = (position+1).toString()
            binding.setVariable(BR.resultmodel, data) //BR - generated class; BR.user - 'user' is variable name declared in layout
            binding.executePendingBindings()
        }
    }
}