package com.example.android.androidacademytest

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.core.content.res.ResourcesCompat


data class Movies(
    @DrawableRes
    val poster: Int,
    @StringRes
    val movieName: Int,
    @StringRes
    val tag: Int,
    @StringRes
    val review: Int,
    val stars: Int,
    @StringRes
    val duration: Int
)