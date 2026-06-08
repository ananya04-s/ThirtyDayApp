package com.example.thirtydaysapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Tip(
    val day: Int,
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)