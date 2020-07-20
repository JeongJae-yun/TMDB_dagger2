package com.example.tmdb_dagger2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tmdb_dagger2.R

class MovieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)
        replaceFragment()
    }

    fun replaceFragment(){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container_retro_room,MovieFragment())
            .commit()
    }
}