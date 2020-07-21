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
package com.example.tmdb_dagger2.view.ImageBind

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