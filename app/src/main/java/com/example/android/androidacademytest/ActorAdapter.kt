package com.example.android.androidacademytest

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.androidacademytest.model.Actor


class ActorAdapter ( context: Context?,
    var actors: List<Actor>
) : RecyclerView.Adapter<ActorsViewHolder>() {

    private var listenerActor: ActorAdapter.OnItemActorClickListener? = null
    private val inflater: LayoutInflater = LayoutInflater.from(context)
    override fun getItemCount(): Int
            = actors.size

    fun getItem(position: Int): Actor = actors[position]

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorsViewHolder {
        return  ActorsViewHolder(inflater.inflate(R.layout.view_holder_actor, parent, false))
    }

    override fun onBindViewHolder(holderActors: ActorsViewHolder, position: Int) {
        holderActors.bind(getItem(position))
        holderActors.itemView.setOnClickListener {
            listenerActor?.onItemClick()
        }
    }

    fun setListener(onItemActorClickListener: OnItemActorClickListener?) {

        listenerActor = onItemActorClickListener
    }

    interface OnItemActorClickListener {
        fun onItemClick()
    }
}