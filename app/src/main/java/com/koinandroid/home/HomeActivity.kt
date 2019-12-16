package com.koinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.koinandroid.common.extensions.replaceFragment
import com.koinandroid.home.HomeFragment

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {

            replaceFragment(HomeFragment.newInstance())
        }
    }
}
