package com.example.android.androidacademytest

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class FragmentMoviesList() : Fragment(R.layout.fragment_movies_list) {

    private var listener: OnMoviePreviewClick? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnMovie: ImageView = view.findViewById(R.id.movie_poster)

        btnMovie.setOnClickListener {
            listener?.openMovieDetails()
        }
    }


    interface OnMoviePreviewClick {
        fun openMovieDetails()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is OnMoviePreviewClick) {
            listener = context
        }

    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}
