package com.example.uipractice.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RowButtonField(
    modifier : Modifier = Modifier,
    title : String,
    onClick: () -> Unit
){
    
    Button(onClick = onClick,
        modifier = modifier.height(40.dp),
        shape = RoundedCornerShape(8.dp)
    )
    {
        Text(text = title)
        
    }
    
}