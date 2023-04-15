package com.mucahitdaglioglu.retrofitkotlin.model

import com.google.gson.annotations.SerializedName

data class CryptoModel(
    // @SerializedName("currency")
    val currency: String,
    // @SerializedName("price")
    val price: String
)
// değişkenlere apideki aynı ismi
// koyarsam serializzed gerek yok
