package com.koinandroid.common.imageLoader.service

import android.widget.ImageView

interface ImageLoader {

    fun loadImage(url: String, view: ImageView);
}