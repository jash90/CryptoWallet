package com.raccoonsoftware.cryptowallet.models


data class PriceData(
    val symbol: String,
    val priceChange: Double,
    val priceChangePercent: Double,
    val weightedAvgPrice: Double,
    val prevClosePrice: Double,
    val lastPrice: Double,
    val lastQty: Double,
    val bidPrice: Double,
    val bidQty: Double,
    val askPrice: Double,
    val askQty: Double,
    val openPrice: Double,
    val highPrice: Double,
    val lowPrice: Double,
    val volume: Double,
    val quoteVolume: Double,
    val openTime: Double,
    val closeTime: Double,
    val firstId: Double,
    val lastId: Double,
    val count: Double
)