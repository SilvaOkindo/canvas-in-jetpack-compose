package com.silva.canvas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.silva.canvas.ui.theme.CanvasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CanvasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    InstagramIcon()
                }
            }
        }
    }
}

@Preview
@Composable
fun InstagramIcon(){
    val instaColors = listOf(Color.Yellow, Color.Red, Color.Magenta)
    androidx.compose.foundation.Canvas(
        modifier = Modifier
            .size(100.dp)
            .padding(16.dp)
    ){
        drawRoundRect(
            brush = Brush.linearGradient(colors = instaColors),
            cornerRadius = CornerRadius(60f, 60f),
            style = Stroke(width = 15f, cap = StrokeCap.Round)
        )
        drawCircle(
            brush = Brush.linearGradient(colors = instaColors),
            radius = 45f,
            style = Stroke(width = 15f, cap = StrokeCap.Round)
        )
         drawCircle(
            brush = Brush.linearGradient(colors = instaColors),
            radius = 13f,
            center = Offset(this.size.width * .80f, this.size.height * 0.20f)
        )

    }
}


@Composable
fun GetWeatherApp(){
    
}