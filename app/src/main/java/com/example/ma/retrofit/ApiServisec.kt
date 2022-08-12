package com.example.ma.retrofit

import com.example.ma.model.ResponseGame
import retrofit2.Call
import retrofit2.http.GET

interface ApiServisec {

    @GET("latestnews")
    fun getMorty(): Call<ResponseGame>


}