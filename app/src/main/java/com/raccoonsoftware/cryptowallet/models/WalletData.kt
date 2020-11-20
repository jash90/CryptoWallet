package com.raccoonsoftware.cryptowallet.models

data class WalletData(

    val coin : String,
    val depositAllEnable : Boolean,
    val free : Double,
    val freeze : Double,
    val ipoable : Double,
    val ipoing : Double,
    val isLegalMoney : Boolean,
    val locked : Double,
    val name : String,
    val networkList : List<NetworkList>,
    val storage : Double,
    val trading : Boolean,
    val withdrawAllEnable : Boolean,
    val withdrawing : Double
)