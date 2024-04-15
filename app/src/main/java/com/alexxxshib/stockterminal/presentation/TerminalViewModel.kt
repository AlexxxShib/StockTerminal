package com.alexxxshib.stockterminal.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alexxxshib.stockterminal.data.ApiFactory
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class TerminalViewModel: ViewModel() {

    private val apiService = ApiFactory.apiService

    private val _state = MutableStateFlow<TerminalScreenState>(TerminalScreenState.Initial)
    val state = _state.asStateFlow()

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        Log.d("TerminalViewModel", "Exception: $throwable")
    }

    init {
        loadBarList()
    }

    private fun loadBarList() {
        viewModelScope.launch {
            val result = apiService.loadBars()
            _state.value = TerminalScreenState.Content(result.barList)
        }
    }
}