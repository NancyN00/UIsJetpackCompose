package com.example.uipractice.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun TextField(
    title: String,
    textAlign: TextAlign
){
    Text(text = title,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
        )
}