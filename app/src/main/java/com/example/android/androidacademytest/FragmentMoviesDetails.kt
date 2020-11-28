package com.example.android.androidacademytest

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout

class FragmentMoviesDetails : Fragment() {

    private var listener: onBackClick? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movies_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnMovie = view.findViewById<LinearLayout>(R.id.toolbar)

        btnMovie.setOnClickListener {
            listener?.onButtonBackClick()
        }
    }

    interface onBackClick {
        fun onButtonBackClick()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is onBackClick){
            listener = context
        }

    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}