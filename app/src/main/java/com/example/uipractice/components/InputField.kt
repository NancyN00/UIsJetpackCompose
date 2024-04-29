package com.example.uipractice.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputField(
    value : String,
    placeholder: String,
    leadingIcon: @Composable (() -> Unit ) ? = null,
    onValueChange: (String) -> Unit
){

    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = {
            Text(text = placeholder)
        },
        leadingIcon = leadingIcon
        )

}