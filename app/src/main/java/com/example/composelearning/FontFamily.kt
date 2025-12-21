package com.example.composelearning

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily

import androidx.compose.ui.text.font.FontWeight

class FontFamily {
    val monserratFontFamily = FontFamily(
        Font(R.font.montserrat_regular, FontWeight.Thin),
        Font(R.font.montserrat_medium, FontWeight.Medium)
    )
    val monserratAlternatesFontFamily = FontFamily(
        Font(
            R.font.montserrat_alternates_semi_bold, FontWeight.Thin
        )
    )
}