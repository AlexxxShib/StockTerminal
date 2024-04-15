package com.alexxxshib.stockterminal.presentation

import com.alexxxshib.stockterminal.data.Bar

sealed class TerminalScreenState {

    data object Initial: TerminalScreenState()

    data class Content(val barList: List<Bar>): TerminalScreenState()
}