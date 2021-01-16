package com.example.android.androidacademytest

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class Actor (
    @DrawableRes
    val photo: Int,
    @StringRes
    val name: Int
)