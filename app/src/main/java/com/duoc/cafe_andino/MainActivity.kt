package com.duoc.cafe_andino

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.duoc.cafe_andino.ui.HomeScreen
import com.duoc.cafe_andino.ui.theme.Cafe_andinoTheme
import com.duoc.cafe_andino.ui.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            cafe_andinoTheme {
                HomeScreen()
            }
        }
    }
}