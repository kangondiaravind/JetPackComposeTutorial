package com.arra.JetPackComposeTutorial.Activities

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.arra.JetPackComposeTutorial.ui.theme.GreenJC

@Composable
fun PostScreen(){
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Text(text = "Post Screen", color = GreenJC, fontSize = 30.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PostScreenPreview(){
    PostScreen()
}