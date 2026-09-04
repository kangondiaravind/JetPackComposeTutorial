package com.arra.JetPackComposeTutorial.Activities

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class DashBoard {


    @Composable
    fun showDashboard() {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(text = "DashBoard", color = Color.Green, fontSize = 30.sp)
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun showDashboardPreview() {
        showDashboard()
    }

}