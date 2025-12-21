package com.example.composelearning

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Type {
    val recipesAppTypography = Typography(
        displayLarge = TextStyle(
            fontFamily = FontFamily().monserratFontFamily,
            fontSize = 20.sp,
        ),
        titleMedium = TextStyle(
            fontFamily = FontFamily().monserratAlternatesFontFamily,
            fontSize = 16.sp,
        ),
        bodyMedium = TextStyle(
            fontFamily = FontFamily().monserratFontFamily,
            fontSize = 14.sp,
        ),
        bodySmall = TextStyle(
            fontFamily = FontFamily().monserratFontFamily,
            fontSize = 12.sp,
        ),
        labelLarge = TextStyle(
            fontFamily = FontFamily().monserratFontFamily,
            fontSize = 16.sp,
        )
    )

    @Preview(showBackground = true)
    @Composable
    fun TypographyPreview() {
        RecipesAppTheme {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    "displayLarge - Заголовки экранов",
                    style = MaterialTheme.typography.displayLarge
                )
                Text("titleMedium - Карточки", style = MaterialTheme.typography.titleMedium)
                Text("bodyMedium - Основной текст", style = MaterialTheme.typography.bodyMedium)
                Text("bodySmall - Мелкий текст", style = MaterialTheme.typography.bodySmall)
                Text("labelLarge - Кнопки", style = MaterialTheme.typography.labelLarge)
            }
        }
    }

    @Composable
    fun RecipesAppTheme(content: @Composable () -> Unit) {
        TODO("Not yet implemented")
    }
}