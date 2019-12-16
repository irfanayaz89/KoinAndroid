package com.koinandroid.common.imageLoader.service


import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

class ImageLoaderService(val context: Context) : ImageLoader {

    override fun loadImage(url: String, view: ImageView) {
        Glide.with(context).load(url).into(view)
    }
}