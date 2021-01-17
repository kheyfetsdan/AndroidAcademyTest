package com.example.android.androidacademytest

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.academy.fundamentals.homework.features.data.loadMovies
import com.example.android.androidacademytest.model.Movie
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch


class FragmentMoviesList() : Fragment(R.layout.fragment_movies_list) {

    private var listenerMovie: MoviesAdapter.OnItemMovieClickListener? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var listMovies: List<Movie>? = null
        val rvMoviesList = view.findViewById<RecyclerView>(R.id.movies_list_recycler)


        lifecycleScope.launch {
            listMovies = loadMovies(requireContext())
            val adapter = listMovies?.let { MoviesAdapter(context, it) }
            rvMoviesList.adapter = adapter

            /*val itemDecoration =
                ItemOffsetDecoration(12)
            rvMoviesList.addItemDecoration(itemDecoration)*/

            rvMoviesList.layoutManager = GridLayoutManager(context, 2)
            if (adapter != null) {
                adapter.setListener(listenerMovie)
            }
        }





        /*val itemDecoration =
            ItemOffsetDecoration(12)
        rvMoviesList.addItemDecoration(itemDecoration)

        rvMoviesList.layoutManager = GridLayoutManager(context, 2)*/
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
