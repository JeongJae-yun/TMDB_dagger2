package com.example.tmdb_dagger2.view.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.tmdb_dagger2.BR
import com.example.tmdb_dagger2.R
import com.example.tmdb_dagger2.databinding.ItemMovieSimilarBinding
import com.example.tmdb_dagger2.model.data.MovieItem
import com.example.tmdb_dagger2.model.data.SimilarItem
import com.example.tmdb_dagger2.view.Detail.DetailActivity

class SimilarListAdapter(private var context: Context) : RecyclerView.Adapter<SimilarListAdapter.ViewHolder>() {
    private var similarItemList = ArrayList<SimilarItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemMovieSimilarBinding
                = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_movie_similar, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(similarItemList[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("id",similarItemList[position].id)
            context.startActivity(intent)
            //Toast.makeText(context, nowplayItemList[position].title.toString() , Toast.LENGTH_SHORT).show()
            //retroFragment.iv_capture.visibility
        }
    }

    fun setAdapterList(
        id : Int,
        posterPath: String?,
        title: String
    ){
        similarItemList.add(
            SimilarItem(id=id, poster_path = posterPath, title = title)
        )

        notifyDataSetChanged()
    }

//    fun setAdapterList(list: List<PostInfo> ){
//        this.list = list
//        notifyDataSetChanged()
//    }

    override fun getItemCount(): Int = similarItemList.size

    inner class ViewHolder(private val binding: ItemMovieSimilarBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Any) {
            binding.setVariable(BR.resultmodel, data) //BR - generated class; BR.user - 'user' is variable name declared in layout
            binding.executePendingBindings()
        }
    }
}