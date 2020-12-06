package com.example.android.androidacademytest

import android.graphics.drawable.Drawable
import androidx.core.content.res.ResourcesCompat


data class Movies(
    val poster: Drawable?,
    val movie_name: String,
    val tag: String,
    val review: String,
    val stars: Int,
    val duration: String
)