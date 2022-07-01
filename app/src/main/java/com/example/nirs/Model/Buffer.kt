package com.example.nirs.Model

import com.google.gson.annotations.SerializedName

data class Buffer(
    val data: Data,
    val metadata: Metadata,
    val state: Int,
    val version: Int
)