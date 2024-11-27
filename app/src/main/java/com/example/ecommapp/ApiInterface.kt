package com.example.ecommapp


import retrofit2.http.GET
import retrofit2.Call

interface ApiInterface {
    @GET("products")
    fun getProductData(): Call<MyData>
}