package com.example.android.androidacademytest

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentMoviesList() : Fragment(R.layout.fragment_movies_list) {

    private var listener: MoviesAdaptor.OnItemClickListener? = null
    private val util = DataUtil()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = view.findViewById<RecyclerView>(R.id.movies_list_recycler)
        val movies = util.generateMoviesList()
        val adapter = MoviesAdaptor(context, movies)
        list.adapter = adapter
        adapter.setListener(listener)

        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        list.layoutManager = layoutManager
    }


    interface OnMoviePreviewClick {
        fun openMovieDetails()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is MoviesAdaptor.OnItemClickListener) {
            listener = context
        }

    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}
