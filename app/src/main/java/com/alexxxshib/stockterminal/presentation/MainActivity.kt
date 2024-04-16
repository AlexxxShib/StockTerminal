package com.alexxxshib.stockterminal.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.collectAsState
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
                        Terminal(
                            bars = currentState.barList
                        )
                    }
                }
            }
        }
    }
}