package com.raccoonsoftware.cryptowallet.api

import com.raccoonsoftware.cryptowallet.models.PriceData
import com.raccoonsoftware.cryptowallet.models.WalletData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Endpoints {

    @GET("/api/v3/ticker/24hr")
    fun getPrice(@Query("symbol") symbol: String?): Call<List<PriceData>>

    @GET("/sapi/v1/capital/config/getall")
    fun getCapital(@Query("timestamp") timestamp: Long, @Query("recvWindow") recvWindow: Long): Call<List<WalletData>>

}