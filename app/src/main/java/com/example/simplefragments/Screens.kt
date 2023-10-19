package com.example.simplefragments

import android.content.Intent
import android.net.Uri
import com.github.terrakok.cicerone.androidx.ActivityScreen
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {

    val A = FragmentScreen("AFragment") { AFragment.newInstance() }

    fun B() = FragmentScreen { BFragment.newInstance() }
    fun C(message: String) = FragmentScreen("С_$message") { CFragment.newInstance(message) }
    fun D() = FragmentScreen { DFragment.newInstance() }
}