package com.example.android.androidacademytest

import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MoviesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val poster: ImageView = itemView.findViewById(R.id.movie_poster)
    private val movie_name: TextView = itemView.findViewById(R.id.movie_name)
    private  val tag: TextView = itemView.findViewById(R.id.tag)
    private val review: TextView = itemView.findViewById(R.id.review)
    private val stars: RatingBar = itemView.findViewById(R.id.ratingBar_indicator)
    private val duration: TextView = itemView.findViewById(R.id.duration)

    fun bind(movies: Movies) {
        poster.setImageDrawable(movies.poster)
        movie_name.text = movies.movie_name
        tag.text = movies.tag
        review.text = movies.review
        stars.rating = movies.stars.toFloat()
        duration.text = movies.duration
    }
}