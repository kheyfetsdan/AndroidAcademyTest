  package com.example.android.androidacademytest

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class MoviesAdapter(
    context: Context?,
    var movies: List<Movies>
) : RecyclerView.Adapter<MoviesViewHolder>() {

    private var listenerMovie: MoviesAdapter.OnItemMovieClickListener? = null
    private val inflater: LayoutInflater = LayoutInflater.from(context)
    override fun getItemCount(): Int = movies.size

    fun getItem(position: Int): Movies = movies[position]

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return  MoviesViewHolder(inflater.inflate(R.layout.view_holder_movie, parent, false))
    }

    override fun onBindViewHolder(holderMovies: MoviesViewHolder, position: Int) {
        holderMovies.bind(getItem(position))
        holderMovies.itemView.setOnClickListener {
            listenerMovie!!.onItemClick()
        }
    }

    fun setListener(onItemClickListener: OnItemMovieClickListener?) {

        listenerMovie = onItemClickListener
    }

    interface OnItemMovieClickListener {
        fun onItemClick()
    }
}