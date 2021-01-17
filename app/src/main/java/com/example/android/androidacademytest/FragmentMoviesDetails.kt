package com.example.android.androidacademytest

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.androidacademytest.model.Actor

class FragmentMoviesDetails() : Fragment(R.layout.fragment_movies_details) {

    private var listener: OnBackClick? = null
    private var listenerActors: ActorAdapter.OnItemActorClickListener? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnMovie: View = view.findViewById(R.id.toolbar)

        btnMovie.setOnClickListener {
            listener?.onButtonBackClick()
        }

        val list = view.findViewById<RecyclerView>(R.id.actor_recycler)
        val generateActorsList: List<Actor> by lazy {
            DataUtil.generateActorsList()
        }
        val adapter = ActorAdapter(context, generateActorsList)

        val itemDecoration =
            ItemOffsetDecoration(16)

        list.addItemDecoration(itemDecoration)
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