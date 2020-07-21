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
import com.example.tmdb_dagger2.databinding.ItemMovieSearchBinding
import com.example.tmdb_dagger2.model.data.MovieItem
import com.example.tmdb_dagger2.model.data.SearchItem
import com.example.tmdb_dagger2.view.Detail.DetailActivity

class SearchAdapter(private var context: Context) : RecyclerView.Adapter<SearchAdapter.ViewHolder>() {
    private var searchItemList = ArrayList<SearchItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemMovieSearchBinding
                = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_movie_search, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(searchItemList[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("id",searchItemList[position].id)
            context.startActivity(intent)
            //Toast.makeText(context, nowplayItemList[position].title.toString() , Toast.LENGTH_SHORT).show()
            //retroFragment.iv_capture.visibility
        }
    }

    fun refresh(){
        searchItemList.clear()
    }

    fun setAdapterList(id : Int, posterPath: String?, title: String){
        searchItemList.add(SearchItem(id=id,poster_path = posterPath, title = title))
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int = searchItemList.size

    inner class ViewHolder(private val binding: ItemMovieSearchBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Any) {
            binding.setVariable(BR.resultmodel, data) //BR - generated class; BR.user - 'user' is variable name declared in layout
            binding.executePendingBindings()
        }
    }
}