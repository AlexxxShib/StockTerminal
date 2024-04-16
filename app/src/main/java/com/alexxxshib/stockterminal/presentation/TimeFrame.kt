package com.alexxxshib.stockterminal.presentation

enum class TimeFrame(val apiValue: String) {
    MIN_5("5/minute"),
    MIN_15("15/minute"),
    MIN_30("30/minute"),
    HOUR_1("1/hour")
}