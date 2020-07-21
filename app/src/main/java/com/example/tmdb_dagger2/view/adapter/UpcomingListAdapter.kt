package com.example.tmdb_dagger2.view.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.tmdb_dagger2.BR
import com.example.tmdb_dagger2.R
import com.example.tmdb_dagger2.databinding.ItemUpcomingMovieBinding
import com.example.tmdb_dagger2.model.data.MovieItem
import com.example.tmdb_dagger2.view.Detail.DetailActivity


class UpcomingListAdapter(private var context: Context) : RecyclerView.Adapter<UpcomingListAdapter.ViewHolder>()
{

    //private var nowplayItemList = ArrayList<Result>()
    private var upcomingItemList = ArrayList<MovieItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemUpcomingMovieBinding
                = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_upcoming_movie, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(upcomingItemList[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("id",upcomingItemList[position].id)
            context.startActivity(intent)
            //Toast.makeText(context, upcomingItemList[position].title.toString() , Toast.LENGTH_SHORT).show()
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
        upcomingItemList.add(
            MovieItem(id=id,adult = adult,backdrop_path = backdropPath,original_language = originalLanguage,
                original_title = originalTitle, overview = overview, poster_path = posterPath, release_date = releaseDate, title = title)
        )
        notifyDataSetChanged()
    }

//    fun setAdapterList(list: List<PostInfo> ){
//        this.list = list
//        notifyDataSetChanged()
//    }

    override fun getItemCount(): Int = upcomingItemList.size

    inner class ViewHolder(private val binding: ItemUpcomingMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Any) {
            binding.setVariable(BR.resultmodel, data) //BR - generated class; BR.user - 'user' is variable name declared in layout
            binding.executePendingBindings()
        }
    }
}