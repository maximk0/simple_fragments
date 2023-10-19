package com.example.simplefragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Command
import com.github.terrakok.cicerone.Replace
import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.AppNavigator
import java.lang.ref.WeakReference

class MainActivity : AppCompatActivity() {

    private val navigator = AppNavigator(this, R.id.fragment_container_view)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        App.application.getRouter.replaceScreen(Screens.A)
    }

    override fun onPause() {
        App.application.navigatorHolder.setNavigator(navigator)
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
        App.application.navigatorHolder.setNavigator(navigator)
    }

    override fun onBackPressed() {
        App.application.getRouter.exit()
    }

}
