package com.example.android.androidacademytest

import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MoviesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val poster: ImageView = itemView.findViewById(R.id.movie_poster)
    private val movieName: TextView = itemView.findViewById(R.id.movie_name)
    private val tag: TextView = itemView.findViewById(R.id.tag)
    private val review: TextView = itemView.findViewById(R.id.review)
    private val stars: RatingBar = itemView.findViewById(R.id.ratingBar_indicator)
    private val duration: TextView = itemView.findViewById(R.id.duration)

    fun bind(movie: Movie) {
        poster.setImageResource(movie.poster)
        movieName.text = movie.movieName.toString()
        movieName.setText(movie.movieName)
        tag.setText(movie.tag)
        review.setText(movie.review)
        stars.rating = movie.stars.toFloat()
        duration.setText(movie.duration)
    }
}