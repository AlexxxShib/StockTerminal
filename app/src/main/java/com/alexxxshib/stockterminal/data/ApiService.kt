package com.alexxxshib.stockterminal.data

import retrofit2.http.GET

interface ApiService {

    @GET("aggs/ticker/AAPL/range/1/day/2023-01-09/2024-01-09?adjusted=true&sort=desc&limit=50000&apiKey=PAQpZBCSqtNwaKIz_62VpVPMZ5wGOJy6")
    suspend fun loadBars(): Result
}