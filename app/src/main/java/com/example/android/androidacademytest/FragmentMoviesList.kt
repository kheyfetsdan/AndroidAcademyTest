package com.example.android.androidacademytest

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class FragmentMoviesList : Fragment() {

    private var listener: onMoviePreviewClick? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movies_list, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnMovie = view.findViewById<ImageView>(R.id.movie_poster)

        btnMovie.setOnClickListener {
            listener?.openMoviewDetails()
        }
    }


    interface onMoviePreviewClick {
        fun openMoviewDetails()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is onMoviePreviewClick){
            listener = context
        }

    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}
