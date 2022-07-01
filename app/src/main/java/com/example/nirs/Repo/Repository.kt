package com.example.nirs.Repo

import com.example.nirs.Model.Buffer
import com.example.nirs.Retro.RetrofitInstance
import retrofit2.Response


class Repository {

    suspend fun getProduct(title: String): Response<Buffer> {
        return RetrofitInstance.api.getProduct(title)
    }
}