package com.example.android.androidacademytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), FragmentMoviesList.onMoviePreviewClick, FragmentMoviesDetails.onBackClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.main_container, FragmentMoviesList())
            .commit()
    }

    override fun openMoviewDetails() {
        supportFragmentManager.beginTransaction()
            .apply {
                addToBackStack(null)
                add(R.id.main_container, FragmentMoviesDetails())
                commit()
            }
    }

    override fun onButtonBackClick() {
        supportFragmentManager.beginTransaction()
            .apply {
                remove(supportFragmentManager.fragments.last())
                commit()
            }
    }
}