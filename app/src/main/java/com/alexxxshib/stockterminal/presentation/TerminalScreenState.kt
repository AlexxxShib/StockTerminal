package com.alexxxshib.stockterminal.presentation

import com.alexxxshib.stockterminal.data.Bar

sealed class TerminalScreenState {

    data object Initial: TerminalScreenState()

    data object Loading: TerminalScreenState()

    data class Content(
        val timeFrame: TimeFrame,
        val barList: List<Bar>
    ): TerminalScreenState()
}