package com.raccoonsoftware.cryptowallet.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkService {
    private val client = OkHttpClient.Builder().in.build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://binance.com")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    fun<T> buildService(service: Class<T>): T{
        return retrofit.create(service)
    }
}