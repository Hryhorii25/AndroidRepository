package com.example.myapplication

import com.google.gson.annotations.SerializedName

data class DataResult(
    @SerializedName("data") val res: List<DataObject>
)

data class DataObject(
    @SerializedName("images") val images: DataImage)


data class DataImage(
    @SerializedName("original") val  odImage:OdImage)

data class OdImage(
    val url: String)