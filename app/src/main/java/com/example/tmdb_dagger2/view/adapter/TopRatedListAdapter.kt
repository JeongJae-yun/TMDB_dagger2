package com.example.tmdb_dagger2.view.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.tmdb_dagger2.BR
import com.example.tmdb_dagger2.R
import com.example.tmdb_dagger2.databinding.ItemMovieBinding
import com.example.tmdb_dagger2.databinding.ItemTopratedMovieBinding
import com.example.tmdb_dagger2.model.data.MovieItem
import com.example.tmdb_dagger2.view.Detail.DetailActivity


class TopRatedListAdapter(private var context: Context) : RecyclerView.Adapter<TopRatedListAdapter.ViewHolder>() {
    private var ntopRatedItemList = ArrayList<MovieItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemTopratedMovieBinding
                = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_toprated_movie, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(ntopRatedItemList[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("id",ntopRatedItemList[position].id)
            context.startActivity(intent)
            //Toast.makeText(context, ntopRatedItemList[position].title.toString() , Toast.LENGTH_SHORT).show()
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
        ntopRatedItemList.add(
            MovieItem(id=id,adult = adult,backdrop_path = backdropPath,original_language = originalLanguage,
                original_title = originalTitle, overview = overview, poster_path = posterPath, release_date = releaseDate, title = title)
        )

        notifyDataSetChanged()
    }

//    fun setAdapterList(list: List<PostInfo> ){
//        this.list = list
//        notifyDataSetChanged()
//    }

    override fun getItemCount(): Int = ntopRatedItemList.size

    inner class ViewHolder(private val binding: ItemTopratedMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Any) {
            binding.setVariable(BR.resultmodel, data) //BR - generated class; BR.user - 'user' is variable name declared in layout
            binding.executePendingBindings()
        }
    }
}