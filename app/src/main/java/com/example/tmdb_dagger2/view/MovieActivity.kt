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
package com.example.tmdb_dagger2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tmdb_dagger2.R
import com.example.tmdb_dagger2.view.Home.MovieFragment

class MovieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)
        replaceFragment()
    }

    fun replaceFragment(){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container_retro_room,
                MovieFragment()
            )
            .commit()
    }
}