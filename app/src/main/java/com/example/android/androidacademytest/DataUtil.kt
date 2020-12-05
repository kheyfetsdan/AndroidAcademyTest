package com.example.android.androidacademytest


class DataUtil {

    fun generateMoviesList(): List<Movies> {
        return listOf(
            Movies("AEG", "Action"),
            Movies("TELNET", "Triller"),
            Movies("AEG", "Action"),
            Movies("TELNET", "Triller"),
            Movies("AEG", "Action"),
            Movies("TELNET", "Triller")
        )
    }
}