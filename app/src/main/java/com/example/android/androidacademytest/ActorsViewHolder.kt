package com.example.android.androidacademytest

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ActorsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val photo: ImageView = itemView.findViewById(R.id.actor_photo)
    private val actorName: TextView = itemView.findViewById(R.id.actor_name)

    fun bind(actor: Actor) {
        photo.setImageResource(actor.photo)
        actorName.setText(actor.name)
    }
}