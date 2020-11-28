package com.example.android.androidacademytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), FragmentMoviesList.ChangeFragmentClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.main_container, FragmentMoviesList())
            .commit()
    }

    override fun openMoviewDetails() {

        val fragmentMoviesDetails = supportFragmentManager.findFragmentById(R.id.movies_details)
        supportFragmentManager.beginTransaction()
            .apply {
                if (fragmentMoviesDetails != null) {
                    replace(R.id.main_container, fragmentMoviesDetails)
                }
                commit()
            }
    }
}