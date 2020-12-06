package com.example.android.androidacademytest

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentMoviesDetails() : Fragment(R.layout.fragment_movies_details) {

    private var listener: OnBackClick? = null
    private var listenerActors: ActorAdapter.OnItemActorClickListener? = null
    private val util = DataUtil()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnMovie: View = view.findViewById(R.id.toolbar)

        btnMovie.setOnClickListener {
            listener?.onButtonBackClick()
        }

        val list = view.findViewById<RecyclerView>(R.id.actor_recycler)
        val actors = util.generateActorsList(context)
        val adapter = ActorAdapter(context, actors)
        list.adapter = adapter
        list.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
    }

    interface OnBackClick {
        fun onButtonBackClick()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is OnBackClick) {
            listener = context
        }

    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}