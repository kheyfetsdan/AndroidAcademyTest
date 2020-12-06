package com.example.android.androidacademytest

import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ActorsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val photo: ImageView = itemView.findViewById(R.id.actor_photo)
    private val actor_name: TextView = itemView.findViewById(R.id.actor_name)

    fun bind(actors: Actors) {
        photo.setImageDrawable(actors.photo)
        actor_name.text = actors.name
    }
}