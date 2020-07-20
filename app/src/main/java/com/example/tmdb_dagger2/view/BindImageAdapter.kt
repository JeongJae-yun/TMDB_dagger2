package com.example.tmdb_dagger2.view

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.example.tmdb_dagger2.R


@BindingAdapter("imageLoad")
fun bindImageFromRes(view : ImageView, url: String?){
    val path = "https://image.tmdb.org/t/p/w500$url"


    //https://image.tmdb.org/t/p/w500/hPkqY2EMqWUnFEoedukilIUieVG.jpg
//    GlideApp
//        .with(view)
//        .load(path)
//        .into(view)

    Glide
        .with(view)
        .load(path)
        .placeholder(R.drawable.placeholder)
        .transition(DrawableTransitionOptions.withCrossFade())
        .into(view)

}