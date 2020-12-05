package com.example.android.androidacademytest

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val poster: ImageView = itemView.findViewById(R.id.movie_poster)
    private val movie_name: TextView = itemView.findViewById(R.id.movie_name)
    private  val tag: TextView = itemView.findViewById(R.id.tag)

    fun bind(movies: Movies) {
        //poster.setImageDrawable(movies.poster)
        movie_name.text = movies.movie_name
        tag.text = movies.tag
    }
}