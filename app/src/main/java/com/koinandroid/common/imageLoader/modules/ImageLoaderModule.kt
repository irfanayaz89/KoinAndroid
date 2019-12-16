package com.koinandroid.common.imageLoader

import android.content.Context
import com.koinandroid.common.imageLoader.service.ImageLoader
import com.koinandroid.common.imageLoader.service.ImageLoaderService
import org.koin.dsl.module

val imageLoaderModule = module {

    fun getImageLoader(context: Context) : ImageLoader {
        return ImageLoaderService(context)
    }

    single { getImageLoader(get()) }
}