package com.example.tmdb_dagger2.view

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.tmdb_dagger2.R
import com.example.tmdb_dagger2.BR
import com.example.tmdb_dagger2.databinding.ItemMovieBinding
import com.example.tmdb_dagger2.model.data.NowPlayItem

class MovieListAdapter(private var context: Context) : RecyclerView.Adapter<MovieListAdapter.ViewHolder>()
{

    //private var nowplayItemList = ArrayList<Result>()
    private var nowplayItemList = ArrayList<NowPlayItem>()
//    private  var list: List<PostInfo> = emptyList<PostInfo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemMovieBinding
                = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_movie, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(nowplayItemList[position])
        holder.itemView.setOnClickListener {
            Toast.makeText(context, nowplayItemList[position].title.toString() , Toast.LENGTH_SHORT).show()

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
        nowplayItemList.add(
            NowPlayItem(id=id,adult = adult,backdrop_path = backdropPath,original_language = originalLanguage,
                original_title = originalTitle, overview = overview, poster_path = posterPath, release_date = releaseDate, title = title)
        )

        notifyDataSetChanged()
    }

//    fun setAdapterList(list: List<PostInfo> ){
//        this.list = list
//        notifyDataSetChanged()
//    }

    override fun getItemCount(): Int = nowplayItemList.size

    inner class ViewHolder(private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Any) {
            binding.setVariable(BR.resultmodel, data) //BR - generated class; BR.user - 'user' is variable name declared in layout
            binding.executePendingBindings()
        }
    }
}