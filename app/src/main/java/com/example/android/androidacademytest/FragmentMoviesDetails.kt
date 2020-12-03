package com.example.android.androidacademytest

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentMoviesDetails() : Fragment(R.layout.fragment_movies_details) {

    private var listener: OnBackClick? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnMovie: View = view.findViewById(R.id.toolbar)

        btnMovie.setOnClickListener {
            listener?.onButtonBackClick()
        }
    }

    interface OnBackClick {
        fun onButtonBackClick()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is OnBackClick) {
            listener = context
        }

    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}