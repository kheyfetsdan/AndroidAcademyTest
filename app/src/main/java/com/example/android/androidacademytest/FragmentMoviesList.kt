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
import kotlinx.coroutines.*


class FragmentMoviesList() : Fragment(R.layout.fragment_movies_list) {

    private var listenerMovie: MovieAdapter.OnItemMovieClickListener? = null
    private val fragmentScope = CoroutineScope(Dispatchers.Default + Job())

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var listMovies: List<Movie>? = null
        val adapter = MovieAdapter()
        val rvMoviesList = view.findViewById<RecyclerView>(R.id.movies_list_recycler)

        rvMoviesList.adapter = adapter
        rvMoviesList.layoutManager = GridLayoutManager(context, 2)


        fragmentScope.launch {
            listMovies = loadMovies(requireContext())
            withContext(Dispatchers.Main) {
                adapter.submitList(listMovies)
            }

        }

        adapter.setListener(listenerMovie)

        val itemDecoration =
            ItemOffsetDecoration(12)
        rvMoviesList.addItemDecoration(itemDecoration)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is MovieAdapter.OnItemMovieClickListener) {
            listenerMovie = context
        }

    }

    override fun onDetach() {
        super.onDetach()
        listenerMovie = null
    }
}
