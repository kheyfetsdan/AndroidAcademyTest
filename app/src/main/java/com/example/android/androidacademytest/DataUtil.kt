package com.example.android.androidacademytest

import android.content.Context
import androidx.appcompat.content.res.AppCompatResources.getDrawable


object DataUtil {

    fun generateActorsList(): List<Actors> {
        val downey = R.drawable.downey
        val evans = R.drawable.evans
        val hemsworth = R.drawable.hemsworth
        val ruffalo = R.drawable.ruffalo

        val downey_name = R.string.downey
        val evans_name = R.string.evans
        val hemsworth_name = R.string.hemsworth
        val ruffalo_name = R.string.ruffalo

        return listOf(
            Actors(downey, downey_name),
            Actors(evans, evans_name),
            Actors(hemsworth, hemsworth_name),
            Actors(ruffalo, ruffalo_name)
        )

    }

    fun generateMoviesList(): List<Movies> {
        val tenet_poster = R.drawable.tenet_poster
        val aeg_poster = R.drawable.preview_movie
        val bw_poster = R.drawable.black_window_poster
        val ww_poster = R.drawable.wonder_woman_poster

        val aeg_name = R.string.movie_name
        val aeg_tag = R.string.tag
        val aeg_review = R.string.review
        val aeg_star: Int = 4
        val aeg_duration = R.string.aeg_duration

        val tanet_name = R.string.movies_list_tenet
        val tenet_tag = R.string.tag_tenet
        val tenet_review = R.string.review_tenet
        val tenet_star: Int = 5
        val tenet_duration = R.string.tenet_duration

        val bw_name = R.string.bw_name
        val bw_tag = R.string.bw_tag
        val bw_review = R.string.bw_rewiew
        val bw_star: Int = 4
        val bw_duration = R.string.bw_duration

        val ww_name = R.string.ww_name
        val ww_tag = R.string.ww_tag
        val ww_review = R.string.ww_review
        val ww_star: Int = 5
        val ww_duration = R.string.ww_duration
        return listOf(
            Movies(tenet_poster, tanet_name, tenet_tag, tenet_review, tenet_star, tenet_duration),
            Movies(aeg_poster, aeg_name, aeg_tag, aeg_review, aeg_star, aeg_duration),
            Movies(bw_poster, bw_name, bw_tag, bw_review, bw_star, bw_duration),
            Movies(ww_poster, ww_name, ww_tag, ww_review, ww_star, ww_duration)
        )
    }
}