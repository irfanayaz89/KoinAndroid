package com.koinandroid.home.modules

import com.koinandroid.home.HomeRepo
import com.koinandroid.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel

import org.koin.dsl.module

val homeViewModelModule = module {

    viewModel { HomeViewModel(get()) }
}

val homeRepoModule = module {

    single { HomeRepo(get()) }
}