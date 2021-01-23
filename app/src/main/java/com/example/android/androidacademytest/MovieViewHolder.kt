package com.example.android.androidacademytest

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android.androidacademytest.model.Movie
import com.willy.ratingbar.ScaleRatingBar


class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val poster: ImageView = itemView.findViewById(R.id.movie_poster)
    private val title: TextView = itemView.findViewById(R.id.movie_name)
    private val gener: TextView = itemView.findViewById(R.id.tag)
    private val review: TextView = itemView.findViewById(R.id.review)
    private val stars: ScaleRatingBar = itemView.findViewById(R.id.ratingBar_indicator)
    private val duration: TextView = itemView.findViewById(R.id.duration)

    fun bind(movie: Movie) {
        //poster.setImageResource(R.drawable.preview_movie)
        Glide.with(itemView.context).load(movie.imageUrl).into(poster)
        title.text = movie.title
        gener.text = movie.genres.toString()
        review.text = "${movie.reviewCount} Reviews"
        duration.text = "${movie.runningTime} MIN"
        stars.rating = Math.round(((movie.rating / 2).toDouble())).toFloat()

    }
}