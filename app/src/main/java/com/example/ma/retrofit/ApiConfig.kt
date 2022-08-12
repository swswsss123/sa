package com.example.ma.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiConfig {

    //сборка РЕТРОФИТА
    const val BASE_URL = "https://www.mmobomb.com/api1/"

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getServise():ApiServisec{
        return getRetrofit().create(ApiServisec::class.java)
    }
}
