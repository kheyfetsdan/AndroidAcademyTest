package com.example.android.androidacademytest

import android.content.Context
import androidx.appcompat.content.res.AppCompatResources.getDrawable


class DataUtil {

    fun generateActorsList(context: Context?): List<Actors> {
        val downey = getDrawable(context!!, R.drawable.downey)
        val evans = getDrawable(context!!, R.drawable.evans)
        val hemsworth = getDrawable(context!!, R.drawable.hemsworth)
        val ruffalo = getDrawable(context!!, R.drawable.ruffalo)

        val downey_name = context.getString(R.string.downey)
        val evans_name = context.getString(R.string.evans)
        val hemsworth_name = context.getString(R.string.hemsworth)
        val ruffalo_name = context.getString(R.string.ruffalo)

        return listOf(
            Actors(downey, downey_name),
            Actors(evans, evans_name),
            Actors(hemsworth, hemsworth_name),
            Actors(ruffalo, ruffalo_name)
        )

    }

    fun generateMoviesList(context: Context?): List<Movies> {
        val tenet_poster = getDrawable(context!!, R.drawable.tenet_poster)
        val aeg_poster = getDrawable(context!!, R.drawable.preview_movie)
        val bw_poster = getDrawable(context!!, R.drawable.black_window_poster)
        val ww_poster = getDrawable(context!!, R.drawable.wonder_woman_poster)

        val aeg_name = context.getString(R.string.movie_name)
        val aeg_tag = context.getString(R.string.tag)
        val aeg_review = context.getString(R.string.review)
        val aeg_star: Int = 4
        val aeg_duration = context.getString(R.string.aeg_duration)

        val tanet_name = context.getString(R.string.movies_list_tenet)
        val tenet_tag = context.getString(R.string.tag_tenet)
        val tenet_review = context.getString(R.string.review_tenet)
        val tenet_star: Int = 5
        val tenet_duration = context.getString(R.string.tenet_duration)

        val bw_name = context.getString(R.string.bw_name)
        val bw_tag = context.getString(R.string.bw_tag)
        val bw_review = context.getString(R.string.bw_rewiew)
        val bw_star: Int = 4
        val bw_duration = context.getString(R.string.bw_duration)

        val ww_name = context.getString(R.string.ww_name)
        val ww_tag = context.getString(R.string.ww_tag)
        val ww_review = context.getString(R.string.ww_review)
        val ww_star: Int = 5
        val ww_duration = context.getString(R.string.ww_duration)
        return listOf(
            Movies(tenet_poster, "Telnet", tenet_tag, tenet_review, tenet_star, tenet_duration),
            Movies(aeg_poster, aeg_name, aeg_tag, aeg_review, aeg_star, aeg_duration),
            Movies(bw_poster, bw_name, bw_tag, bw_review, bw_star, bw_duration),
            Movies(ww_poster, ww_name, ww_tag, ww_review, ww_star, ww_duration)
        )
    }
}