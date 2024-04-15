package com.alexxxshib.stockterminal.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.alexxxshib.stockterminal.ui.theme.StockTerminalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StockTerminalTheme {
                val viewModel: TerminalViewModel = viewModel()
                val screenState = viewModel.state.collectAsState()

                when(val currentState = screenState.value) {
                    is TerminalScreenState.Initial -> { }

                    is TerminalScreenState.Content -> {
                        Log.d("MainActivity", currentState.barList.joinToString { it.toString() })
                    }
                }
            }
        }
    }
}