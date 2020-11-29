package com.example.android.androidacademytest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), FragmentMoviesList.OnMoviePreviewClick,
    FragmentMoviesDetails.onBackClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.main_container, FragmentMoviesList(R.layout.fragment_movies_list))
                .commit()
        }
    }

    override fun openMovieDetails() {
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