package com.example.android.androidacademytest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.androidacademytest.model.Movie
import com.bumptech.glide.Glide;


class MovieAdapter : ListAdapter<Movie, MovieViewHolder>(DIFF_CALLBACK) {


    private var listenerMovie: OnItemMovieClickListener? = null


    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Movie>() {
            override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean =
                oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(inflater.inflate(R.layout.view_holder_movie, parent,false))

    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {

        val movie = getItem(position)
        holder.bind(movie)
        holder.itemView.setOnClickListener {
            listenerMovie?.onItemClick()
        }

    }

    fun setListener(onItemClickListener: OnItemMovieClickListener?) {

        listenerMovie = onItemClickListener
    }

    interface OnItemMovieClickListener {
        fun onItemClick()
    }
}