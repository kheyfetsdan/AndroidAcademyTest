  package com.example.android.androidacademytest

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class MoviesAdaptor(
    context: Context?,
    var movies: List<Movies>
) : RecyclerView.Adapter<ViewHolder>() {

    private var listener: MoviesAdaptor.OnItemClickListener? = null
    private val inflater: LayoutInflater = LayoutInflater.from(context)
    override fun getItemCount(): Int = movies.size

    fun getItem(position: Int): Movies = movies[position]

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return  ViewHolder(inflater.inflate(R.layout.view_holder_movie, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
        holder.itemView.setOnClickListener {
            listener!!.onItemClick()
        }
    }

    fun setListener(onItemClickListener: OnItemClickListener?) {

        listener = onItemClickListener
    }

    interface OnItemClickListener {
        fun onItemClick()
    }
}