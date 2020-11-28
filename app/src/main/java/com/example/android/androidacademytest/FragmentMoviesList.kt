package com.example.android.androidacademytest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class FragmentMoviesList : Fragment(), View.OnClickListener {

    private var listener: ChangeFragmentClick? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movies_list, container, false)

        val btnMovie = view.findViewById<ImageView>(R.id.movie_poster)

        btnMovie.setOnClickListener(this)

        return view
    }



    interface ChangeFragmentClick {
        fun openMoviewDetails()
    }

    override fun onClick(p0: View?) {
        listener?.openMoviewDetails()
        Toast.makeText(
            activity, "Вы нажали на кнопку",
            Toast.LENGTH_SHORT).show()
    }
}
