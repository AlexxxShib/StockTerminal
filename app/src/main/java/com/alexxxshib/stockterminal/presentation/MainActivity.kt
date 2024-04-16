package com.alexxxshib.stockterminal.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.alexxxshib.stockterminal.ui.theme.StockTerminalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StockTerminalTheme {
                Terminal()
            }
        }
    }
}