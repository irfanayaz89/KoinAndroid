package com.koinandroid.common.extensions


import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.koinandroid.R


fun AppCompatActivity.replaceFragment(fragment: Fragment) {

    supportFragmentManager.beginTransaction()
        .replace(R.id.container, fragment)
        .commit()
}