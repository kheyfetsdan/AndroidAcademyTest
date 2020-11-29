package com.example.android.androidacademytest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), FragmentMoviesList.onMoviePreviewClick,
    FragmentMoviesDetails.onBackClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.main_container, FragmentMoviesList())
                .commit()
        }
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