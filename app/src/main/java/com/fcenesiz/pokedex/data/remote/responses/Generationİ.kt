package com.fcenesiz.pokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Generation─░(
    @SerializedName("red-blue")
    val redBlue: RedBlue,
    @SerializedName("yellow")
    val yellow: Yellow
)