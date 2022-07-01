package com.example.nirs.Retro

import com.example.nirs.Model.Buffer
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface Api {

    @GET("search?appType=1&couponsGeo=12,3,18,15,21&curr=rub&dest=-1029256,-102269,-1278703,-1255563&emp=0&lang=ru&locale=ru&%20pricemarginCoeff=1.0&reg=0&regions=68,64,83,4,38,80,33,70,82,86,75,30,69,22,66,31,48,1,40,71&resultset=catalog&sort=popular&spp=0")
    suspend fun getProduct(@Query("query")title: String): Response<Buffer>

}