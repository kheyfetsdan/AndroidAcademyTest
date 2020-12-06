package com.example.android.androidacademytest

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentMoviesList() : Fragment(R.layout.fragment_movies_list) {

    private var listenerMovie: MoviesAdapter.OnItemMovieClickListener? = null
    private val util = DataUtil()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = view.findViewById<RecyclerView>(R.id.movies_list_recycler)
        val movies = util.generateMoviesList(context)
        val adapter = MoviesAdapter(context, movies)
        list.adapter = adapter
        adapter.setListener(listenerMovie)

        list.layoutManager = GridLayoutManager(context, 2)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is MoviesAdapter.OnItemMovieClickListener) {
            listenerMovie = context
        }

    }

    override fun onDetach() {
        super.onDetach()
        listenerMovie = null
    }
}
