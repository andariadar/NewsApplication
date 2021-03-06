package com.andariadar.newsapplication.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MediaMetadata(
    val url: String? = ""
) : Parcelable