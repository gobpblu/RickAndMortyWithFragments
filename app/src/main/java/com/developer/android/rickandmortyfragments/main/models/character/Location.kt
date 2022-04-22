package com.developer.android.rickandmortyfragments.main.models.character

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Location(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
) : Parcelable
