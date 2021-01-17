package com.example.android.androidacademytest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.androidacademytest.model.Movie
import com.bumptech.glide.Glide;


class MoviesAdapter(
    context: Context?,
    var movies: List<Movie>
) : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    private var listenerMovie: OnItemMovieClickListener? = null
    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private val context = context
    override fun getItemCount(): Int = movies.size

    fun getItem(position: Int): Movie = movies[position]

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return MoviesViewHolder(inflater.inflate(R.layout.view_holder_movie, parent, false))
    }

    override fun onBindViewHolder(holderMovies: MoviesViewHolder, position: Int) {
        if (context != null) {
            holderMovies.bind(getItem(position))
        }
        holderMovies.itemView.setOnClickListener {
            listenerMovie?.onItemClick()
        }
    }

    fun setListener(onItemClickListener: OnItemMovieClickListener?) {

        listenerMovie = onItemClickListener
    }

    interface OnItemMovieClickListener {
        fun onItemClick()
    }

    inner class MoviesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val poster: ImageView = itemView.findViewById(R.id.movie_poster)
        private val title: TextView = itemView.findViewById(R.id.movie_name)
        private val gener: TextView = itemView.findViewById(R.id.tag)
        private val review: TextView = itemView.findViewById(R.id.review)
        private val stars: RatingBar = itemView.findViewById(R.id.ratingBar_indicator)
        private val duration: TextView = itemView.findViewById(R.id.duration)

        fun bind(movie: Movie) {
            if (context != null) {
                Glide.with(context).load(movie.imageUrl).into(poster)
            }
            title.text = movie.title
            gener.text = movie.genres.toString()
            review.text = "${movie.reviewCount} Reviews"
            duration.text = "${movie.runningTime} MIN"
            stars.rating = (movie.rating * 0.5).toFloat()


        }
    }
}