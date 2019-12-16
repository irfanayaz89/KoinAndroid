package com.koinandroid

import android.app.Application
import com.koinandroid.common.imageLoader.imageLoaderModule
import com.koinandroid.common.network.apiModule
import com.koinandroid.common.network.modules.retrofitModule
import com.koinandroid.home.modules.homeRepoModule
import com.koinandroid.home.modules.homeViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class KoinAndroidApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
//            androidLogger(Level.DEBUG)
            androidContext(this@KoinAndroidApp)
            modules(listOf(retrofitModule, apiModule, homeRepoModule, homeViewModelModule, imageLoaderModule))
        }
    }
}