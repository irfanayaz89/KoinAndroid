package com.koinandroid.common.network.modules

import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val retrofitModule = module {

    fun getGson() : Gson {

        return GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create()
    }

    fun getHttpClient() : OkHttpClient {

        val okHttpClient = OkHttpClient.Builder();
        return okHttpClient.build();
    }

    fun getRetrofit(factory: Gson, client: OkHttpClient) : Retrofit {

        return Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create(factory))
            .client(client)
            .build()
    }

    single { getGson() }
    single { getHttpClient() }
    single { getRetrofit(get(), get()) }
}